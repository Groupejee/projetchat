package mr.iscae;

import java.util.Map; 

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/mama")
public class GetMessage {
	private static int id = 0;

	@GET
	public Map<Integer, Message> getMessages(@QueryParam("idRecpteur") int idRecpteur) {
		return Message.getMessages(idRecpteur);
	}

	@PUT
	public void addUser(@QueryParam("contenu") String contenu, @QueryParam("idEmetteur") int idEmetteur,
			@QueryParam("idRecpteur") int idRecpteur) {

		Donne.Messages.put(id++, new Message (contenu, id, idRecpteur));

	}}

