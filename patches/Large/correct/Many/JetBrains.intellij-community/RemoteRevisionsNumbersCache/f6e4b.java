diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/RemoteRevisionsNumbersCache.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/RemoteRevisionsNumbersCache.java
index e90ff29..a2627a4 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/RemoteRevisionsNumbersCache.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/RemoteRevisionsNumbersCache.java
@@ -223,7 +223,7 @@
       if (queue != null) return queue;
 
       queue = new LazyRefreshingSelfQueue<>(() -> myVcsConfiguration.CHANGED_ON_SERVER_INTERVAL > 0
-             ? myVcsConfiguration.CHANGED_ON_SERVER_INTERVAL * 60000
+             ? myVcsConfiguration.CHANGED_ON_SERVER_INTERVAL * 60000L
              : ourRottenPeriod, new MyShouldUpdateChecker(vcsRoot), new MyUpdater(vcsRoot));
       myRefreshingQueues.put(vcsRoot, queue);
       return queue;
