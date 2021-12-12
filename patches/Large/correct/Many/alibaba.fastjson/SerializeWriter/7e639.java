diff --git a/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java b/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java
index df5b992..b57ac5e 100755
--- a/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java
@@ -473,7 +473,7 @@
         if (writer != null && count > 0) {
             flush();
         }
-        if (buf.length <= 1024 * 64) {
+        if (buf.length <= 1024 * 128) {
             bufLocal.set(buf);
         }
 
