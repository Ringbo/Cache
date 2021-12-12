diff --git a/plugins/git4idea/src/git4idea/GitUtil.java b/plugins/git4idea/src/git4idea/GitUtil.java
index ce3c2d0..e8feaf2 100644
--- a/plugins/git4idea/src/git4idea/GitUtil.java
+++ b/plugins/git4idea/src/git4idea/GitUtil.java
@@ -889,7 +889,7 @@
    */
   @Nullable
   public static GitBranchTrackInfo getTrackInfoForCurrentBranch(@NotNull GitRepository repository) {
-    GitBranch currentBranch = repository.getCurrentBranch();
+    GitLocalBranch currentBranch = repository.getCurrentBranch();
     if (currentBranch == null) {
       return null;
     }
