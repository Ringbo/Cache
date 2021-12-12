diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/log/HgLogProvider.java b/plugins/hg4idea/src/org/zmlx/hg4idea/log/HgLogProvider.java
index d92276e..fc64866 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/log/HgLogProvider.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/log/HgLogProvider.java
@@ -181,7 +181,7 @@
     List<String> filterParameters = ContainerUtil.newArrayList();
 
     // branch filter and user filter may be used several times without delimiter
-    if (filterCollection.getBranchFilter() != null) {
+    if (filterCollection.getBranchFilter() != null && !filterCollection.getBranchFilter().getBranchNames().isEmpty()) {
       HgRepository repository = myRepositoryManager.getRepositoryForRoot(root);
       if (repository == null) {
         LOG.error("Repository not found for root " + root);
