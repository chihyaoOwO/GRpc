package com.chihyao.grpc.converter;

import com.chihyao.grpc.Hello;
import com.chihyao.grpc.vo.RequestVO;
import net.badata.protobuf.converter.type.TypeConverter;

public class SexConverter implements TypeConverter<RequestVO.Sex, Hello.Sex> {
    @Override
    public RequestVO.Sex toDomainValue(Object o) {
        Hello.Sex sex = (Hello.Sex) o;
        return RequestVO.Sex.lookup(sex.getNumber());
    }

    @Override
    public Hello.Sex toProtobufValue(Object o) {
        Hello.Sex sex = null;
        if (o.toString().equals(RequestVO.Sex.BOY.name())) {
            sex = Hello.Sex.BOY;
        }
        if (o.toString().equals(RequestVO.Sex.GIRL.name())) {
            sex = Hello.Sex.GIRL;
        }
        return sex;
    }
}
