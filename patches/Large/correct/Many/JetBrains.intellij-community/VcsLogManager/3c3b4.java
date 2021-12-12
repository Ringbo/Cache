diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
index f28498e..e69e876 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
@@ -84,7 +84,7 @@
           UIUtil.invokeLaterIfNeeded(new Runnable() {
             @Override
             public void run() {
-              if (!Disposer.isDisposed(myUi)) {
+              if (myUi != null && !Disposer.isDisposed(myUi)) {
                 myUi.setVisiblePack(pack);
               }
             }
@@ -106,7 +106,7 @@
         }
       };
     }
-    refreshLogOnVcsEvents(logProviders);
+    refreshLogOnVcsEvents(logProviders, myLogRefresher);
     logDataHolder.initialize();
 
     // todo fix selection
@@ -122,14 +122,14 @@
     return myUi.getMainFrame().getMainComponent();
   }
 
-  private void refreshLogOnVcsEvents(@NotNull Map<VirtualFile, VcsLogProvider> logProviders) {
+  private static void refreshLogOnVcsEvents(@NotNull Map<VirtualFile, VcsLogProvider> logProviders, @NotNull VcsLogRefresher refresher) {
     MultiMap<VcsLogProvider, VirtualFile> providers2roots = MultiMap.create();
     for (Map.Entry<VirtualFile, VcsLogProvider> entry : logProviders.entrySet()) {
       providers2roots.putValue(entry.getValue(), entry.getKey());
     }
 
     for (Map.Entry<VcsLogProvider, Collection<VirtualFile>> entry : providers2roots.entrySet()) {
-      entry.getKey().subscribeToRootRefreshEvents(entry.getValue(), myLogRefresher);
+      entry.getKey().subscribeToRootRefreshEvents(entry.getValue(), refresher);
     }
   }
 
