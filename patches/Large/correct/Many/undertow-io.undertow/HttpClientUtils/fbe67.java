diff --git a/core/src/test/java/io/undertow/test/utils/HttpClientUtils.java b/core/src/test/java/io/undertow/test/utils/HttpClientUtils.java
index 53ef69e..7422101 100644
--- a/core/src/test/java/io/undertow/test/utils/HttpClientUtils.java
+++ b/core/src/test/java/io/undertow/test/utils/HttpClientUtils.java
@@ -42,7 +42,7 @@
         byte[] data = new byte[100];
         int read;
         while ((read = stream.read(data)) != -1) {
-            builder.append(new String(data,0,read));
+            builder.append(new String(data,0,read,"UTF-8"));
         }
         return builder.toString();
     }
