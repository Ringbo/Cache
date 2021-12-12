diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListWorker.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListWorker.java
index 15997df..e179878 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListWorker.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListWorker.java
@@ -699,7 +699,7 @@
     if (changeCandidate == null) {
       return ThreeState.NO;
     }
-    return FileUtil.isAncestorThreeState(changeCandidate.getPath(), dir.getPath(), false);
+    return FileUtil.isAncestorThreeState(dir.getPath(), changeCandidate.getPath(), false);
   }
 
   @NotNull
