<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Todos</title>

    <!-- Bootstrap -->
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesnt work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Todos</a>
        </div>
    </div>
</div>

<div class="container">
    <div class="main-app">
        <div class="row">
            <button id="add-todo-button" type="button" class="btn btn-primary" data-toggle="modal" data-target="#taskModal">Add</button>
            <%--<button id="edit-todo-button" type="button" class="btn btn-primary" data-toggle="modal" data-target="#taskModal">Edit</button>--%>
            <%--<button id="delete-todo-button" type="button" class="btn btn-danger" data-toggle="modal" data-target="#taskModal">Delete</button>--%>
        </div>
        <div class="row">
            <div id="todosTable">
                <table class='table table-hover'><thead><tr><th>Name</th><th>Description</th><th>Finished</th></tr></thead>
                    <tbody id="todosTableBody">
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div><!-- /.container -->

<div class="modal fade" id="taskModal" tabindex="-1" role="dialog" aria-labelledby="taskModal" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="taskModalLabel"><!-- Stuff goes here --></h4>
            </div>
            <div id="taskModalBody" class="modal-body">
                <!-- Stuff goes here -->
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="taskModalSubmitButton" type="button" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstraps JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>
</body>
</html>

