public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario novaes1 = new Funcionario();
        
        novaes1.setCpf("888.666.555-89");
        novaes1.setNome("Novaes");
        novaes1.setSalario(3569.55);
        
        System.out.println(novaes1.getNome());
        System.out.println(novaes1.getCpf());
        System.out.println(novaes1.getSalario());
        System.out.println(novaes1.getBonificacao());
    }
}
