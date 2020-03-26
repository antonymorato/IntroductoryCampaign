<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>


<@c.page>

    Add new student
<#--    <p>${message?if_exists}</p>-->
    <form action="/registration/student" method="post">
        <div><label>${springMacroRequestContext.getMessage("login")}<input type="text" name="username"/> </label></div>
        <div><label> ${springMacroRequestContext.getMessage("password")}<input type="password" name="password"/> </label></div>
        <#--        <input type="hidden" name="_csrf" value="${_csrf.token}"/>-->

        <div><label><input type="text" name="adminCode"></label></div>




        <div><input type="submit" value="${springMacroRequestContext.getMessage("reg")}"/></div>
    </form>

</@c.page>