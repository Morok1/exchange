package com.smagin.exchange.exchange.converters.api;

public interface Converter<S, D> {
    D convert(S s);
}
