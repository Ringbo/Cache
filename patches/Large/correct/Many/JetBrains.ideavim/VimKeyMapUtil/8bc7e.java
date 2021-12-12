diff --git a/src/com/maddyhome/idea/vim/VimKeyMapUtil.java b/src/com/maddyhome/idea/vim/VimKeyMapUtil.java
index de06e73..54cf626 100644
--- a/src/com/maddyhome/idea/vim/VimKeyMapUtil.java
+++ b/src/com/maddyhome/idea/vim/VimKeyMapUtil.java
@@ -41,7 +41,7 @@
 
     final String keyMapsPath = PathManager.getConfigPath() + File.separatorChar + "keymaps";
     final LocalFileSystem localFileSystem = LocalFileSystem.getInstance();
-    final VirtualFile keyMapsFolder = localFileSystem.findFileByPath(keyMapsPath);
+    final VirtualFile keyMapsFolder = localFileSystem.refreshAndFindFileByPath(keyMapsPath);
     if (keyMapsFolder == null) {
       LOG.debug("Failed to install vim keymap. Empty keymaps folder");
       return;
@@ -59,7 +59,7 @@
       return;
     }
     try {
-      final VirtualFile vimKeyMap2Copy = localFileSystem.findFileByIoFile(vimKeyMapFile);
+      final VirtualFile vimKeyMap2Copy = localFileSystem.refreshAndFindFileByIoFile(vimKeyMapFile);
       final VirtualFile vimKeyMapVFile = localFileSystem.copyFile(vimPlugin, vimKeyMap2Copy, keyMapsFolder, VIM_XML);
 
       final String path = vimKeyMapVFile.getPath();
@@ -81,7 +81,7 @@
       Notifications.Bus.notify(new Notification("ideavim", "IdeaVim", "Successfully installed vim keymap", NotificationType.INFORMATION));
     }
     catch (Exception e) {
-      LOG.debug("Failed to install vim keymap.\n" + e);
+      LOG.error("Failed to install vim keymap.\n" + e);
       Notifications.Bus
         .notify(new Notification("ideavim", "IdeaVim", "Failed to install vim keymap.\n" + e, NotificationType.ERROR));
       return;
@@ -168,7 +168,7 @@
       configureVimParentKeymap(path, document);
     }
     catch (Exception e) {
-      LOG.debug("Failed to reconfigure vim keymap.\n" + e);
+      LOG.error("Failed to reconfigure vim keymap.\n" + e);
       Notifications.Bus
         .notify(new Notification("ideavim", "IdeaVim", "Failed to reconfigure vim keymap.\n" + e, NotificationType.ERROR));
     }
