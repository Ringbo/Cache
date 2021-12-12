diff --git a/app/src/main/java/com/xabber/android/ui/ChatViewer.java b/app/src/main/java/com/xabber/android/ui/ChatViewer.java
index 9433ffb..3d14bdc 100644
--- a/app/src/main/java/com/xabber/android/ui/ChatViewer.java
+++ b/app/src/main/java/com/xabber/android/ui/ChatViewer.java
@@ -179,7 +179,7 @@
         LogManager.i(this, "onNewIntent account: " + account + ", user: " + user);
 
         actionWithUser = user;
-        actionWithAccount = user;
+        actionWithAccount = account;
 
         selectPage(false);
         onChatSelected();
