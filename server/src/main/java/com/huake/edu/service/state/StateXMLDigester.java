package com.huake.edu.service.state;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.digester3.Digester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import com.huake.edu.entity.City;
import com.huake.edu.entity.CountryRegion;
import com.huake.edu.entity.Location;
import com.huake.edu.entity.State;

/**
 * 行政区域映射服务，来自于XML数据
 * @author skylai
 *
 */
@Component
public class StateXMLDigester {

	private static Logger logger = LoggerFactory.getLogger(StateXMLDigester.class);
	
	private Digester digester = new Digester();
	private Location location = new Location();
	
	/**
	 * 初始化BEAN，使用Apache Commons Digester 3.2 映射XML作为Bean
	 * @throws SAXException 
	 * @throws IOException 
	 */
	@PostConstruct
	public void init() throws IOException, SAXException{
		logger.info("load state xml data to Location Bean...");
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("LocalList-zh_cn.xml");
		digester.push(location);
		digester.setValidating(false);
		digester.addObjectCreate("Location", Location.class);
		digester.addObjectCreate("Location/CountryRegion", CountryRegion.class);
		digester.addSetProperties("Location/CountryRegion", "Name", "name");
		digester.addSetProperties("Location/CountryRegion", "Code", "code");
		digester.addObjectCreate("Location/CountryRegion/State", State.class);
		digester.addSetProperties("Location/CountryRegion/State", "Name", "name");
		digester.addSetProperties("Location/CountryRegion/State", "Code", "code");
		digester.addObjectCreate("Location/CountryRegion/State/City", City.class);
		digester.addSetProperties("Location/CountryRegion/State/City", "Name", "name");
		digester.addSetProperties("Location/CountryRegion/State/City", "Code", "code");
		//digester.addSetNext("Location/CountryRegion","countryRegions");
		digester.parse(is);
	}
	
	@PreDestroy
	public void destroy(){
		
	}

	public Location getLocation() {
		return location;
	}
	
	
}
