package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sayHello_shouldReturnDefaultMessage() throws Exception {
        String url = "http://localhost:8081" + "/api/hello";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        //assertThat(response.getBody()).isEqualTo("Hello, World!");
        assertThat(response.getBody()).contains("<title>Please sign in</title>");
    }
}