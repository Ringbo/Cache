diff --git a/src/com/fsck/k9/activity/MessageList.java b/src/com/fsck/k9/activity/MessageList.java
index 917ac58..575c062 100644
--- a/src/com/fsck/k9/activity/MessageList.java
+++ b/src/com/fsck/k9/activity/MessageList.java
@@ -958,7 +958,7 @@
     @Override
     protected void onActivityResult(int requestCode, int resultCode, Intent data)
     {
-        if (resultCode == RESULT_OK)
+        if (resultCode != RESULT_OK)
             return;
 
         switch (requestCode)
