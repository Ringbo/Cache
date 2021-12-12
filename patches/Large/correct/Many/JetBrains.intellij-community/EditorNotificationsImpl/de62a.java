diff --git a/platform/platform-impl/src/com/intellij/ui/EditorNotificationsImpl.java b/platform/platform-impl/src/com/intellij/ui/EditorNotificationsImpl.java
index c5525e5..3af5079 100644
--- a/platform/platform-impl/src/com/intellij/ui/EditorNotificationsImpl.java
+++ b/platform/platform-impl/src/com/intellij/ui/EditorNotificationsImpl.java
@@ -53,7 +53,7 @@
 
   public EditorNotificationsImpl(Project project) {
     super(project);
-    myUpdateMerger = new MergingUpdateQueue("EditorNotifications update merger", 100, true, null);
+    myUpdateMerger = new MergingUpdateQueue("EditorNotifications update merger", 100, true, null, project);
     MessageBusConnection connection = project.getMessageBus().connect(project);
     connection.subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, new FileEditorManagerAdapter() {
       @Override
