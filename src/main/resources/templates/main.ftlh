<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>


    <p>${springMacroRequestContext.getMessage("greeting")}</p>
    <@l.logout/>

<#--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>-->
<#--    <script type="text/javascript">-->
<#--        $(document).ready(function() {-->
<#--            $("#locales").change(function () {-->
<#--                var selectedOption = $('#locales').val();-->
<#--                if (selectedOption != ''){-->
<#--                    window.location.replace('/?lang=' + selectedOption);-->
<#--                }-->
<#--            });-->
<#--        });-->
<#--    </script>-->
</@c.page>
