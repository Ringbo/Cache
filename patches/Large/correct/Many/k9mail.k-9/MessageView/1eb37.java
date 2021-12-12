diff --git a/src/com/fsck/k9/activity/MessageView.java b/src/com/fsck/k9/activity/MessageView.java
index a2d5fa6..6844815 100644
--- a/src/com/fsck/k9/activity/MessageView.java
+++ b/src/com/fsck/k9/activity/MessageView.java
@@ -1943,7 +1943,8 @@
                     {
                         mHandler.networkError();
                     }
-                    if (!MessageView.this.mMessage.isSet(Flag.X_DOWNLOADED_PARTIAL))
+                    if ((MessageView.this.mMessage == null) || 
+                            !MessageView.this.mMessage.isSet(Flag.X_DOWNLOADED_PARTIAL))
                     {
                         mMessageContentView.loadUrl("file:///android_asset/empty.html");
                     }
