diff --git a/test/org/apache/tomcat/websocket/TestWebSocket.java b/test/org/apache/tomcat/websocket/TestWebSocket.java
index 37d880f..150a809 100644
--- a/test/org/apache/tomcat/websocket/TestWebSocket.java
+++ b/test/org/apache/tomcat/websocket/TestWebSocket.java
@@ -436,7 +436,7 @@
             bc.setEnd(len);
 
             B2CConverter b2c = new B2CConverter("UTF-8");
-            b2c.convert(bc, cc);
+            b2c.convert(bc, cc, true);
 
             return cc.toString();
         }
