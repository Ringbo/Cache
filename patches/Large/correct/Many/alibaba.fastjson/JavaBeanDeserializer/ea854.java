diff --git a/src/main/java/com/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer.java b/src/main/java/com/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer.java
index 118af9d..8a8d780 100755
--- a/src/main/java/com/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer.java
+++ b/src/main/java/com/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer.java
@@ -223,7 +223,7 @@
     }
     
     public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
-        return deserialze(parser, type, fieldName, null, 0, null);
+        return deserialze(parser, type, fieldName, 0);
     }
 
     public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName, int features) {
