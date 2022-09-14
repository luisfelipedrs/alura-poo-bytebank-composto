public class TestaBanco {

    public static void main(String[] args) {
        Cliente pipe = new Cliente();
        pipe.nome = "Luis Felipe";
        pipe.cpf = "222.222.222-22";
        pipe.profissao = "programador";

        Conta contaDoPipe = new Conta();
        contaDoPipe.deposita(100);

        contaDoPipe.titular = pipe;
        System.out.println(contaDoPipe.titular.nome);
    }
}
