diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/ConfigurationLoaderTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/ConfigurationLoaderTest.java
index 3795521..90d10ef 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/ConfigurationLoaderTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/ConfigurationLoaderTest.java
@@ -51,12 +51,12 @@
 @PrepareForTest({ ConfigurationLoader.class, ConfigurationLoaderTest.class })
 public class ConfigurationLoaderTest {
 
-    private Configuration loadConfiguration(String name)
+    private static Configuration loadConfiguration(String name)
         throws CheckstyleException {
         return loadConfiguration(name, new Properties());
     }
 
-    private Configuration loadConfiguration(
+    private static Configuration loadConfiguration(
         String name, Properties props) throws CheckstyleException {
         final String fName =
             "src/test/resources/com/puppycrawl/tools/checkstyle/configs/" + name;
@@ -213,7 +213,7 @@
             .containsKey("name.invalidPattern"));
     }
 
-    private void verifyConfigNode(
+    private static void verifyConfigNode(
         DefaultConfiguration config, String name, int childrenLength,
         Properties atts) throws Exception {
         assertEquals("name.", name, config.getName());
@@ -298,7 +298,7 @@
         }
     }
 
-    private Properties initProperties() {
+    private static Properties initProperties() {
         final Properties props = new Properties();
         props.put("a", "A");
         props.put("b", "B");
