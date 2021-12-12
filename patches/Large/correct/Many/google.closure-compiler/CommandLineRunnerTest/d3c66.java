diff --git a/test/com/google/javascript/jscomp/CommandLineRunnerTest.java b/test/com/google/javascript/jscomp/CommandLineRunnerTest.java
index 8abacff..2446431 100644
--- a/test/com/google/javascript/jscomp/CommandLineRunnerTest.java
+++ b/test/com/google/javascript/jscomp/CommandLineRunnerTest.java
@@ -1759,7 +1759,7 @@
         new PrintStream(errReader));
   }
 
-  private FlagEntry<JsSourceType> createZipFile(Map<String, String> entryContentsByName)
+  private static FlagEntry<JsSourceType> createZipFile(Map<String, String> entryContentsByName)
       throws IOException {
     File tempZipFile = File.createTempFile("testdata", ".js.zip");
 
