diff --git a/sonar-core/src/test/java/org/sonar/core/platform/PluginClassloaderFactoryTest.java b/sonar-core/src/test/java/org/sonar/core/platform/PluginClassloaderFactoryTest.java
index 9b5f6cf..62d41a1 100644
--- a/sonar-core/src/test/java/org/sonar/core/platform/PluginClassloaderFactoryTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/platform/PluginClassloaderFactoryTest.java
@@ -43,7 +43,7 @@
   PluginClassloaderFactory factory = new PluginClassloaderFactory(temp);
 
   @Test
-  public void create_isolated_classloader() throws Exception {
+  public void create_isolated_classloader() {
     PluginClassloaderDef def = basePluginDef();
     Map<PluginClassloaderDef, ClassLoader> map = factory.create(asList(def));
 
@@ -61,7 +61,7 @@
   }
 
   @Test
-  public void create_classloader_compatible_with_with_old_api_dependencies() throws Exception {
+  public void create_classloader_compatible_with_with_old_api_dependencies() {
     PluginClassloaderDef def = basePluginDef();
     def.setCompatibilityMode(true);
     ClassLoader classLoader = factory.create(asList(def)).get(def);
@@ -75,7 +75,7 @@
   }
 
   @Test
-  public void classloader_exports_resources_to_other_classloaders() throws Exception {
+  public void classloader_exports_resources_to_other_classloaders() {
     PluginClassloaderDef baseDef = basePluginDef();
     PluginClassloaderDef dependentDef = dependentPluginDef();
     Map<PluginClassloaderDef, ClassLoader> map = factory.create(asList(baseDef, dependentDef));
