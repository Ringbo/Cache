diff --git a/xabber/src/main/java/com/xabber/android/ui/dialog/AccountSyncDialogFragment.java b/xabber/src/main/java/com/xabber/android/ui/dialog/AccountSyncDialogFragment.java
index a15f22b..434e426 100644
--- a/xabber/src/main/java/com/xabber/android/ui/dialog/AccountSyncDialogFragment.java
+++ b/xabber/src/main/java/com/xabber/android/ui/dialog/AccountSyncDialogFragment.java
@@ -53,7 +53,7 @@
 
         AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
         builder.setView(setupView())
-                .setMessage(R.string.title_sync);
+                .setTitle(R.string.title_sync);
 
 
         if (!noCancel) {
