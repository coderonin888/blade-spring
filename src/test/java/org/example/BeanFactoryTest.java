package org.example;

import org.blade.springframework.beans.factory.BeanFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("testService", new TestService());
        TestService testService = (TestService) beanFactory.getBean("testService");

        assertThat(testService).isNotNull();
        assertThat(testService.say()).isEqualTo("hello");
    }

    class TestService {
        public String say() {
            System.out.println("hello, world");
            return "hello";
        }
    }


}
