
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		this.soma  += f.getBonifica��o();
		
	}
	
	
	public double getSoma() {
		return soma;
	}

}
