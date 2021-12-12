diff --git a/src/it/feio/android/omninotes/ListFragment.java b/src/it/feio/android/omninotes/ListFragment.java
index da1f2f0..79be9ff 100644
--- a/src/it/feio/android/omninotes/ListFragment.java
+++ b/src/it/feio/android/omninotes/ListFragment.java
@@ -1491,12 +1491,12 @@
 		// Cycles removed items to re-insert into adapter
 		for (Note note : selectedNotes) {
 			//   Manages uncategorize or archive  undo
-			if ( (undoCategorize && Navigation.checkNavigationCategory(undoCategoryList.get(note)))
-				|| undoArchive){
+			if ( (undoCategorize && !Navigation.checkNavigationCategory(undoCategoryList.get(note)))
+				|| undoArchive && Navigation.checkNavigation(Navigation.CATEGORY)){
 				if (undoCategorize) {
 					note.setCategory(undoCategoryList.get(note));
 				} else if (undoArchive) {
-					note.setArchived(!note.isArchived());
+					note.setArchived(false);
 				}
 				mAdapter.replace(note, mAdapter.getPosition(note));
 			// Manages trash undo
