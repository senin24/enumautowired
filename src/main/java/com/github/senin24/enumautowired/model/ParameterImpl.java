package com.github.senin24.enumautowired.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

@Data
public class ParameterImpl implements ParameterI {

    @Value("${param1}")
    private String param1;

    @Value("${param2}")
    private String param2;

    @Value("${param3}")
    private String param3;

    @Override
    public Map<String, String> getAllParams() {
        return new HashMap<String, String>() {{
            put("param1", param1);
            put("param2", param2);
            put("param3", param3);
        }};
    }
}
