diff --git a/src/com/owncloud/android/ui/dialog/ConflictsResolveDialog.java b/src/com/owncloud/android/ui/dialog/ConflictsResolveDialog.java
index dc22812..a01a7f9 100644
--- a/src/com/owncloud/android/ui/dialog/ConflictsResolveDialog.java
+++ b/src/com/owncloud/android/ui/dialog/ConflictsResolveDialog.java
@@ -60,8 +60,8 @@
     @Override
     public Dialog onCreateDialog(Bundle savedInstanceState) {
         String remotepath = getArguments().getString("remotepath");
-        return new AlertDialog.Builder(getActivity())
-                   .setIcon(DisplayUtils.getSeasonalIconId())
+        return new AlertDialog.Builder(getActivity(), R.style.Theme_ownCloud_Dialog)
+                   .setIcon(R.drawable.ic_warning)
                    .setTitle(R.string.conflict_title)
                    .setMessage(String.format(getString(R.string.conflict_message), remotepath))
                    .setPositiveButton(R.string.conflict_use_local_version,
