diff --git a/src/plugin/protocol-file/src/java/org/apache/nutch/protocol/file/FileResponse.java b/src/plugin/protocol-file/src/java/org/apache/nutch/protocol/file/FileResponse.java
index 58bb51b..cbf5c07 100644
--- a/src/plugin/protocol-file/src/java/org/apache/nutch/protocol/file/FileResponse.java
+++ b/src/plugin/protocol-file/src/java/org/apache/nutch/protocol/file/FileResponse.java
@@ -167,7 +167,7 @@
     // capture content
     int len = (int) size;
     
-    if (this.file.maxContentLength > 0 && len > this.file.maxContentLength)
+    if (this.file.maxContentLength >= 0 && len > this.file.maxContentLength)
       len = this.file.maxContentLength;
 
     this.content = new byte[len];
