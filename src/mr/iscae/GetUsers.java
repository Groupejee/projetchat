package mr.iscae;


import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/u")
@Produces("application/json")
public class GetUsers {
	static int id = 0;

	@GET
	public Map<Integer, Utilisateur> getUsers() {
		return Donne.Utilisateurs;
	}

	@PUT
	public void addUser(@QueryParam("nom") String nom, @QueryParam("prenom") String prenom,
			@QueryParam("login") String login, @QueryParam("motDePasse") String motDePasse) {
		Donne.Utilisateurs.put(id++, new Utilisateur(nom, prenom, login, motDePasse));

	}

}
