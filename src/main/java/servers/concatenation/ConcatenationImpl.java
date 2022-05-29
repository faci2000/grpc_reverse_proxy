package servers.concatenation;

import io.grpc.stub.StreamObserver;
import services.concatenation.ConcatenationGrpc;
import services.concatenation.ConcatenationRequest;
import services.concatenation.ConcatenationResponse;
import services.primality.IsPrimeRequest;
import services.primality.IsPrimeResponse;
import services.primality.PrimalityGrpc;

public class ConcatenationImpl extends ConcatenationGrpc.ConcatenationImplBase {
    @Override
    public void concatenate(ConcatenationRequest request, StreamObserver<ConcatenationResponse> responseObserver){
        System.out.println("REQUEST: concatenate - started");
        responseObserver.onNext(ConcatenationResponse.newBuilder().setConcatenatedText(request.getTextA()+request.getTextB()).build());
        responseObserver.onCompleted();
        System.out.println("REQUEST: concatenate - finished");
    }
}
