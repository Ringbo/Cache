diff --git a/src/main/java/com/typesafe/config/impl/AbstractConfigObject.java b/src/main/java/com/typesafe/config/impl/AbstractConfigObject.java
index 86cad89..c55253f 100644
--- a/src/main/java/com/typesafe/config/impl/AbstractConfigObject.java
+++ b/src/main/java/com/typesafe/config/impl/AbstractConfigObject.java
@@ -305,7 +305,7 @@
     }
 
     @Override
-    public ConfigValue get(Object key) {
+    public AbstractConfigValue get(Object key) {
         if (key instanceof String)
             return peek((String) key);
         else
@@ -313,7 +313,7 @@
     }
 
     @Override
-    public ConfigValue getValue(String path) {
+    public AbstractConfigValue getValue(String path) {
         return find(path, null, path);
     }
 
