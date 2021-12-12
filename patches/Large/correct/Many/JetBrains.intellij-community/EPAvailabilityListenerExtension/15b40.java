diff --git a/extensions/source/com/intellij/openapi/extensions/EPAvailabilityListenerExtension.java b/extensions/source/com/intellij/openapi/extensions/EPAvailabilityListenerExtension.java
index a6aa18b..e93df43 100644
--- a/extensions/source/com/intellij/openapi/extensions/EPAvailabilityListenerExtension.java
+++ b/extensions/source/com/intellij/openapi/extensions/EPAvailabilityListenerExtension.java
@@ -47,7 +47,7 @@
   }
 
   public Class loadListenerClass() throws ClassNotFoundException {
-    if (myPluginDescriptor.getPluginClassLoader() != null) {
+    if (myPluginDescriptor != null && myPluginDescriptor.getPluginClassLoader() != null) {
       return Class.forName(getListenerClass(), true, myPluginDescriptor.getPluginClassLoader());
     }
     else {
