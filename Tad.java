
public class Tad implements InterfaceTad{
	//1- Crie um TAD para armazenar dados dos colegas de 
	//Estrutura de Dados: Nome, email, telefone.

	private String [] nome;
	private String email;
	private String telefone;



	public Tad(String[] nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public boolean AddNome (String nome) {

		return true;
	}
	public boolean AddEmail (String email) {

		return true;
	}
	public boolean AddTelefone (String telefone) {

		return true;
	}
}
