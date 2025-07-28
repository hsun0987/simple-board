package com.example.simple_board.crud;

public interface Converter <DTO, ENTITY> {
    // entity -> dto
    DTO toDto(ENTITY entity);

    // dto -> entity
    ENTITY toEntity(DTO dto);
}
