diff --git a/java/java-impl/src/com/intellij/slicer/SliceManager.java b/java/java-impl/src/com/intellij/slicer/SliceManager.java
index 9bcc8ed..ea1e536 100644
--- a/java/java-impl/src/com/intellij/slicer/SliceManager.java
+++ b/java/java-impl/src/com/intellij/slicer/SliceManager.java
@@ -126,7 +126,7 @@
     analysisUIOptions.ANALYZE_TEST_SOURCES = myStoredSettings.includeTestSources;
     AnalysisScope analysisScope = new AnalysisScope(element.getContainingFile());
     String name = module == null ? null : module.getName();
-    BaseAnalysisActionDialog dialog = new BaseAnalysisActionDialog(dialogTitle, "Analyze scope", myProject, analysisScope, name, true, analysisUIOptions);
+    BaseAnalysisActionDialog dialog = new BaseAnalysisActionDialog(dialogTitle, "Analyze scope", myProject, analysisScope, name, true, analysisUIOptions, element);
     dialog.show();
     if (!dialog.isOK()) return;
 
