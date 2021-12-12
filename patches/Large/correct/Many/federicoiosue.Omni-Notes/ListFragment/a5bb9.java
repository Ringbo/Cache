diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
index 9dd24d7..ba041a6 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/ListFragment.java
@@ -389,7 +389,7 @@
 		@Override
 		public boolean onCreateActionMode(ActionMode mode, Menu menu) {
 			// Inflate the menu for the CAB
-			MenuInflater inflater = mode.getInflater();
+			MenuInflater inflater = mode.getMenuInflater();
 			inflater.inflate(R.menu.menu_list, menu);
 			actionMode = mode;
 
