package servers.primality;

import io.grpc.stub.StreamObserver;
import services.primality.IsPrimeRequest;
import services.primality.IsPrimeResponse;
import services.primality.PrimalityGrpc;

public class PrimalityImpl extends PrimalityGrpc.PrimalityImplBase {
    @Override
    public void checkIfNumberIsPrime(IsPrimeRequest request, StreamObserver<IsPrimeResponse> responseObserver){
        System.out.println("REQUEST: primality - started");
        responseObserver.onNext(IsPrimeResponse.newBuilder().setIsPrime(request.getNumber() == 15).build());
        responseObserver.onCompleted();
        System.out.println("REQUEST: primality - finished");
    }
}
