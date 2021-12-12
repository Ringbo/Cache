diff --git a/src/com/fsck/k9/activity/MessageCompose.java b/src/com/fsck/k9/activity/MessageCompose.java
index 39c3482..63dcc31 100644
--- a/src/com/fsck/k9/activity/MessageCompose.java
+++ b/src/com/fsck/k9/activity/MessageCompose.java
@@ -395,7 +395,9 @@
             }
         }
         //TODO: Use constant Intent.ACTION_SEND_MULTIPLE once we drop Android 1.5 support
-        else if (Intent.ACTION_SEND.equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action))
+        else if (Intent.ACTION_SEND.equals(action)
+                || Intent.ACTION_SENDTO.equals(action)
+                || "android.intent.action.SEND_MULTIPLE".equals(action))
         {
             /*
              * Someone is trying to compose an email with an attachment, probably Pictures.
