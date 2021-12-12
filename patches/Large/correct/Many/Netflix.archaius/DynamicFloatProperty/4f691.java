diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicFloatProperty.java b/archaius-core/src/main/java/com/netflix/config/DynamicFloatProperty.java
index a124a6f..80c4018 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicFloatProperty.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicFloatProperty.java
@@ -24,7 +24,7 @@
  * @author awang
  *
  */public class DynamicFloatProperty extends PropertyWrapper<Float> {
-    public DynamicFloatProperty(String propName, float defaultValue) {
+    DynamicFloatProperty(String propName, float defaultValue) {
         super(propName, Float.valueOf(defaultValue));
     }
     /**
