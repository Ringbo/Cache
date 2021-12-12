diff --git a/modules/cpr/src/test/java/org/atmosphere/cpr/WriteTimeoutTest.java b/modules/cpr/src/test/java/org/atmosphere/cpr/WriteTimeoutTest.java
index 4e7f3ea..59541d2 100644
--- a/modules/cpr/src/test/java/org/atmosphere/cpr/WriteTimeoutTest.java
+++ b/modules/cpr/src/test/java/org/atmosphere/cpr/WriteTimeoutTest.java
@@ -60,7 +60,7 @@
         ar = new AtmosphereResourceImpl(config,
                 broadcaster,
                 mock(AtmosphereRequest.class),
-                AtmosphereResponse.create(),
+                AtmosphereResponse.newInstance(),
                 mock(BlockingIOCometSupport.class),
                 atmosphereHandler);
 
@@ -85,7 +85,7 @@
         ar = new AtmosphereResourceImpl(config,
                 broadcaster,
                 mock(AtmosphereRequest.class),
-                AtmosphereResponse.create(),
+                AtmosphereResponse.newInstance(),
                 mock(BlockingIOCometSupport.class),
                 atmosphereHandler);
 
