diff --git a/config/src/main/java/com/typesafe/config/impl/SimpleConfigList.java b/config/src/main/java/com/typesafe/config/impl/SimpleConfigList.java
index cdf1a17..6703540 100644
--- a/config/src/main/java/com/typesafe/config/impl/SimpleConfigList.java
+++ b/config/src/main/java/com/typesafe/config/impl/SimpleConfigList.java
@@ -173,7 +173,7 @@
     }
 
     @Override
-    public ConfigValue get(int index) {
+    public AbstractConfigValue get(int index) {
         return value.get(index);
     }
 
