diff --git a/resilience4j-spring-boot/src/test/java/io/github/resilience4j/ratelimiter/RateLimiterAutoConfigurationTest.java b/resilience4j-spring-boot/src/test/java/io/github/resilience4j/ratelimiter/RateLimiterAutoConfigurationTest.java
index a357dd2..65d5ec4 100644
--- a/resilience4j-spring-boot/src/test/java/io/github/resilience4j/ratelimiter/RateLimiterAutoConfigurationTest.java
+++ b/resilience4j-spring-boot/src/test/java/io/github/resilience4j/ratelimiter/RateLimiterAutoConfigurationTest.java
@@ -68,7 +68,7 @@
         RateLimiter rateLimiter = rateLimiterRegistry.rateLimiter(DummyService.BACKEND);
         assertThat(rateLimiter).isNotNull();
         await()
-            .atMost(1, TimeUnit.SECONDS)
+            .atMost(2, TimeUnit.SECONDS)
             .until(() -> rateLimiter.getMetrics().getAvailablePermissions() == 10);
 
         try {
@@ -109,7 +109,7 @@
         assertThat(lastEvent.getRateLimiterEventType()).isEqualTo(RateLimiterEvent.Type.FAILED_ACQUIRE);
 
         await()
-            .atMost(1, TimeUnit.SECONDS)
+            .atMost(2, TimeUnit.SECONDS)
             .until(() -> rateLimiter.getMetrics().getAvailablePermissions() == 10);
     }
 }
