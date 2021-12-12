diff --git a/plugins/git4idea/src/git4idea/log/GitLogProvider.java b/plugins/git4idea/src/git4idea/log/GitLogProvider.java
index f8bc4ca..6b5dc0f 100644
--- a/plugins/git4idea/src/git4idea/log/GitLogProvider.java
+++ b/plugins/git4idea/src/git4idea/log/GitLogProvider.java
@@ -407,7 +407,7 @@
 
     List<String> filterParameters = ContainerUtil.newArrayList();
 
-    if (filterCollection.getBranchFilter() != null) {
+    if (filterCollection.getBranchFilter() != null && !filterCollection.getBranchFilter().getBranchNames().isEmpty()) {
       GitRepository repository = getRepository(root);
       assert repository != null : "repository is null for root " + root + " but was previously reported as 'ready'";
 
