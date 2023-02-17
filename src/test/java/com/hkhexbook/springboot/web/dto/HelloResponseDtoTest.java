package com.hkhexbook.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombk_test(){
        String name = "test";
        int amount = 2000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name); // asertj라는 테스트검증 라이브러리의 검증 메소드.
        assertThat(dto.getAmount()).isEqualTo(amount);


    }
}
