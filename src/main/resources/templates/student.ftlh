<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>


    <p>
        Student page
    </p>
    <@l.logout/>
    <p>${user.id?if_exists}</p>
    <div><label><a href="/student/${user.id}"> Edit info</a> </label></div>
    <p>Rating:${rating?if_exists}</p>



</@c.page>