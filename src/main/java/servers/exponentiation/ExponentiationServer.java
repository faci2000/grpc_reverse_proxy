package servers.exponentiation;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.Executors;

public class ExponentiationServer {
    private final Server server;

    public ExponentiationServer(int port){
        this.server = ServerBuilder.
                forPort(port).
                executor(Executors.newCachedThreadPool()).
                addService(new ExponentiationImpl()).
                build();
        Runtime.getRuntime().addShutdownHook(new Thread(ExponentiationServer.this::stop));
    }

    private void start() throws IOException {
        this.server.start();
        System.out.println("Server is listening on port 5053");
    }

    private void stop(){
        if(this.server != null){
            this.server.shutdown();
        }
    }

    private void waitForShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExponentiationServer server = new ExponentiationServer(5053);
        server.start();
        server.waitForShutdown();
    }
}
