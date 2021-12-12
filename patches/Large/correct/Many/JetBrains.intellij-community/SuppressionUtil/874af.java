diff --git a/platform/lang-impl/src/com/intellij/codeInspection/SuppressionUtil.java b/platform/lang-impl/src/com/intellij/codeInspection/SuppressionUtil.java
index a43bc12..e2e1bf0 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/SuppressionUtil.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/SuppressionUtil.java
@@ -58,7 +58,7 @@
 
     for (@NonNls String id : ids) {
       @NonNls String trim = id.trim();
-      if (trim.equalsIgnoreCase(ALL)) return true;
+      if (trim.equals(inspectionToolID) || trim.equalsIgnoreCase(ALL)) return true;
     }
     return false;
   }
