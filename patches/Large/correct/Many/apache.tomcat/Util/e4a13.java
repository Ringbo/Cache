diff --git a/java/org/apache/tomcat/websocket/Util.java b/java/org/apache/tomcat/websocket/Util.java
index 228ac8c..ddf5f49 100644
--- a/java/org/apache/tomcat/websocket/Util.java
+++ b/java/org/apache/tomcat/websocket/Util.java
@@ -69,7 +69,7 @@
 
 
     static boolean isControl(byte opCode) {
-        return (opCode & 0x08) > 0;
+        return (opCode & 0x08) != 0;
     }
 
 
