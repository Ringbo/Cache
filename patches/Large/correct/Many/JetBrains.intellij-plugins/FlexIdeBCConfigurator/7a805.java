diff --git a/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexIdeBCConfigurator.java b/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexIdeBCConfigurator.java
index d430c49..af9a3ae 100644
--- a/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexIdeBCConfigurator.java
+++ b/flex/src/com/intellij/lang/javascript/flex/projectStructure/FlexIdeBCConfigurator.java
@@ -238,7 +238,7 @@
     final String outputFileName = configuration.getOutputFileName();
     final String lowercase = outputFileName.toLowerCase();
     if (lowercase.endsWith(".swf") || lowercase.endsWith(".swc")) {
-      final String extension = configuration.getOutputType() == OutputType.Library ? ".swc" : ".swf";
+      final String extension = newConfiguration.getOutputType() == OutputType.Library ? ".swc" : ".swf";
       newConfiguration.setOutputFileName(outputFileName.substring(0, outputFileName.length() - ".sw_".length()) + extension);
     }
 
