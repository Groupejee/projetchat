package mr.iscae;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Message {
	private String contenu;
	private String dateEnvoi;
	private boolean vue = false;
	private int idEmetteur;
	private int idRecpteur;
	
	public Message(String contenu, int idEmetteur, int idRecpteur) {
		this.contenu = contenu;
		this.setDateEnvoi();
		this.idEmetteur = idEmetteur;
		this.idRecpteur = idRecpteur;
			// TODO Auto-generated constructor stub
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.dateEnvoi = dateFormat.format(date);
	}

	public boolean isVue() {
		return vue;
	}

	public void setVue(boolean vue) {
		this.vue = vue;
	}

	public int getIdEmetteur() {
		return idEmetteur;
	}

	public void setIdEmetteur(int idEmetteur) {
		this.idEmetteur = idEmetteur;
	}

	public int getIdRecpteur() {
		return idRecpteur;
	}

	public void setIdRecpteur(int idRecpteur) {
		this.idRecpteur = idRecpteur;
	}

	public static  Map<Integer, Message> getMessages(int idRecpteur) {
		
		Map<Integer, Message> messages = new HashMap<Integer, Message>();
		Iterator<Map.Entry<Integer, Message>> entries = Donne.Messages.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Message> entry = entries.next();
			if (entry.getValue().getIdRecpteur() == idRecpteur) {
				entry.getValue().setVue(true);
				messages.put(entry.getKey(), entry.getValue());
			}
		}
		return messages;
	}

}
	

	


