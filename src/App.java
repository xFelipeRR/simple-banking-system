import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import cliente.Black;
import cliente.Cliente;
import cliente.Gold;
import cliente.Platinum;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaDeposito;
import conta.ContaPoupança;
import conta.ContaSalário;

public class App {
    public static void main(String[] args) throws Exception {
        String classe = null;
        String tipoConta = null;
        String nome = null;
        String cpf = null;
        String email = null;
        int renda = 0;
        int tempoFidelidade = 0;
        boolean upgrade = false;
        Cliente cliente = null;
        Conta conta = null;
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Ler o arquivo de entrada
        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Scanner scanner = new Scanner(fileReader);

            
            // Pegar variáveis de entrada do arquivo
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");
                String attribute = parts[0].trim();
                String value = parts[1].trim();

                switch (attribute) {
                    case "Classe":
                        classe = value;
                        break;
                    case "TipoConta":
                        tipoConta = value;
                        break;
                    case "Nome":
                        nome = value;
                        break;
                    case "CPF":
                        cpf = value;
                        break;
                    case "Email":
                        email = value;
                        break;
                    case "Renda":
                        renda = Integer.parseInt(value);
                        break;
                    case "Tempo de Fidelidade":
                        tempoFidelidade = Integer.parseInt(value);
                        break;
                    case "Upgrade":
                        upgrade = Boolean.parseBoolean(value);
                        break;
                }
            }

            if(classe.equals("Gold")){
                cliente = new Gold(nome, cpf, email, renda, tempoFidelidade, upgrade);
            }
            else if(classe.equals("Platinum")) {
                cliente = new Platinum(nome, cpf, email, renda, tempoFidelidade, upgrade);
            }
            else {
                cliente = new Black(nome, cpf, email, renda, tempoFidelidade, upgrade);
            }


            if(tipoConta.equals("Corrente")) {
                conta = new ContaCorrente("29345", "01", cliente, 3000);
            }
            else if(tipoConta.equals("Deposito")){
                conta = new ContaDeposito("29345", "01", cliente, 3000);
            }
            else if(tipoConta.equals("Poupanca")){
                conta = new ContaPoupança("29345", "01", cliente, 3000);
            }
            else {
                conta = new ContaSalário("29345", "01", cliente, 3000);
            }
           // Imprimir as informações da instância do cliente
           
           System.out.println(
                "------------------------- Cliente criado de acordo com arquivo: -------------------------"+"\n" 
                + "Cliente:" +
                cliente.getNome()+"\n" 
                + "Classe:" +
                classe+"\n" 
                + "CPF: " + 
                cliente.getCpf()+"\n" 
                + "Email: " +
                cliente.getEmail()+"\n" 
                + "Renda: " +
                cliente.getRenda()+"\n" 
                + "Tempo de Fidelidade: " +
                cliente.getTempoFidelidade()+"\n \n" 
           );

           System.out.println(
                "------------------------- Conta criada: -------------------------"+"\n" 
                +"Tipo de Conta: "
                +tipoConta+"\n"
                + "Conta: " +
                conta.getConta()+"\n" 
                + "Agencia: " +
                conta.getAgencia()+"\n" 
                + "Cliente da Conta: " + 
                conta.getCliente()+"\n" 
                + "Saldo Inicial da Conta: " +
                conta.getSaldo()+"\n" 
           );

            // Informar o que o input.txt contém
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Imprime cada linha na saída padrão
            }

            bufferedReader.close();

        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        // Escrever as informações do novo cliente no arquivo de saída
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("------------ CLIENTE ------------");
            bufferedWriter.newLine();
            bufferedWriter.newLine();

            bufferedWriter.write("Classe = "+classe);
            bufferedWriter.newLine();
            bufferedWriter.write("Nome = "+cliente.getNome());
            bufferedWriter.newLine();
            bufferedWriter.write("CPF = "+cliente.getCpf());
            bufferedWriter.newLine();
            bufferedWriter.write("Email = "+cliente.getEmail());
            bufferedWriter.newLine();
            bufferedWriter.write("Renda = "+ cliente.getRenda());
            bufferedWriter.newLine();
            bufferedWriter.write("Tempo de Fidelidade = "+cliente.getTempoFidelidade()+"\n\n");

            bufferedWriter.newLine();
            bufferedWriter.newLine();

            bufferedWriter.write("------------ CONTA ------------");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("Conta = "+conta.getConta());
            bufferedWriter.newLine();
            bufferedWriter.write("Agencia = "+conta.getAgencia());
            bufferedWriter.newLine();
            bufferedWriter.write("Cliente = "+conta.getCliente());
            bufferedWriter.newLine();
            bufferedWriter.write("Saldo Inicial = "+conta.getSaldo()+"\n\n");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(classe.equals("Gold")){
            Cliente clienteUpgrade = cliente.pedirUpgrade();
            Platinum platinumCliente = new Platinum(clienteUpgrade.getNome(),  clienteUpgrade.getCpf(), clienteUpgrade.getEmail(), clienteUpgrade.getRenda(), clienteUpgrade.getTempoFidelidade(), true);

            System.out.println(
                "------------------------- UPGRADE ------------------------- \n"+
                "Parábens: "+platinumCliente.getNome()+", agora você é um cliente Platinum!"+"\n" 
                +"Confira seus novos dados: "+"\n"
                + "Cliente:" +
                platinumCliente.getNome()+"\n" 
                + "Classe:" +
                platinumCliente.getClass()+"\n" 
                + "CPF: " + 
                platinumCliente.getCpf()+"\n" 
                + "Email: " +
                platinumCliente.getEmail()+"\n" 
                + "Renda: " +
                platinumCliente.getRenda()+"\n" 
                + "Tempo de Fidelidade: " +
                platinumCliente.getTempoFidelidade()+"\n\n" 
            );
        }
        else if(classe.equals("Platinum")) {
            Cliente clienteUpgrade = cliente.pedirUpgrade();
            Black blackCliente = new Black(clienteUpgrade.getNome(),  clienteUpgrade.getCpf(), clienteUpgrade.getEmail(), clienteUpgrade.getRenda(), clienteUpgrade.getTempoFidelidade(), true);

            System.out.println(
                "------------------------- UPGRADE -------------------------\n"+
                "Parábens: "+blackCliente.getNome()+", agora você é um cliente Black!"+"\n" 
                +"Confira seus novos dados: "+"\n"
                + "Cliente:" +
                blackCliente.getNome()+"\n" 
                + "Classe:" +
                blackCliente.getClass()+"\n" 
                + "CPF: " + 
                blackCliente.getCpf()+"\n" 
                + "Email: " +
                blackCliente.getEmail()+"\n" 
                + "Renda: " +
                blackCliente.getRenda()+"\n" 
                + "Tempo de Fidelidade: " +
                blackCliente.getTempoFidelidade()+"\n" 
            );
        }
        else {
            System.out.println(
                "------------------------- UPGRADE -------------------------\n"+
                "Você já possui o nível máximo de hierarquia (Black) entre os nossos clientes \n"
            );
        }
        
        

        //Gold cliente2 = new Gold("Rafael", "066164589712", "teste@gmail.com", 10000, 4, false);
        //Gold cliente2 = new Gold("Felipe", "4567", "teste@gmail.com", 10000, 2, false);

        //Platinum platinumCliente1 = cliente1.pedirUpgrade();
        //System.out.println(platinumCliente1.getNome());


        //Platinum cliente1 = new Platinum("Rafael", "41245", "teste@gmail.com", 14000, 6, false);
        //Platinum cliente2 = new Platinum("Felipe", "56421", "teste@gmail.com", 10000, 2, false);

        //Black blackCliente1 = cliente1.pedirUpgrade();

        System.out.println(conta.depositar(200));
        System.out.println(conta.sacar(400));
        System.out.println(conta.sacar(500));
        System.out.println(conta.depositar(100));
        conta.consultarExtrato();
    }
}
