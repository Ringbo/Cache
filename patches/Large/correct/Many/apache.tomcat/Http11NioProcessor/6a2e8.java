diff --git a/java/org/apache/coyote/http11/Http11NioProcessor.java b/java/org/apache/coyote/http11/Http11NioProcessor.java
index 868a88f..2f83180 100644
--- a/java/org/apache/coyote/http11/Http11NioProcessor.java
+++ b/java/org/apache/coyote/http11/Http11NioProcessor.java
@@ -155,7 +155,7 @@
 
         rp.setStage(org.apache.coyote.Constants.STAGE_ENDED);
 
-        if (error) {
+        if (error || status==SocketStatus.STOP) {
             return SocketState.CLOSED;
         } else if (!comet) {
             if (keepAlive) {
