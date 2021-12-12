diff --git a/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java b/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java
index b8105cb..1dc29d1 100644
--- a/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java
+++ b/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java
@@ -110,7 +110,7 @@
         return fields;
     }
 
-    public Object get(Object key) {
+    public Object get(String key) {
         synchronized (this) {
             return properties.get(key);
         }
@@ -122,7 +122,7 @@
         }
     }
 
-    public Object remove(Object key) {
+    public Object remove(String key) {
         synchronized (this) {
             return properties.remove(key);
         }
