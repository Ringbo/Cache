diff --git a/cas-server-core/src/main/java/org/jasig/cas/util/SimpleHttpClient.java b/cas-server-core/src/main/java/org/jasig/cas/util/SimpleHttpClient.java
index 6b82a73..7f3d7cd 100644
--- a/cas-server-core/src/main/java/org/jasig/cas/util/SimpleHttpClient.java
+++ b/cas-server-core/src/main/java/org/jasig/cas/util/SimpleHttpClient.java
@@ -111,7 +111,7 @@
         final Callable<Boolean> callable = new CallableHttpMessageSender(message);
         final Future<Boolean> result = EXECUTOR_SERVICE.submit(callable);
 
-        if (message.isIssueAsynchronousCallbacks()) {
+        if (message.isAsynchronous()) {
             return true;
         }
 
