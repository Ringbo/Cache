diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/util/HgUtil.java b/plugins/hg4idea/src/org/zmlx/hg4idea/util/HgUtil.java
index 0e0f526..81a770b 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/util/HgUtil.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/util/HgUtil.java
@@ -545,7 +545,7 @@
   @Nullable
   public static HgRepository getCurrentRepository(@NotNull Project project) {
     if (project.isDisposed()) return null;
-    return DvcsUtil.guessRepositoryForFile(project, getRepositoryManager(project), HgVcs.getInstance(project),
+    return DvcsUtil.guessRepositoryForFile(project, getRepositoryManager(project),
                                            DvcsUtil.getSelectedFile(project),
                                            HgProjectSettings.getInstance(project).getRecentRootPath());
   }
