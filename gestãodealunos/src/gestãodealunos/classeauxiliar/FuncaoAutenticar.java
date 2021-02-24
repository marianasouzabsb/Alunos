package gestãodealunos.classeauxiliar;

import gestaodealunos.interfaces.PermitirAcesso;

public class FuncaoAutenticar { //class para receber apenas a classe com a interface
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar(){
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticar (PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
