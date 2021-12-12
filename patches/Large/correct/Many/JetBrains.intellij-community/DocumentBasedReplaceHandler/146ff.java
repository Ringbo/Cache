diff --git a/platform/structuralsearch/source/com/intellij/structuralsearch/DocumentBasedReplaceHandler.java b/platform/structuralsearch/source/com/intellij/structuralsearch/DocumentBasedReplaceHandler.java
index ec0847d..50d7f81 100644
--- a/platform/structuralsearch/source/com/intellij/structuralsearch/DocumentBasedReplaceHandler.java
+++ b/platform/structuralsearch/source/com/intellij/structuralsearch/DocumentBasedReplaceHandler.java
@@ -21,7 +21,7 @@
   private final Project myProject;
   private final Map<ReplacementInfo, RangeMarker> myRangeMarkers = new HashMap<ReplacementInfo, RangeMarker>();
 
-  DocumentBasedReplaceHandler(Project project) {
+  public DocumentBasedReplaceHandler(Project project) {
     myProject = project;
   }
 
