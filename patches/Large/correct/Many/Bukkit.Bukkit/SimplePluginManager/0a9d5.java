diff --git a/src/org/bukkit/plugin/SimplePluginManager.java b/src/org/bukkit/plugin/SimplePluginManager.java
index cc696f6..eef3f8e 100644
--- a/src/org/bukkit/plugin/SimplePluginManager.java
+++ b/src/org/bukkit/plugin/SimplePluginManager.java
@@ -194,7 +194,7 @@
         List<RegisteredListener> eventListeners = listeners.get(type);
         int position = 0;
 
-        if (listeners != null) {
+        if (eventListeners != null) {
             for (RegisteredListener registration : eventListeners) {
                 if (registration.getPriority().compareTo(priority) < 0) {
                     break;
