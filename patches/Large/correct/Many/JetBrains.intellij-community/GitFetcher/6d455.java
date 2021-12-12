diff --git a/plugins/git4idea/src/git4idea/update/GitFetcher.java b/plugins/git4idea/src/git4idea/update/GitFetcher.java
index 47e945b..b7b4d00 100644
--- a/plugins/git4idea/src/git4idea/update/GitFetcher.java
+++ b/plugins/git4idea/src/git4idea/update/GitFetcher.java
@@ -155,7 +155,7 @@
 
   @NotNull
   private static FetchParams getFetchParams(@NotNull GitRepository repository) {
-    GitBranch currentBranch = repository.getCurrentBranch();
+    GitLocalBranch currentBranch = repository.getCurrentBranch();
     if (currentBranch == null) {
       // fetching current branch is called from Update Project and Push, where branch tracking is pre-checked
       String message = "Current branch can't be null here. \nRepository: " + repository;
