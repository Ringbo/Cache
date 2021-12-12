diff --git a/translator/src/test/java/com/google/devtools/j2objc/GenerationTest.java b/translator/src/test/java/com/google/devtools/j2objc/GenerationTest.java
index 2b709ba..816ff6b 100644
--- a/translator/src/test/java/com/google/devtools/j2objc/GenerationTest.java
+++ b/translator/src/test/java/com/google/devtools/j2objc/GenerationTest.java
@@ -408,7 +408,7 @@
    */
   protected String getTranslatedFile(String fileName) throws IOException {
     File f = new File(tempDir, fileName);
-    assertTrue(f.exists());
+    assertTrue(fileName + " not generated", f.exists());
     return Files.toString(f, Charset.defaultCharset());
   }
 
