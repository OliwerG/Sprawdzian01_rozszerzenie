package pl.kurs;

import com.fasterxml.jackson.databind.ObjectMapper;

public enum ObjectMapperHolder {
    INSTANCE;

    private ObjectMapper objectMapper;


    ObjectMapperHolder() {
        this.objectMapper = create();
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    private static ObjectMapper create() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        return mapper;
    }
}
