package com.example.newAssignment.transformer;

import com.example.newAssignment.dto.UserRequestDto;
import com.example.newAssignment.dto.response.UserResponseDto;
import com.example.newAssignment.models.User;

public class UserTransformer {
    public static User userFromUserRequestDto(UserRequestDto userRequestDto){
        return User.
                builder()
                .email(userRequestDto.getEmail())
                .phone(userRequestDto.getPhone())
                .state(userRequestDto.getState())
                .city(userRequestDto.getCity())
                .address(userRequestDto.getAddress())
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .street(userRequestDto.getStreet())
                .build();

    }

    public static UserResponseDto userResponseDtoFromUser(User user){
        return UserResponseDto.builder()
                .id(user.getId())
                .city(user.getCity())
                .address(user.getAddress())
                .email(user.getEmail())
                .phone(user.getPhone())
                .state(user.getState())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .street(user.getStreet())
                .build();
    }

    public static User userFromUserDto(User user, UserRequestDto dto){
        user.setAddress(dto.getAddress());
        user.setCity(dto.getCity());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setStreet(dto.getStreet());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setState(dto.getState());
        return user;

    }
}