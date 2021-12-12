diff --git a/plugins/git4idea/src/git4idea/changes/GitCommittedChangeListProvider.java b/plugins/git4idea/src/git4idea/changes/GitCommittedChangeListProvider.java
index 932ec14..cc286d7 100644
--- a/plugins/git4idea/src/git4idea/changes/GitCommittedChangeListProvider.java
+++ b/plugins/git4idea/src/git4idea/changes/GitCommittedChangeListProvider.java
@@ -133,9 +133,9 @@
     throws VcsException {
     GitRepositoryLocation l = (GitRepositoryLocation)location;
     final Long beforeRev = settings.getChangeBeforeFilter();
-    final Long afterRev = settings.getChangeBeforeFilter();
+    final Long afterRev = settings.getChangeAfterFilter();
     final Date beforeDate = settings.getDateBeforeFilter();
-    final Date afterDate = settings.getDateBeforeFilter();
+    final Date afterDate = settings.getDateAfterFilter();
     final String author = settings.getUserFilter();
     VirtualFile root = LocalFileSystem.getInstance().findFileByIoFile(l.getRoot());
     if (root == null) {
