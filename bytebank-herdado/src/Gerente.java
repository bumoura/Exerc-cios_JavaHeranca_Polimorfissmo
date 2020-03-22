//Gerente � um funcionario. Gerente herda da classe Funcionario, assina o contrato autenticavel. � um autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public double getBonifica��o() {
		System.out.println("Chamando m�todo de bonifica��o GERENTE");
		return  super.getSalario();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}

	}

   
	
