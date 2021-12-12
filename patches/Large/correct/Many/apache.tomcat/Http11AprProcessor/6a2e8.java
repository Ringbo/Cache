diff --git a/java/org/apache/coyote/http11/Http11AprProcessor.java b/java/org/apache/coyote/http11/Http11AprProcessor.java
index f913a0d..22613aa 100644
--- a/java/org/apache/coyote/http11/Http11AprProcessor.java
+++ b/java/org/apache/coyote/http11/Http11AprProcessor.java
@@ -144,7 +144,7 @@
 
         rp.setStage(org.apache.coyote.Constants.STAGE_ENDED);
 
-        if (error) {
+        if (error || status==SocketStatus.STOP) {
             return SocketState.CLOSED;
         } else if (!comet) {
             inputBuffer.nextRequest();
