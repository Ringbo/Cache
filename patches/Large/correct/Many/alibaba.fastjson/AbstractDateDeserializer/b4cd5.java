diff --git a/src/main/java/com/alibaba/fastjson/parser/deserializer/AbstractDateDeserializer.java b/src/main/java/com/alibaba/fastjson/parser/deserializer/AbstractDateDeserializer.java
index 4a6295b..930e7ba 100755
--- a/src/main/java/com/alibaba/fastjson/parser/deserializer/AbstractDateDeserializer.java
+++ b/src/main/java/com/alibaba/fastjson/parser/deserializer/AbstractDateDeserializer.java
@@ -34,7 +34,7 @@
             if (format != null) {
                 SimpleDateFormat simpleDateFormat = null;
                 try {
-                    simpleDateFormat = new SimpleDateFormat(format);
+                    simpleDateFormat = new SimpleDateFormat(format,JSON.defaultLocale);
                 } catch (IllegalArgumentException ex) {
                     if (format.equals("yyyy-MM-ddTHH:mm:ss.SSS")) {
                         format = "yyyy-MM-dd'T'HH:mm:ss.SSS";
