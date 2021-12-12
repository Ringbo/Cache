diff --git a/flex/tools/BuiltInFlexCompiler/Flex4Compiler/src/com/intellij/flex/compiler/flex4/Flex4MxmlcHandler.java b/flex/tools/BuiltInFlexCompiler/Flex4Compiler/src/com/intellij/flex/compiler/flex4/Flex4MxmlcHandler.java
index a18e6aa..00b97b5 100644
--- a/flex/tools/BuiltInFlexCompiler/Flex4Compiler/src/com/intellij/flex/compiler/flex4/Flex4MxmlcHandler.java
+++ b/flex/tools/BuiltInFlexCompiler/Flex4Compiler/src/com/intellij/flex/compiler/flex4/Flex4MxmlcHandler.java
@@ -43,7 +43,7 @@
     final Application application;
 
     final List fileSpecs = ((CommandLineConfiguration)configuration).getFileSpecs();
-    if (fileSpecs.size() >= 0) {
+    if (fileSpecs.size() > 0) {
       final String inputFilePath = (String)fileSpecs.get(fileSpecs.size() - 1);
       application = new Application(new File(inputFilePath));
     }
