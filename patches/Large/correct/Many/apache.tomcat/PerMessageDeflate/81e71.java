diff --git a/java/org/apache/tomcat/websocket/PerMessageDeflate.java b/java/org/apache/tomcat/websocket/PerMessageDeflate.java
index f57082d..3c44e76 100644
--- a/java/org/apache/tomcat/websocket/PerMessageDeflate.java
+++ b/java/org/apache/tomcat/websocket/PerMessageDeflate.java
@@ -213,8 +213,8 @@
                     }
                 }
             } else if (written == 0) {
-                if (fin && (isServer && !serverContextTakeover ||
-                        !isServer && !clientContextTakeover)) {
+                if (fin && (isServer && !clientContextTakeover ||
+                        !isServer && !serverContextTakeover)) {
                     inflater.reset();
                 }
                 return TransformationResult.END_OF_FRAME;
@@ -426,7 +426,7 @@
 
     private void startNewMessage() {
         firstCompressedFrameWritten = false;
-        if (isServer && !clientContextTakeover || !isServer && !serverContextTakeover) {
+        if (isServer && !serverContextTakeover || !isServer && !clientContextTakeover) {
             deflater.reset();
         }
     }
