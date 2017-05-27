<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3" xmlns="http://www.w3.org/1999/html">
<body>
<div>
<#--<#list alldemo>-->
    <#--<ul>-->
    <#--<#items as dem>-->
    <#--id:${dem.Id}  properties01:${dem.PropertiesOne}  properties02:${dem.PropertiesTwo}-->
    <#--<br/>-->
    <#--</#items>-->
    <#--</ul>-->
<#--</#list>-->

<#if str??>
${str}
</#if>
</div>

<div>
    用户登录表单
    <form action="/demoCommit" method="post">
        name: <input type="text" name="param.name"><br/>
        pass: <input type="password" name="param.password"><br/>
        date:<input type="date" name="param.time"/><br/>
        resource01:<input type="text" name="param.resources[0]"><br/>
        resource02:<input type="text" name="param.resources[1]"><br/>
        <input type="submit">
    </form>
</div>
</body>
</html>