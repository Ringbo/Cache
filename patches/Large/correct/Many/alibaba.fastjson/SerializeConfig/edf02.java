diff --git a/src/main/java/com/alibaba/fastjson/serializer/SerializeConfig.java b/src/main/java/com/alibaba/fastjson/serializer/SerializeConfig.java
index ee68639..23a04cd 100644
--- a/src/main/java/com/alibaba/fastjson/serializer/SerializeConfig.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/SerializeConfig.java
@@ -549,7 +549,7 @@
 	}
 
     public boolean put(Object type, Object value) {
-        return put((Type)type, (ObjectDeserializer)value);
+        return put((Type)type, (ObjectSerializer)value);
     }
 
 	public boolean put(Type type, ObjectSerializer value) {
