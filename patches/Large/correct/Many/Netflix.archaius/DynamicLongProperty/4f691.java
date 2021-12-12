diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicLongProperty.java b/archaius-core/src/main/java/com/netflix/config/DynamicLongProperty.java
index 0de9bc2..7c03a6d 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicLongProperty.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicLongProperty.java
@@ -25,7 +25,7 @@
  *
  */
 public class DynamicLongProperty extends PropertyWrapper<Long> {
-    public DynamicLongProperty(String propName, long defaultValue) {
+    DynamicLongProperty(String propName, long defaultValue) {
         super(propName, Long.valueOf(defaultValue));
     }
         
