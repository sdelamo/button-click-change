package com.modernfrontendshtmx;

import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@MicronautTest
class WebJarsHtmxTest {
    @Test
    void stimulusViaWebJarsAvailable(@Client("/") HttpClient httpClient) {
        BlockingHttpClient client = httpClient.toBlocking();
        assertDoesNotThrow(() -> client.exchange("/webjars/github-com-bigskysoftware-htmx/1.9.10/htmx.min.js"));
    }
}
