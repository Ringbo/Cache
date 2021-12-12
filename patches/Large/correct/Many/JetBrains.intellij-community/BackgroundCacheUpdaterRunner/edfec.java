diff --git a/platform/lang-impl/src/com/intellij/util/indexing/BackgroundCacheUpdaterRunner.java b/platform/lang-impl/src/com/intellij/util/indexing/BackgroundCacheUpdaterRunner.java
index c0fac55..75a623f 100644
--- a/platform/lang-impl/src/com/intellij/util/indexing/BackgroundCacheUpdaterRunner.java
+++ b/platform/lang-impl/src/com/intellij/util/indexing/BackgroundCacheUpdaterRunner.java
@@ -74,13 +74,13 @@
               }
             };
 
-            while (!project.isDisposed()) {
+            while (project == null || !project.isDisposed()) {
               indicator.checkCanceled();
               if (runWhileUserInactive(project, queue, uiUpdater, updater)) {
                 break;
               }
             }
-            if (project.isDisposed()) {
+            if (project != null && project.isDisposed()) {
               indicator.cancel();
             }
           }
