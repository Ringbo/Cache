diff --git a/redisson/src/main/java/org/redisson/BaseRemoteService.java b/redisson/src/main/java/org/redisson/BaseRemoteService.java
index 560e64b..65b271f 100644
--- a/redisson/src/main/java/org/redisson/BaseRemoteService.java
+++ b/redisson/src/main/java/org/redisson/BaseRemoteService.java
@@ -393,7 +393,7 @@
             }
         }
         
-        final Map<String, RPromise<? extends RRemoteServiceResponse>> responses = entry.getResponses();
+        final ConcurrentMap<String, RPromise<? extends RRemoteServiceResponse>> responses = entry.getResponses();
         
         commandExecutor.getConnectionManager().getGroup().schedule(new Runnable() {
             @Override
