diff --git a/src/it/feio/android/omninotes/DetailFragment.java b/src/it/feio/android/omninotes/DetailFragment.java
index 3486f45..68b53bd 100644
--- a/src/it/feio/android/omninotes/DetailFragment.java
+++ b/src/it/feio/android/omninotes/DetailFragment.java
@@ -1010,7 +1010,7 @@
 		}
 		
 		// Otherwise the result is passed to ListActivity
-		if (getActivity().getSupportFragmentManager() != null) {
+		if (getActivity() != null && getActivity().getSupportFragmentManager() != null) {
 			getActivity().getSupportFragmentManager().popBackStack();
 			if (getActivity().getSupportFragmentManager().getBackStackEntryCount() == 1) {
 				((MainActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(true);
@@ -1665,7 +1665,7 @@
 	void saveNote(OnNoteSaved mOnNoteSaved) {
 		
 		// Saving is avoided if note is masked and password still note inserted
-		if (note.isLocked() && !note.isPasswordChecked()) {
+		if (noteTmp.isLocked() && !noteTmp.isPasswordChecked()) {
 			return;
 		}
 		
