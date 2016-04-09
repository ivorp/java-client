package com.launchdarkly.client;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;

@Ignore
public class ManualTest {
  private static final Logger logger = LoggerFactory.getLogger(ManualTest.class);

  @Test
  public void manualTest() throws URISyntaxException {
    LDConfig config = new LDConfig.Builder()
        .startWaitMillis(30000L)
        .baseURI(URI.create("https://ld-stg.global.ssl.fastly.net"))
        .streamURI(URI.create("https://f6bff885.fanoutcdn.com"))
        .eventsURI(URI.create("https://events-stg.launchdarkly.com"))
        .stream(true)
        .build();

    LDClient ldClient = new LDClient("119fc6de-54b5-4271-98dd-be6c0ba2742f", config);

    while (true) {
    }
  }
}
