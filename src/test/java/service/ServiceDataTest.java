package service;

import model.Data;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ServiceDataTest {

    @Test
    void shouldCreateDataNotNul() {
        //given
        //when
        ServiceData serviceData=new ServiceData();
        //then
        assertThat(serviceData).isNotNull();
    }
}