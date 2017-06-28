<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3" xmlns="http://www.w3.org/1999/html">
<body>
<div>
<#list alldemo>
    <ul>
    <#items as dem>
    id:${dem.Id}  properties01:${dem.PropertiesOne}  properties02:${dem.PropertiesTwo}
    <br/>
    </#items>
    </ul>
</#list>

</body>
</html>