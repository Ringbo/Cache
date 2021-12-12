diff --git a/plugins/git4idea/src/git4idea/update/GitFetcher.java b/plugins/git4idea/src/git4idea/update/GitFetcher.java
index cf616b2..bfc4518 100644
--- a/plugins/git4idea/src/git4idea/update/GitFetcher.java
+++ b/plugins/git4idea/src/git4idea/update/GitFetcher.java
@@ -270,7 +270,7 @@
   @Deprecated
   public boolean fetchRootsAndNotify(@NotNull Collection<GitRepository> roots,
                                      @Nullable String errorNotificationTitle, boolean notifySuccess) {
-    MultiRootMessage additionalInfo = new MultiRootMessage(myProject, GitUtil.getRootsFromRepositories(roots), true);
+    MultiRootMessage additionalInfo = new MultiRootMessage(myProject, GitUtil.getRootsFromRepositories(roots), false, true);
     for (GitRepository repository : roots) {
       LOG.info("fetching " + repository);
       GitFetchResult result = fetch(repository);
