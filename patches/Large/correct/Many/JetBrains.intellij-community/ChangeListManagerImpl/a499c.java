diff --git a/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java b/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
index e5621b1..ada2828 100644
--- a/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
+++ b/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
@@ -247,7 +247,7 @@
         }
 
         synchronized (myPendingUpdatesLock) {
-          scheduleUpdate(0);
+          scheduleUpdate(10);
           while (ourUpdateAlarm.getActiveRequestCount() > 0 || myUpdateInProgress) {
             if (indicator != null && indicator.isCanceled()) break;
 
