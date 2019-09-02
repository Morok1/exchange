package com.smagin.exchange.exchange.converters;

import com.smagin.exchange.exchange.converters.api.Converter;
import com.smagin.exchange.exchange.model.User;
import com.smagin.exchange.exchange.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<User, UserDto> {
    @Override
    public UserDto convert(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }
}
