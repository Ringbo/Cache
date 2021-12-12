diff --git a/src/main/java/com/alibaba/fastjson/serializer/BigDecimalCodec.java b/src/main/java/com/alibaba/fastjson/serializer/BigDecimalCodec.java
index 008ec8f..6b70096 100755
--- a/src/main/java/com/alibaba/fastjson/serializer/BigDecimalCodec.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/BigDecimalCodec.java
@@ -43,7 +43,7 @@
             int scale = val.scale();
 
             String outText;
-            if (out.isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && scale >= 100 && scale < 100) {
+            if (out.isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && scale >= -100 && scale < 100) {
                 outText = val.toPlainString();
             } else {
                 outText = val.toString();
