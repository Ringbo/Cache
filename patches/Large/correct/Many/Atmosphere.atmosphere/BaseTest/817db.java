diff --git a/integration-tests/cpr/src/test/java/org/atmosphere/tests/http/BaseTest.java b/integration-tests/cpr/src/test/java/org/atmosphere/tests/http/BaseTest.java
index 40d9a95..d6fe5b7 100644
--- a/integration-tests/cpr/src/test/java/org/atmosphere/tests/http/BaseTest.java
+++ b/integration-tests/cpr/src/test/java/org/atmosphere/tests/http/BaseTest.java
@@ -1277,7 +1277,7 @@
             }
 
             public void onStateChange(AtmosphereResourceEvent event) throws IOException {
-                if (event.isResuming()) {
+                if (event.isResuming() || event.isCancelled()) {
                     return;
                 }
                 PrintWriter writer = event.getResource().getResponse().getWriter();
