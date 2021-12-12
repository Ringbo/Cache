diff --git a/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java b/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java
index 5acd84d..62ab8c4 100644
--- a/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java
+++ b/plugins/git4idea/src/git4idea/branch/GitBranchUtil.java
@@ -59,9 +59,9 @@
    * or null if there is no such information (i.e. if the branch doesn't have a tracking branch).
    */
   @Nullable
-  public static GitBranchTrackInfo getTrackInfoForBranch(@NotNull GitRepository repository, @NotNull GitBranch branch) {
+  public static GitBranchTrackInfo getTrackInfoForBranch(@NotNull GitRepository repository, @NotNull GitLocalBranch branch) {
     for (GitBranchTrackInfo trackInfo : repository.getBranchTrackInfos()) {
-      if (trackInfo.getLocalBranch().equals(branch.getName())) {
+      if (trackInfo.getLocalBranch().equals(branch)) {
         return trackInfo;
       }
     }
