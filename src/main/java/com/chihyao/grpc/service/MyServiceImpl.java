package com.chihyao.grpc.service;

import com.chihyao.grpc.Hello;
import com.chihyao.grpc.HelloServiceGrpc;
import com.chihyao.grpc.vo.RequestVO;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.badata.protobuf.converter.Converter;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class MyServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(Hello.HelloRequest request, StreamObserver<Empty> responseObserver) {
        RequestVO requestVO = Converter.create().toDomain(RequestVO.class, request);
        System.out.println(requestVO);
        System.out.println("success");
        super.sayHello(request, responseObserver);
    }
}
