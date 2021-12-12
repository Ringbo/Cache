diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoaderTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoaderTest.java
index 1c35e12..cd108a1 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoaderTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoaderTest.java
@@ -40,14 +40,14 @@
 
     @Test
     public void testLoad() throws CheckstyleException {
-        final PkgControl root =
+        final ImportControl root =
                 ImportControlLoader.load(new File(getPath("import-control_complete.xml")).toURI());
         assertNotNull(root);
     }
 
     @Test(expected = CheckstyleException.class)
     public void testWrongFormatUri() throws Exception {
-        final PkgControl root =
+        final ImportControl root =
                 ImportControlLoader.load(new URI("aaa://"
                     + getPath("import-control_complete.xml")));
         assertNotNull(root);
@@ -55,7 +55,7 @@
 
     @Test
     public void testExtraElementInConfig() throws Exception {
-        final PkgControl root =
+        final ImportControl root =
                 ImportControlLoader.load(
                     new File(getPath("import-control_WithNewElement.xml")).toURI());
         assertNotNull(root);
