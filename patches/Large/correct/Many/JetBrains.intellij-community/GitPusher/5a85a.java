diff --git a/plugins/git4idea/src/git4idea/push/GitPusher.java b/plugins/git4idea/src/git4idea/push/GitPusher.java
index f7396fd..6749e45 100644
--- a/plugins/git4idea/src/git4idea/push/GitPusher.java
+++ b/plugins/git4idea/src/git4idea/push/GitPusher.java
@@ -350,7 +350,8 @@
         boolean rebase = getMergeOrRebaseConfig(project, root);
         String mergeOrRebase = rebase ? ".rebase" : ".merge";
         GitConfigUtil.setValue(project, root, "branch." + branchName + ".remote", remote.getName());
-        GitConfigUtil.setValue(project, root, "branch." + branchName + mergeOrRebase, dest.getNameForRemoteOperations());
+        GitConfigUtil.setValue(project, root, "branch." + branchName + mergeOrRebase,
+                               GitBranch.REFS_HEADS_PREFIX + dest.getNameForRemoteOperations());
       }
       catch (VcsException e) {
         LOG.error(String.format("Couldn't set up tracking for source branch %s, target branch %s, remote %s in root %s",
@@ -366,9 +367,9 @@
     return autoSetupRebase != null && (autoSetupRebase.equals("remote") || autoSetupRebase.equals("always"));
   }
 
-  private static boolean branchTrackingInfoIsSet(@NotNull GitRepository repository, @NotNull GitBranch source) {
+  private static boolean branchTrackingInfoIsSet(@NotNull GitRepository repository, @NotNull GitLocalBranch source) {
     for (GitBranchTrackInfo trackInfo : repository.getBranchTrackInfos()) {
-      if (trackInfo.getLocalBranch().equals(source.getName())) {
+      if (trackInfo.getLocalBranch().equals(source)) {
         return true;
       }
     }
