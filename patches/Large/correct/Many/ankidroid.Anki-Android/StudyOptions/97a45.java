diff --git a/src/com/ichi2/anki/StudyOptions.java b/src/com/ichi2/anki/StudyOptions.java
index b2fa2e2..aa43796 100644
--- a/src/com/ichi2/anki/StudyOptions.java
+++ b/src/com/ichi2/anki/StudyOptions.java
@@ -1684,7 +1684,7 @@
 	        if (allTags == null) {
 	            allTags = deck3.allTags_();
 	            Log.i(AnkiDroidApp.TAG, "all tags: " + Arrays.toString(allTags));
-		        if (allCramTags == null) {
+		        if (allTags == null) {
 		        	Themes.showThemedToast(StudyOptions.this, getResources().getString(R.string.error_insufficient_memory), false);
 		        	ad.setEnabled(false);
 		        	return;
