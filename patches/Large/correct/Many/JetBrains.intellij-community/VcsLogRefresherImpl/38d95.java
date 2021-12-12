diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
index 16848bf6..c6c7c05 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
@@ -110,9 +110,9 @@
       Map<VirtualFile, Set<VcsRef>> refs = data.getRefs();
       List<GraphCommit<Integer>> compoundList = multiRepoJoin(commits);
       compoundList = compoundList.subList(0, Math.min(myRecentCommitCount, compoundList.size()));
-      DataPack dataPack = DataPack.build(compoundList, refs, myProviders, myHashMap, false);
+      myDataPack = DataPack.build(compoundList, refs, myProviders, myHashMap, false);
       mySingleTaskController.request(RefreshRequest.RELOAD_ALL); // build/rebuild the full log in background
-      return dataPack;
+      return myDataPack;
     }
     catch (VcsException e) {
       myExceptionHandler.consume(e);
