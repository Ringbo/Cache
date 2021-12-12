diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/SettingsFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/SettingsFragment.java
index 765a114..2021d10 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/SettingsFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/SettingsFragment.java
@@ -511,7 +511,7 @@
 	private void importNotes() {
 		final CharSequence[] backups = StorageHelper.getExternalStoragePublicDir().list();
 
-		if (backups.length == 0) {
+		if (backups != null && backups.length == 0) {
 			((SettingsActivity)getActivity()).showMessage(R.string.no_backups_available, ONStyle.WARN);
 		} else {
 
