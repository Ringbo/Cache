diff --git a/plugins/git4idea/src/git4idea/update/GitFetcher.java b/plugins/git4idea/src/git4idea/update/GitFetcher.java
index cc5fb3d..531cd9a 100644
--- a/plugins/git4idea/src/git4idea/update/GitFetcher.java
+++ b/plugins/git4idea/src/git4idea/update/GitFetcher.java
@@ -256,7 +256,7 @@
    */
   public boolean fetchRootsAndNotify(@NotNull Collection<GitRepository> roots,
                                      @Nullable String errorNotificationTitle, boolean notifySuccess) {
-    MultiRootMessage additionalInfo = new MultiRootMessage(myProject, GitUtil.getRootsFromRepositories(roots));
+    MultiRootMessage additionalInfo = new MultiRootMessage(myProject, GitUtil.getRootsFromRepositories(roots), true);
     for (GitRepository repository : roots) {
       LOG.info("fetching " + repository);
       GitFetchResult result = fetch(repository);
