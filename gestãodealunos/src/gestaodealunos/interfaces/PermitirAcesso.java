package gestaodealunos.interfaces;

public interface PermitirAcesso {
	
	/*public boolean autenticar(); Apenas a declaração do metodo*/
	public boolean autenticar(String login, String senha);
	public boolean autenticar();

}
