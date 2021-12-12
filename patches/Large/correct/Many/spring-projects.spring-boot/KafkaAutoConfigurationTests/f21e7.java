diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/kafka/KafkaAutoConfigurationTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/kafka/KafkaAutoConfigurationTests.java
index dc27e38..5dbb753 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/kafka/KafkaAutoConfigurationTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/kafka/KafkaAutoConfigurationTests.java
@@ -100,7 +100,7 @@
 		assertThat(configs.get(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG))
 				.isEqualTo(Boolean.FALSE);
 		assertThat(configs.get(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG))
-				.isEqualTo(123L);
+				.isEqualTo(123);
 		assertThat(configs.get(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG))
 				.isEqualTo("earliest");
 		assertThat(configs.get(ConsumerConfig.FETCH_MAX_WAIT_MS_CONFIG)).isEqualTo(456);
