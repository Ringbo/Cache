diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicDoubleProperty.java b/archaius-core/src/main/java/com/netflix/config/DynamicDoubleProperty.java
index dcd3407..a5e8d3d 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicDoubleProperty.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicDoubleProperty.java
@@ -26,7 +26,7 @@
  *
  */
 public class DynamicDoubleProperty extends PropertyWrapper<Double> {
-    public DynamicDoubleProperty(String propName, double defaultValue) {
+    DynamicDoubleProperty(String propName, double defaultValue) {
         super(propName, Double.valueOf(defaultValue));
     }
         
