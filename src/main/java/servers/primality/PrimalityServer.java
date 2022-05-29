package servers.primality;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimalityServer implements Runnable{
    private final Server server;
    private int port;

    public PrimalityServer(int port){
        this.port = port;
        this.server = ServerBuilder.
                forPort(port).
                executor(Executors.newCachedThreadPool()).
                addService(new PrimalityImpl()).
                build();
        Runtime.getRuntime().addShutdownHook(new Thread(PrimalityServer.this::stop));
    }

    @Override
    public void run() {
        try {
            this.server.start();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Server is listening on port "+port);
        try {
            waitForShutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        PrimalityServer server1 = new PrimalityServer(5051);
//        executorService.submit(server1);
//        PrimalityServer server2 = new PrimalityServer(5052);
//        executorService.submit(server2);

//        PrimalityServer server1 = new PrimalityServer(5051);
//        server1.run();
        PrimalityServer server2 = new PrimalityServer(5052);
        server2.run();
    }
}
