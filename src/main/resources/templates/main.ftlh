<#import "parts/common.ftlh" as c>
<@c.page>


    <p>${springMacroRequestContext.getMessage("greeting")}</p>

<a href="/access">To logind page</a>


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
