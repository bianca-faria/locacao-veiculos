//package com.faria.vehicle_allocation_system.util;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//
//@Converter(autoApply = true)
//public class JsonConverter implements AttributeConverter<Object, String> {
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    @Override
//    public String convertToDatabaseColumn(Object attribute) {
//        try {
//            return objectMapper.writeValueAsString(attribute);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException("Erro ao converter para JSON", e);
//        }
//    }
//
//    @Override
//    public Object convertToEntityAttribute(String json) {
//        try {
//            return objectMapper.readValue(json, Object.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException("Erro ao converter JSON para objeto", e);
//        }
//    }
//}
