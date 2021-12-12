diff --git a/compiler/tests/org/jetbrains/jet/test/generator/TestGenerator.java b/compiler/tests/org/jetbrains/jet/test/generator/TestGenerator.java
index c2237ab..bb1dfd7 100644
--- a/compiler/tests/org/jetbrains/jet/test/generator/TestGenerator.java
+++ b/compiler/tests/org/jetbrains/jet/test/generator/TestGenerator.java
@@ -66,7 +66,7 @@
         StringBuilder out = new StringBuilder();
         Printer p = new Printer(out);
 
-        p.print(FileUtil.loadFile(new File("injector-generator/copyright.txt"), true));
+        p.print(FileUtil.loadFile(new File("injector-generator/copyright.txt")));
         p.println("package ", suiteClassPackage, ";");
         p.println();
         for (String importedClassName : JUNIT3_IMPORTS) {
