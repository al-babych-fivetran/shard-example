package com.github.bazel_contrib.contrib_rules_jvm.examples.tests_and_lints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

public class ExampleTest {
  @ParameterizedTest
  @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20})
  public void passes(int value) throws InterruptedException {
    var shard = System.getenv("TEST_SHARD_INDEX");
    System.out.println("Test: " + value + ", Shard: " + shard);
    TimeUnit.SECONDS.sleep(1);
  }
}
