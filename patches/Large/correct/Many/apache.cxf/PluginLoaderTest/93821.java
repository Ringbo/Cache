diff --git a/tools/wsdlto/test/src/test/java/org/apache/cxf/tools/wsdlto/core/PluginLoaderTest.java b/tools/wsdlto/test/src/test/java/org/apache/cxf/tools/wsdlto/core/PluginLoaderTest.java
index 748474f..c02d31b 100644
--- a/tools/wsdlto/test/src/test/java/org/apache/cxf/tools/wsdlto/core/PluginLoaderTest.java
+++ b/tools/wsdlto/test/src/test/java/org/apache/cxf/tools/wsdlto/core/PluginLoaderTest.java
@@ -34,7 +34,7 @@
     @Test
     public void testLoadPlugins() throws Exception {
         PluginLoader loader = PluginLoader.getInstance();
-        assertEquals(4, loader.getPlugins().size());
+        assertEquals(3, loader.getPlugins().size());
 
         Plugin plugin = getPlugin(loader, 0);
         assertNotNull(plugin.getName());
@@ -59,7 +59,7 @@
                   
         Map<String, DataBinding> databindings = loader.getDataBindings();
         assertNotNull(databindings);
-        assertEquals(6, databindings.size());
+        assertEquals(5, databindings.size());
         
         DataBinding databinding = databindings.get("jaxb");
         assertNotNull(databinding);
