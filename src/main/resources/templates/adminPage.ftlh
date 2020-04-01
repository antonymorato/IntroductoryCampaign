<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>
    <p>Admin page</p>
    <@l.logout/>

    List of users
    <table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <#list students as student>
        <tr>
            <td>${student.firstName}</td>
            <td>${student.lastName}</td>
            <td><a href="/user/${student.id}">Edit</a> </td>

        </tr>

    </#list>
    </tbody>




</@c.page>