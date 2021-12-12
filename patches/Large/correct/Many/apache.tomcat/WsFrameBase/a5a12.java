diff --git a/java/org/apache/tomcat/websocket/WsFrameBase.java b/java/org/apache/tomcat/websocket/WsFrameBase.java
index e530362..5a0c21f 100644
--- a/java/org/apache/tomcat/websocket/WsFrameBase.java
+++ b/java/org/apache/tomcat/websocket/WsFrameBase.java
@@ -300,7 +300,7 @@
 
 
     private boolean processDataControl() throws IOException {
-        TransformationResult tr = transformation.getMoreData(opCode, fin, rsv, messageBufferBinary);
+        TransformationResult tr = transformation.getMoreData(opCode, fin, rsv, controlBufferBinary);
         if (TransformationResult.UNDERFLOW.equals(tr)) {
             return false;
         }
