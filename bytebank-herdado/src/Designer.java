//Gerente é um funcionario. Gerente herda da classe Funcionario
public class Designer extends Funcionario {

	public double getBonificação() {
		System.out.println("Chamando método de bonificação DESIGNER");
		return 200;
	}

}
