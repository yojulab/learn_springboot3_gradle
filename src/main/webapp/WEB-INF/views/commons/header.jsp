<!-- Menu -->
<form>
    <nav class="navbar navbar-expand-lg bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Logo</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <button class="nav-link" formaction="/home">Home</button>
                    </li>
                    <li class="nav-item">
                        <button class="nav-link" formaction="/admin">Admin</button>
                    </li>
                    <li class="nav-item">
                        <button class="nav-link" formaction="/manager/read">Manager/read</button>
                    </li>
                </ul>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <button class="nav-link" formaction="/joinForm">joinForm</button>
                </li>
                <li>
                    <button class="nav-link" formaction="/loginForm">login Form</button>
                </li>
                <li>
                    <button class="nav-link" formaction="/logoutForm">logout Form</button>
                </li>
              </ul>
        </div>
    </nav>
</form>