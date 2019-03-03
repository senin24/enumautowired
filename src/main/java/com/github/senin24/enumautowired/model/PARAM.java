package com.github.senin24.enumautowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Обертка для получения параметров
 */
@Service
public enum PARAM {

    SOME_PARAM1(null) {
        @Override
        public String getValue() {
            return getParameter().getAllParams().get("param1");
        }
    },

    SOME_PARAM2(null) {
        @Override
        public String getValue() {
            return getParameter().getAllParams().get("param2");
        }
    },
    SOME_PARAM3(null) {
        @Override
        public String getValue() {
            return getParameter().getAllParams().get("param3");
        }
    };


    private static Parameter parameter;

    @Autowired
    PARAM(Parameter parameter) {
        PARAM.setParameter(parameter);
    }

    public static Parameter getParameter() {
        return parameter;
    }

    public static void setParameter(Parameter parameter) {
        PARAM.parameter = parameter;
    }

    //    @Autowired
//    public void setParameter(Parameter parameter){
//        this.parameter = parameter;
//    }

    public abstract <T> T getValue();

}
