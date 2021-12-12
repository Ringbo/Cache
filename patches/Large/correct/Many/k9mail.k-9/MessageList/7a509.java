diff --git a/src/com/fsck/k9/activity/MessageList.java b/src/com/fsck/k9/activity/MessageList.java
index 0993c98..09b5bd4 100644
--- a/src/com/fsck/k9/activity/MessageList.java
+++ b/src/com/fsck/k9/activity/MessageList.java
@@ -1347,7 +1347,7 @@
 
     @Override
     public void updateMenu() {
-        configureMenu(mMenu);
+        invalidateOptionsMenu();
     }
 
     @Override
