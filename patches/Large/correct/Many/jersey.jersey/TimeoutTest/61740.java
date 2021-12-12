diff --git a/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/TimeoutTest.java b/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/TimeoutTest.java
index 4b1d167..27f93c2 100644
--- a/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/TimeoutTest.java
+++ b/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/TimeoutTest.java
@@ -71,7 +71,7 @@
         @Path("timeout")
         public String getTimeout() {
             try {
-                Thread.sleep(2000);
+                Thread.sleep(5000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
@@ -86,7 +86,7 @@
 
     @Override
     protected void configureClient(ClientConfig clientConfig) {
-        clientConfig.property(ClientProperties.READ_TIMEOUT, 1000);
+        clientConfig.property(ClientProperties.READ_TIMEOUT, 2000);
     }
 
     @Test
