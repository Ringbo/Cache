diff --git a/src/com/fsck/k9/activity/setup/AccountSettings.java b/src/com/fsck/k9/activity/setup/AccountSettings.java
index ff50eef..6e3a7ff 100644
--- a/src/com/fsck/k9/activity/setup/AccountSettings.java
+++ b/src/com/fsck/k9/activity/setup/AccountSettings.java
@@ -884,7 +884,7 @@
                 dialog = new ColorPickerDialog(this,
                         new ColorPickerDialog.OnColorChangedListener() {
                             public void colorChanged(int color) {
-                                mAccount.setChipColor(color);
+                                mAccount.setChipColor(AccountSettings.this, color);
                             }
                         },
                         mAccount.getChipColor());
