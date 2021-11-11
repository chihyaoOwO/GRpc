package com.chihyao.grpc.vo;

import com.chihyao.grpc.Hello;
import com.chihyao.grpc.converter.SexConverter;
import lombok.*;
import net.badata.protobuf.converter.annotation.ProtoClass;
import net.badata.protobuf.converter.annotation.ProtoField;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ProtoClass(Hello.HelloRequest.class)
public class RequestVO {

    @ProtoField(name = "name")
    private String name;
    @ProtoField(name = "age")
    private String age;
    @ProtoField(name = "sex" ,converter = SexConverter.class)
    private Sex sex;

    @Getter
    @AllArgsConstructor
    public enum Sex {
        BOY(0),
        GIRL(1);

        private Integer type;

        public static final Sex lookup(Integer type) {
            if (type != null) {
                for (Sex s : Sex.values()) {
                    if (s.getType().equals(type)) {
                        return s;
                    }
                }
            }
            return null;
        }
    }
}
