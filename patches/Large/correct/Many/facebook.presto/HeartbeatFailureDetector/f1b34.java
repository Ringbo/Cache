diff --git a/presto-main/src/main/java/com/facebook/presto/failureDetector/HeartbeatFailureDetector.java b/presto-main/src/main/java/com/facebook/presto/failureDetector/HeartbeatFailureDetector.java
index 332a0f2..b945b39 100644
--- a/presto-main/src/main/java/com/facebook/presto/failureDetector/HeartbeatFailureDetector.java
+++ b/presto-main/src/main/java/com/facebook/presto/failureDetector/HeartbeatFailureDetector.java
@@ -162,11 +162,12 @@
                 }
 
                 Exception lastFailureException = task.getStats().getLastFailureException();
-                if (lastFailureException instanceof SocketTimeoutException || lastFailureException instanceof UnknownHostException) {
+                if (lastFailureException instanceof ConnectException) {
                     return GONE;
                 }
 
-                if (lastFailureException instanceof ConnectException) {
+                if (lastFailureException instanceof SocketTimeoutException) {
+                    // TODO: distinguish between process unresponsiveness (e.g GC pause) and host reboot
                     return UNRESPONSIVE;
                 }
 
