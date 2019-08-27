package com.smagin.exchange.exchange.converters;

public interface Converter<S, D> {
    D convert(S s);
}
