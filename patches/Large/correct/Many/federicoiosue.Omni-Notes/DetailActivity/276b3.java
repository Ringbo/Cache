diff --git a/src/it/feio/android/omninotes/DetailActivity.java b/src/it/feio/android/omninotes/DetailActivity.java
index 00001ab..268c07e 100644
--- a/src/it/feio/android/omninotes/DetailActivity.java
+++ b/src/it/feio/android/omninotes/DetailActivity.java
@@ -163,7 +163,7 @@
 	private void init(boolean checkedNoteLock) {
 		note = (Note) getIntent().getParcelableExtra(Constants.INTENT_NOTE);		
 		
-		if (note.get_id() != 0) {
+		if (note != null && note.get_id() != 0) {
 			if (!checkedNoteLock) {
 				checkNoteLock(note);
 				return;
