diff --git a/spring-boot-samples/spring-boot-sample-web-ui/src/main/java/sample/ui/SampleWebUiApplication.java b/spring-boot-samples/spring-boot-sample-web-ui/src/main/java/sample/ui/SampleWebUiApplication.java
index 0dedf1c..dc00e09 100644
--- a/spring-boot-samples/spring-boot-sample-web-ui/src/main/java/sample/ui/SampleWebUiApplication.java
+++ b/spring-boot-samples/spring-boot-sample-web-ui/src/main/java/sample/ui/SampleWebUiApplication.java
@@ -30,7 +30,7 @@
 
 	@Bean
 	public MessageRepository messageRepository() {
-		return new InMemoryMessageRespository();
+		return new InMemoryMessageRepository();
 	}
 
 	@Bean
