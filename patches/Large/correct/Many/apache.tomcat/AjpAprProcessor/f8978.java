diff --git a/java/org/apache/coyote/ajp/AjpAprProcessor.java b/java/org/apache/coyote/ajp/AjpAprProcessor.java
index 693d656..a9659ee 100644
--- a/java/org/apache/coyote/ajp/AjpAprProcessor.java
+++ b/java/org/apache/coyote/ajp/AjpAprProcessor.java
@@ -385,7 +385,7 @@
             try {
                 // Get first message of the request
                 if (!readMessage(requestHeaderMessage, true,
-                        keptAlive && (endpoint.getCurrentThreadsBusy() > limit))) {
+                        keptAlive && (endpoint.getCurrentThreadsBusy() >= limit))) {
                     // This means that no data is available right now
                     // (long keepalive), so that the processor should be recycled
                     // and the method should return true
