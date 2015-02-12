<%@tag pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript" src="${ctx}/static/locale-select/LocalList.js"></script>
<label for="province" class="control-label">省份:</label><br/>
<select id="province" name="province">
</select><br/>
<label for="province" class="control-label">城市:</label><br/>
<select id="city" name="city">
</select><br/>
<label for="province" class="control-label">区域:</label><br/>
<select id="area" name="area">
</select><br/>
<script type="text/javascript">
	var options = {
		country: 'province',
		state: 'city',
		city: 'area',
		current: '',
		language: 'zh_cn',
		path_to_xml: '${ctx}/static/locale-select/data/china/',
		read_only: false	
	};
	LocalList.mf_init(options);
</script>
<%--
以标签形式作为省市联级选择。待完成默认值。
 --%>