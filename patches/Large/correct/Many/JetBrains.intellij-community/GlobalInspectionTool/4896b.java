diff --git a/platform/analysis-api/src/com/intellij/codeInspection/GlobalInspectionTool.java b/platform/analysis-api/src/com/intellij/codeInspection/GlobalInspectionTool.java
index 077afec..51f7224 100644
--- a/platform/analysis-api/src/com/intellij/codeInspection/GlobalInspectionTool.java
+++ b/platform/analysis-api/src/com/intellij/codeInspection/GlobalInspectionTool.java
@@ -201,7 +201,7 @@
    * In some cases we can do highlighting in annotator or high. visitor based on global inspection or use a shared local inspection tool
    */
   public boolean worksInBatchModeOnly() {
-    return getSharedLocalInspectionTool() != null;
+    return getSharedLocalInspectionTool() == null;
   }
 
   /**
