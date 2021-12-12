diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/CacheStatisticsAutoConfigurationTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/CacheStatisticsAutoConfigurationTests.java
index 2d2d632..0683800 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/CacheStatisticsAutoConfigurationTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/CacheStatisticsAutoConfigurationTests.java
@@ -199,7 +199,7 @@
 
 	private Cache getCache(String cacheName) {
 		Cache cache = this.cacheManager.getCache(cacheName);
-		Assert.notNull("No cache with name '" + cacheName + "' found.");
+		Assert.notNull(cache, "No cache with name '" + cacheName + "' found.");
 		return cache;
 	}
 
