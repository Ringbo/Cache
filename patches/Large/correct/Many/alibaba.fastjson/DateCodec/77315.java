diff --git a/src/main/java/com/alibaba/fastjson/serializer/DateCodec.java b/src/main/java/com/alibaba/fastjson/serializer/DateCodec.java
index f866cd5..d1a3a70 100644
--- a/src/main/java/com/alibaba/fastjson/serializer/DateCodec.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/DateCodec.java
@@ -55,7 +55,7 @@
             long millis = ((java.sql.Date) object).getTime();
             TimeZone timeZone = serializer.timeZone;
             int offset = timeZone.getOffset(millis);
-            if (millis % offset == 0) {
+            if (offset == 0 || millis % offset == 0) {
                 out.writeString(object.toString());
                 return;
             }
