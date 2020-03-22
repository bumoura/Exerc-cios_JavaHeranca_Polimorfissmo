
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente  g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		
		EditorVideo ed = new EditorVideo();
		ed.setNome("Alice");
		ed.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setNome("Ana Paula");
		d.setSalario(3000.00);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ed);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
