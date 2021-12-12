diff --git a/src/main/java/com/alibaba/fastjson/JSONPath.java b/src/main/java/com/alibaba/fastjson/JSONPath.java
index 2553e33..15e81d1 100644
--- a/src/main/java/com/alibaba/fastjson/JSONPath.java
+++ b/src/main/java/com/alibaba/fastjson/JSONPath.java
@@ -2189,7 +2189,7 @@
                 FieldSerializer fieldDeser = beanSerializer.getFieldSerializer(propertyName);
                 if (fieldDeser != null) {
                     try {
-                        Object val = fieldDeser.getPropertyValue(currentObject);
+                        Object val = fieldDeser.getPropertyValueDirect(currentObject);
                         results.add(val);
                     } catch (InvocationTargetException ex) {
                         throw new JSONException("getFieldValue error." + propertyName, ex);
