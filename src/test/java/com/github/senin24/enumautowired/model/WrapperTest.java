package com.github.senin24.enumautowired.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WrapperTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setParameter() {

        System.out.println("Get param 1 from Enum with @Autowired field 'Param': "
                + Wrapper.PARAM.SOME_PARAM1.getValue());
        System.out.println("Get param 2 from Enum with @Autowired field 'Param': "
                + Wrapper.PARAM.SOME_PARAM2.getValue());
        System.out.println("Get param 3 from Enum with @Autowired field 'Param': "
                + Wrapper.PARAM.SOME_PARAM3.getValue());
    }
}