
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		this.soma += f.getBonificação();

	}

	public double getSoma() {
		return soma;
	}

}
