diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicIntProperty.java b/archaius-core/src/main/java/com/netflix/config/DynamicIntProperty.java
index d0872f5..edd1e64 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicIntProperty.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicIntProperty.java
@@ -27,7 +27,7 @@
  *
  */
 public class DynamicIntProperty extends PropertyWrapper<Integer> {
-    public DynamicIntProperty(String propName, int defaultValue) {
+    DynamicIntProperty(String propName, int defaultValue) {
         super(propName, Integer.valueOf(defaultValue));
     }
         
