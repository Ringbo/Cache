diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicBooleanProperty.java b/archaius-core/src/main/java/com/netflix/config/DynamicBooleanProperty.java
index 3550663..e579f75 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicBooleanProperty.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicBooleanProperty.java
@@ -25,7 +25,7 @@
  *
  */
 public class DynamicBooleanProperty extends PropertyWrapper<Boolean> {
-    public DynamicBooleanProperty(String propName, boolean defaultValue) {
+    DynamicBooleanProperty(String propName, boolean defaultValue) {
         super(propName, Boolean.valueOf(defaultValue));
     }
     /**
