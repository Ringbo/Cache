diff --git a/platform/structuralsearch/source/com/intellij/structuralsearch/inspection/highlightTemplate/SSBasedInspectionOptions.java b/platform/structuralsearch/source/com/intellij/structuralsearch/inspection/highlightTemplate/SSBasedInspectionOptions.java
index 350a8c5..313f46e 100644
--- a/platform/structuralsearch/source/com/intellij/structuralsearch/inspection/highlightTemplate/SSBasedInspectionOptions.java
+++ b/platform/structuralsearch/source/com/intellij/structuralsearch/inspection/highlightTemplate/SSBasedInspectionOptions.java
@@ -196,7 +196,7 @@
           return new SearchDialog(searchContext, false, false) {
             @Override
             public Configuration createConfiguration(Configuration c) {
-              return myConfiguration.copy();
+              return configuration.copy();
             }
           };
         }
@@ -204,7 +204,7 @@
           return new ReplaceDialog(searchContext, false, false) {
             @Override
             public Configuration createConfiguration(Configuration c) {
-              return myConfiguration.copy();
+              return configuration.copy();
             }
           };
         }
