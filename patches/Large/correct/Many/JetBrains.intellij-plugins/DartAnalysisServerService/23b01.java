diff --git a/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java b/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java
index f222ae5..a66c23d 100644
--- a/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java
+++ b/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java
@@ -362,7 +362,7 @@
       @Override
       public boolean value(final Module module) {
         return DartSdkGlobalLibUtil.isDartSdkGlobalLibAttached(module, sdk.getGlobalLibName()) &&
-               FilenameIndex.processFilesByName(PubspecYamlUtil.PUBSPEC_YAML, false,
+               !FilenameIndex.processFilesByName(PubspecYamlUtil.PUBSPEC_YAML, false,
                                                 falseProcessor, module.getModuleContentScope(), project, null);
       }
     };
