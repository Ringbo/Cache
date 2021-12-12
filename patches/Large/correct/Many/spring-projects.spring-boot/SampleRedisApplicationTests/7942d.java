diff --git a/spring-boot-samples/spring-boot-sample-data-redis/src/test/java/sample/data/redis/SampleRedisApplicationTests.java b/spring-boot-samples/spring-boot-sample-data-redis/src/test/java/sample/data/redis/SampleRedisApplicationTests.java
index 63a14e3..3152bdc 100644
--- a/spring-boot-samples/spring-boot-sample-data-redis/src/test/java/sample/data/redis/SampleRedisApplicationTests.java
+++ b/spring-boot-samples/spring-boot-sample-data-redis/src/test/java/sample/data/redis/SampleRedisApplicationTests.java
@@ -39,7 +39,7 @@
 		try {
 			SampleRedisApplication.main(new String[0]);
 		}
-		catch (IllegalStateException ex) {
+		catch (Exception ex) {
 			if (!redisServerRunning(ex)) {
 				return;
 			}
