diff --git a/dropwizard-logging/src/test/java/io/dropwizard/logging/PrefixedRootCauseFirstThrowableProxyConverterTest.java b/dropwizard-logging/src/test/java/io/dropwizard/logging/PrefixedRootCauseFirstThrowableProxyConverterTest.java
index 82fea76..d7ebf3d 100644
--- a/dropwizard-logging/src/test/java/io/dropwizard/logging/PrefixedRootCauseFirstThrowableProxyConverterTest.java
+++ b/dropwizard-logging/src/test/java/io/dropwizard/logging/PrefixedRootCauseFirstThrowableProxyConverterTest.java
@@ -33,7 +33,7 @@
         return null; // unpossible, tell the type-system
     }
 
-    private void throwRoot() throws SocketTimeoutException {
+    private static void throwRoot() throws SocketTimeoutException {
         throw new SocketTimeoutException("Timed-out reading from socket");
     }
 
