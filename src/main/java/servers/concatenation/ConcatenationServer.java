package servers.concatenation;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.Executors;

public class ConcatenationServer {
    private final Server server;

    public ConcatenationServer(int port){
        this.server = ServerBuilder.
                forPort(port).
                executor(Executors.newCachedThreadPool()).
                addService(new ConcatenationImpl()).
                build();
        Runtime.getRuntime().addShutdownHook(new Thread(ConcatenationServer.this::stop));
    }

    private void start() throws IOException {
        this.server.start();
        System.out.println("Server is listening on port 5054");
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
        ConcatenationServer server = new ConcatenationServer(5054);
        server.start();
        server.waitForShutdown();
    }
}
