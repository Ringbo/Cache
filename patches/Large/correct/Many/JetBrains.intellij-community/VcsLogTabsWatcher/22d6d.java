diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogTabsWatcher.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogTabsWatcher.java
index c094bb8..ae352bd 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogTabsWatcher.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogTabsWatcher.java
@@ -45,7 +45,7 @@
     ApplicationManager.getApplication().invokeLater(() -> {
       project.getMessageBus().connect().subscribe(ToolWindowManagerListener.TOPIC, myPostponedEventsListener);
       installContentListener();
-    });
+    }, project.getDisposed());
   }
 
   @Nullable
