
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">ST-COM</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/" >${springMacroRequestContext.getMessage("main")}<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/registration">${springMacroRequestContext.getMessage("reg")}<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/login">${springMacroRequestContext.getMessage("log")}<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <select id="locales" class="nav-link" >
                    <option value="">${springMacroRequestContext.getMessage("lang.change")}</option>
                    <option value="ru" >${springMacroRequestContext.getMessage("lang.ru")}</option>
                    <option value="en" >${springMacroRequestContext.getMessage("lang.eng")}</option>

                </select>
            </li>

        </ul>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#locales").change(function () {
                var selectedOption = $('#locales').val();
                if (selectedOption != ''){
                    window.location.replace('/?lang=' + selectedOption);
                }
            });
        });
    </script>
</nav>