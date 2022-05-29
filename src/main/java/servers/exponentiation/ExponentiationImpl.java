package servers.exponentiation;

import io.grpc.stub.StreamObserver;
import services.exponentiation.ExponentiationGrpc;
import services.exponentiation.ExponentiationRequest;
import services.exponentiation.ExponentiationResponse;
import services.primality.IsPrimeRequest;
import services.primality.IsPrimeResponse;
import services.primality.PrimalityGrpc;

public class ExponentiationImpl extends ExponentiationGrpc.ExponentiationImplBase {
    @Override
    public void exponentiate(ExponentiationRequest request, StreamObserver<ExponentiationResponse> responseObserver){
        System.out.println("REQUEST: exponentiation - started");
        responseObserver.onNext(ExponentiationResponse.newBuilder().setNext((long)request.getNumber() * request.getNumber()).build());
        responseObserver.onCompleted();
        System.out.println("REQUEST: exponentiation - finished");
    }
}
