diff --git a/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java b/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java
index 0f29540..e762371 100755
--- a/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/SerializeWriter.java
@@ -2126,7 +2126,7 @@
             writeNull();
         } else {
             int scale = value.scale();
-            write(isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && scale >= 100 && scale < 100
+            write(isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && scale >= -100 && scale < 100
                     ? value.toPlainString()
                     : value.toString()
             );
