$(document).ready(function(){
    $.get("api/todos", function(data) {
        var todos = data;
        var html = "";
        for( i = 0; i < todos.length; i++ ) {
            html += "<tr><td>";
            html += todos[i].name;
            html += "</td><td>";
            html += todos[i].description;
            html += "</td><td>";
            html += todos[i].finished;
            html += "</td></tr>"
        }
        $("#todosTableBody").html(html);
    });

    /**
     * Event handler for "Add" button
     */
    $( "#add-todo-button" ).click(function() {
        var formHtml = '<form class="form-horizontal" role="form">' +
                       '<div class="form-group">' +
                       '  <label for="taskName">Task Name</label>' +
                       '  <input id="taskName" type="text" class="form-control" placeholder="Task Name">' +
                       '</div>' +
                       '<div class="form-group">' +
                       '  <label for="taskDescription">Task Description</label>' +
                       '  <textarea id="taskDescription" class="form-control" rows="3"></textarea>' +
                       '</div>' +
                       '<div class="checkbox">' +
                       '  <label>' +
                       '    <input type="checkbox" id="taskFinished" value="taskFinished"> Finished' +
                       '  </label>' +
                       '</div>' +
                       '</form>';

        $("#taskModalBody").html(formHtml);
        $("#taskModalLabel").html("Add Task");
    });

    /**
     * Event handler for "Edit" button
     */
    $( "#edit-todo-button" ).click(function() {
        //Get variables from Table
        var formHtml = "TO BE IMPLEMENTED";
//        var formHtml = '<form class="form-horizontal" role="form">' +
//                       '<div class="form-group">' +
//                       '  <label for="taskName">Task Name</label>' +
//                       '  <input id="taskName" type="text" class="form-control" placeholder="Task Name">' +
//                       '</div>' +
//                       '<div class="form-group">' +
//                       '  <label for="taskDescription">Task Description</label>' +
//                       '  <textarea id="taskDescription" class="form-control" rows="3"></textarea>' +
//                       '</div>' +
//                       '<div class="checkbox">' +
//                       '  <label>' +
//                       '    <input type="checkbox" id="taskFinished" value="taskFinished"> Finished' +
//                       '  </label>' +
//                       '</div>' +
//                       '</form>';

        $("#taskModalBody").html(formHtml);
        $("#taskModalLabel").html("Edit Task");
    });

    /**
     * Event handler for "Delete" button
     */
    $( "#delete-todo-button" ).click(function() {
        var formHtml = "TO BE IMPLEMENTED";
//        var html = '<div>' +
//                   ' <p>Are you sure you want to delete this task?</p>';
//                   '</div>';

        $("#taskModalBody").html(html);
        $("#taskModalLabel").html("Delete Task");
    });

    /**
     * Event handler for Modal submit button
     */
    $("#taskModalSubmitButton").click(function() {
        var taskType = $("#taskModalLabel").html();
        if(taskType === "Add Task") {
            var taskName = $("#taskName").val();
            var taskDescription = $("#taskDescription").val();
            var taskFinished = $("#taskFinished").prop("checked") ? 1 : 0;
            var url = "api/todos?name=" + encodeURI(taskName) + "&description=" + encodeURI(taskDescription) + "&finished=" + taskFinished;
            $.post(url, function(data) {
                var html = '<tr id="' + data.id + '"><td>';
                html += data.name;
                html += "</td><td>";
                html += data.description;
                html += "</td><td>";
                html += data.finished;
                html += "</td></tr>";
                $("#todosTableBody").append(html);
            });
            $('#taskModal').modal('hide');
        }
        else if(taskType === "Edit Task") {

        }
        else if(taskType === "Delete Task") {

        }
        else {
            console.log("Incorrect task type in Task Modal");
        }
    });

});

