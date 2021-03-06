package com.huake.edu.service.images;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.huake.base.ServiceException;
import com.huake.edu.base.Constants;
import com.huake.edu.entity.Photo;
import com.huake.edu.repository.PhotoDao;

/**
 * 图片上传服务：保存图片、裁减图片
 * @author skylai
 *
 */
@Component
public class ImageUploadService {

	private Logger logger = LoggerFactory.getLogger(ImageUploadService.class);
	
	@Autowired
	private PhotoDao photoDao;
	
	@Value("#{envProps.app_images_path}")
	private String filePath;
	/**
	 * 存储图片文件，并裁减
	 * @param file
	 * @param subDir
	 * @param compress
	 * @return 路径及文件名
	 * @throws ServiceException
	 */
	public List<Photo> saveImage(CommonsMultipartFile file, String subDir, Compress...compress) throws ServiceException{
		List<Photo> photos = new ArrayList<Photo>();
    	StringBuffer sb = new StringBuffer();
    	StringBuffer extPath = new StringBuffer();
    	extPath.append("/").append(subDir).append("/").append(generateDistPathEnd());
    	sb.append(filePath).append(extPath);
    	File saveFile = new File(sb.toString());
        if (!saveFile.exists()) {
            saveFile.mkdirs();
        }
        try{
        	StringBuffer extention = new StringBuffer(getOriginFileExtention(file));
            StringBuffer fullPath = new StringBuffer(extPath.toString()).append("/").append(generateDistName()).append(".").append(extention);
            StringBuffer fullPathString = new StringBuffer();
            fullPathString.append(filePath).append(fullPath.toString());
            Photo originPhoto = new Photo();
            originPhoto.setPath(fullPath.toString());
            originPhoto.setFileType(Constants.PHOTO_ORIGIN);
            photos.add(originPhoto);
            FileOutputStream fos = new FileOutputStream(new File( fullPathString.toString()));
            IOUtils.copy(file.getInputStream(), fos);
            try{
                fos.close();
            }catch(Exception e){

            }
            for(Compress comp : compress){
            	StringBuffer compFilePath = new StringBuffer();
            	compFilePath.append(extPath.toString()).append("/").append(generateDistName()).append("_").append(comp.getName()).append(".").append(extention);
            	Thumbnails.of(fullPathString.toString()).size(comp.getWidth(), comp.getHeight()).toFile(new StringBuffer().append(filePath).append(compFilePath.toString()).toString());
            	Photo comPressPhoto = new Photo();
            	comPressPhoto.setFileType(comp.getName());
            	comPressPhoto.setPath(compFilePath.toString());
            	photos.add(comPressPhoto);
            }
            
    	}catch(Exception e){
    		logger.error("上传文件异常：", e);
            throw new ServiceException("upload Exception:", e);
    	}
		return photos;
	}
	/**
	 * 生成文件名及目录
	 * @return
	 */
	private  String generateDistPathEnd(){
		Calendar cal = Calendar.getInstance();
        Integer year = cal.get(Calendar.YEAR);
        Integer month = cal.get(Calendar.MONTH) + 1;
        Integer day = cal.get(Calendar.DAY_OF_MONTH);
        String distPathEnd = year + "/" + month + "/" + day;
        return distPathEnd;
	}
	
	/**
	 * 生成文件名
	 * @return
	 */
	private  String generateDistName(){
		Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Integer year = cal.get(Calendar.YEAR);
        Integer month = cal.get(Calendar.MONTH) + 1;
        Integer day = cal.get(Calendar.DAY_OF_MONTH);
		String name = year + "_" + month + "_" + day + "_" + date.getTime();
		return name;
	}
	
	/**
	 * 获取原始文件的扩展名
	 * @param file
	 * @return
	 */
	private String getOriginFileExtention(CommonsMultipartFile file){
		return file.getOriginalFilename().split("\\.")[file.getOriginalFilename().split("\\.").length - 1];
	}
}
