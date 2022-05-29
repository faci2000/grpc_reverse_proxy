package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import services.concatenation.ConcatenationGrpc;
import services.concatenation.ConcatenationRequest;
import services.exponentiation.ExponentiationGrpc;
import services.exponentiation.ExponentiationRequest;
import services.primality.IsPrimeRequest;
import services.primality.PrimalityGrpc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Client {
    private final ManagedChannel channel;
    private final PrimalityGrpc.PrimalityBlockingStub primalityBlockingStub;
    private final ConcatenationGrpc.ConcatenationBlockingStub concatenationBlockingStub;
    private final ExponentiationGrpc.ExponentiationBlockingStub exponentiationBlockingStub;


    private final Scanner scanner;
    private boolean running;

    public Client(String proxyAddress, int proxyPort){
        this.channel = ManagedChannelBuilder.forAddress(proxyAddress, proxyPort).usePlaintext().build();
        this.primalityBlockingStub = PrimalityGrpc.newBlockingStub(this.channel);
        this.concatenationBlockingStub = ConcatenationGrpc.newBlockingStub(this.channel);
        this.exponentiationBlockingStub = ExponentiationGrpc.newBlockingStub(this.channel);
        this.scanner = new Scanner(System.in);
        this.running = true;
    }

    public void runApp() throws InterruptedException {
        System.out.println("""
                Checking primality: prime <number>
                Concatenation: concat <textA> <textB>
                Exponentiation: exp <number>
                """);
        while(this.running) {
            try {
                System.out.print("> ");
                String[] line = this.scanner.nextLine().strip().split(" ");
                if (line[0].equals("prime")) {
                    boolean isPrime = this.primalityBlockingStub
                            .checkIfNumberIsPrime(
                                    IsPrimeRequest.newBuilder().
                                            setNumber(Integer.parseInt(line[1])).
                                            build())
                            .getIsPrime();
                    System.out.println(line[1] + " is " + (isPrime ? "prime." : "not prime."));
                } else if (line[0].equals("concat")) {
                    String concatenatedText = this.concatenationBlockingStub
                            .concatenate(
                                    ConcatenationRequest.newBuilder().
                                            setTextA(line[1]).
                                            setTextB(line[2]).
                                            build())
                            .getConcatenatedText();
                    System.out.println("Concatenated: " + concatenatedText);
                } else if (line[0].equals("exp")) {
                    long exp = this.exponentiationBlockingStub
                            .exponentiate(
                                    ExponentiationRequest.newBuilder().
                                            setNumber(Integer.parseInt(line[1])).
                                            build())
                            .getNext();
                    System.out.println(line[1] + "^2 = " + exp);
                } else if (line.length == 1 && line[0].equals("quit")) {
                    this.running = false;
                } else {
                    System.out.println("Invalid command.");
                }
            }catch (Exception e){
                System.out.println("Invalid command syntax.");
                e.printStackTrace();
            }
        }
        this.channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        Client client = new Client("127.0.0.1", 5050);
        client.runApp();
    }
}
