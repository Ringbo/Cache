diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicStringProperty.java b/archaius-core/src/main/java/com/netflix/config/DynamicStringProperty.java
index 5ec7a55..73e4fd2 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicStringProperty.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicStringProperty.java
@@ -26,7 +26,7 @@
  */
 public class DynamicStringProperty extends PropertyWrapper<String> {
 
-    public DynamicStringProperty(String propName, String defaultValue) {
+    DynamicStringProperty(String propName, String defaultValue) {
         super(propName, defaultValue);
     }
 
