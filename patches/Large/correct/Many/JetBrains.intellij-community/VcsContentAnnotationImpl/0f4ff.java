diff --git a/platform/vcs-api/src/com/intellij/openapi/vcs/contentAnnotation/VcsContentAnnotationImpl.java b/platform/vcs-api/src/com/intellij/openapi/vcs/contentAnnotation/VcsContentAnnotationImpl.java
index 18e680a..243e0fc 100644
--- a/platform/vcs-api/src/com/intellij/openapi/vcs/contentAnnotation/VcsContentAnnotationImpl.java
+++ b/platform/vcs-api/src/com/intellij/openapi/vcs/contentAnnotation/VcsContentAnnotationImpl.java
@@ -76,7 +76,7 @@
   public boolean intervalRecentlyChanged(VirtualFile file, TextRange lineInterval, VcsRevisionNumber currentRevisionNumber) {
     final ProjectLevelVcsManager vcsManager = ProjectLevelVcsManager.getInstance(myProject);
     final AbstractVcs vcs = vcsManager.getVcsFor(file);
-    if (vcs == null) return false;
+    if (vcs == null || vcs.getDiffProvider() == null) return false;
     if (currentRevisionNumber == null) {
       currentRevisionNumber = vcs.getDiffProvider().getCurrentRevision(file);
       assert currentRevisionNumber != null;
