diff --git a/k9mail/src/main/java/com/fsck/k9/ui/messageview/MessageViewFragment.java b/k9mail/src/main/java/com/fsck/k9/ui/messageview/MessageViewFragment.java
index 2f9a703..d0eb34e 100644
--- a/k9mail/src/main/java/com/fsck/k9/ui/messageview/MessageViewFragment.java
+++ b/k9mail/src/main/java/com/fsck/k9/ui/messageview/MessageViewFragment.java
@@ -562,7 +562,7 @@
         DialogFragment fragment = (DialogFragment) fm.findFragmentByTag(getDialogTag(dialogId));
 
         if (fragment != null) {
-            fragment.dismiss();
+            fragment.dismissAllowingStateLoss();
         }
     }
 
