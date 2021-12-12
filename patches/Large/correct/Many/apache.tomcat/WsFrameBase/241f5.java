diff --git a/java/org/apache/tomcat/websocket/WsFrameBase.java b/java/org/apache/tomcat/websocket/WsFrameBase.java
index c5515bf..99330da 100644
--- a/java/org/apache/tomcat/websocket/WsFrameBase.java
+++ b/java/org/apache/tomcat/websocket/WsFrameBase.java
@@ -469,7 +469,7 @@
                             CloseCodes.TOO_BIG,
                             sm.getString("wsFrame.textMessageTooBig")));
                 }
-            } else if (cr.isUnderflow() & !last) {
+            } else if (cr.isUnderflow() && !last) {
                 // End of frame and possible message as well.
 
                 if (continuationExpected) {
