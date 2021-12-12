diff --git a/zxing.appspot.com/generator/src/com/google/zxing/web/generator/client/Generator.java b/zxing.appspot.com/generator/src/com/google/zxing/web/generator/client/Generator.java
index 94b0662..05cb0c0 100644
--- a/zxing.appspot.com/generator/src/com/google/zxing/web/generator/client/Generator.java
+++ b/zxing.appspot.com/generator/src/com/google/zxing/web/generator/client/Generator.java
@@ -181,7 +181,7 @@
     result += "x";
     result += sizeY;
     result += "&chl=";
-    result += URL.encode(content);
+    result += URL.encodeComponent(content);
     return result;
   }
   
