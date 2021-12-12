diff --git a/extensions/source/com/intellij/openapi/extensions/impl/ExtensionComponentAdapter.java b/extensions/source/com/intellij/openapi/extensions/impl/ExtensionComponentAdapter.java
index 206fbea..27ba75b 100644
--- a/extensions/source/com/intellij/openapi/extensions/impl/ExtensionComponentAdapter.java
+++ b/extensions/source/com/intellij/openapi/extensions/impl/ExtensionComponentAdapter.java
@@ -52,7 +52,7 @@
         if (myPluginDescriptor.getPluginClassLoader() != null) {
           classLoader.add(myPluginDescriptor.getPluginClassLoader());
         }
-        XStream xStream = new XStream();
+        XStream xStream = new XStream(new PropertyReflectionProvider());
         xStream.setClassLoader(classLoader);
         xStream.registerConverter(new ElementConverter());
         Object componentInstance = super.getComponentInstance(container);
