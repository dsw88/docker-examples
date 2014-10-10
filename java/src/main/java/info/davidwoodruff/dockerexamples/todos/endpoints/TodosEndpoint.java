
package info.davidwoodruff.dockerexamples.todos.endpoints;

import info.davidwoodruff.dockerexamples.todos.models.Todo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for Todos API endpoint
 */
@Path("/todos")
public class TodosEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<Todo>();
        todos.add(new Todo(1, "Buy milk", "At the grocery store", 0));
        todos.add(new Todo(2, "Pick up laundry", "At the dry cleaners", 0));
        return todos;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Todo getTodo(@PathParam("id") String id) {
        return new Todo(1, "Buy milk", "At the grocery store", 0);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteTodo(@PathParam("id") String id) {
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Todo newTodo(@QueryParam("name") String name,
                        @QueryParam("description") String description,
                        @QueryParam("finished") int finished) {
        return new Todo(1, name, description, finished);
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Todo updateTodo(@PathParam("id") String id,
                           @QueryParam("name") String name,
                           @QueryParam("description") String description,
                           @QueryParam("finished") int finished) {
        return new Todo(1, name, description, finished);
    }

}
