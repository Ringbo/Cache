diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/DetailFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/DetailFragment.java
index c4eb629..424a449 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/DetailFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/DetailFragment.java
@@ -401,7 +401,7 @@
 		if (Constants.ACTION_SHORTCUT.equals(i.getAction())
 				|| Constants.ACTION_NOTIFICATION_CLICK.equals(i.getAction())) {
 			afterSavedReturnsToList = false;
-			noteOriginal = DbHelper.getInstance().getNote(i.getIntExtra(Constants.INTENT_KEY, 0));
+			noteOriginal = DbHelper.getInstance().getNote(i.getLongExtra(Constants.INTENT_KEY, 0));
 			// Checks if the note pointed from the shortcut has been deleted
 			try {
 				note = new Note(noteOriginal);
