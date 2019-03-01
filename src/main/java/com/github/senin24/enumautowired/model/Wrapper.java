package com.github.senin24.enumautowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Обертка для получения параметров
 */
@Service
public class Wrapper {

    protected static ParameterI parameterI;

    @Autowired
    public void setParameter(ParameterI parameterI){
        Wrapper.parameterI = parameterI;
    }

    public enum PARAM {

        SOME_PARAM1() {
            @Override
            public String getValue() {
                return parameterI.getAllParams().get("param1");
            }
        },
        SOME_PARAM2() {
            @Override
            public String getValue() {
                return parameterI.getAllParams().get("param2");
            }
        },
        SOME_PARAM3() {
            @Override
            public String getValue() {
                return parameterI.getAllParams().get("param3");
            }
        };

        public abstract <T> T getValue();
    }
}
