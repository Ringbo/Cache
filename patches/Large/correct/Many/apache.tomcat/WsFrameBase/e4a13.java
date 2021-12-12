diff --git a/java/org/apache/tomcat/websocket/WsFrameBase.java b/java/org/apache/tomcat/websocket/WsFrameBase.java
index e83782f..28cdc30 100644
--- a/java/org/apache/tomcat/websocket/WsFrameBase.java
+++ b/java/org/apache/tomcat/websocket/WsFrameBase.java
@@ -148,7 +148,7 @@
             return false;
         }
         int b = inputBuffer.get();
-        fin = (b & 0x80) > 0;
+        fin = (b & 0x80) != 0;
         rsv = (b & 0x70) >>> 4;
         opCode = (byte) (b & 0x0F);
         if (!transformation.validateRsv(rsv, opCode)) {
