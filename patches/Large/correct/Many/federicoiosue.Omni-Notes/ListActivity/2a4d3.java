diff --git a/src/it/feio/android/omninotes/ListActivity.java b/src/it/feio/android/omninotes/ListActivity.java
index 5f97271..cd889b8 100644
--- a/src/it/feio/android/omninotes/ListActivity.java
+++ b/src/it/feio/android/omninotes/ListActivity.java
@@ -902,7 +902,7 @@
 		// If just one note is selected its tag will be set as pre-selected
 		if (selectedNotes.size() == 1) {
 			for (Note note : selectedNotes) {
-				if (note.getTag().getId() != 0)
+				if (note.getTag() != null && note.getTag().getId() != 0)
 					candidateSelectedTag = note.getTag();
 				else 
 					candidateSelectedTag = tags.get(0);
