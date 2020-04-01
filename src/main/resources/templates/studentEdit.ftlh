<#import "parts/common.ftlh" as c>
<@c.page>


    <form method="post" action="/student/${userId}">
        <div><label<input type="hidden" value="${userId}"></div>
        <div><label>First name<input type="text" name="firstName" ></label></div>
        <div><label>Last name<input type="text" name="lastName" ></label></div>
        <div><label>Email<input type="text" name="email" ></label></div>
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>

        <div><input type="submit" value="Edit"/></div>


    </form>





</@c.page>