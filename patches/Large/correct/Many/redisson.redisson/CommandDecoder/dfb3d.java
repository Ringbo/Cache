diff --git a/redisson/src/main/java/org/redisson/client/handler/CommandDecoder.java b/redisson/src/main/java/org/redisson/client/handler/CommandDecoder.java
index 8fe6243..ec1b30f 100644
--- a/redisson/src/main/java/org/redisson/client/handler/CommandDecoder.java
+++ b/redisson/src/main/java/org/redisson/client/handler/CommandDecoder.java
@@ -473,7 +473,7 @@
         }
         if (decoder == null) {
             if (data.getCommand().getOutParamType() == ValueType.MAP) {
-                if (parts.size() % 2 != 0) {
+                if (parts != null && parts.size() % 2 != 0) {
                     decoder = data.getCodec().getMapValueDecoder();
                 } else {
                     decoder = data.getCodec().getMapKeyDecoder();
