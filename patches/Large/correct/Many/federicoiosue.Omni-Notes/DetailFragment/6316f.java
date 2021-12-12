diff --git a/src/it/feio/android/omninotes/DetailFragment.java b/src/it/feio/android/omninotes/DetailFragment.java
index e91cf7d..2ebfba1 100644
--- a/src/it/feio/android/omninotes/DetailFragment.java
+++ b/src/it/feio/android/omninotes/DetailFragment.java
@@ -1655,9 +1655,8 @@
 		
 		// Checks if nothing is changed to avoid committing if possible (check)
 		if (!noteTmp.isChanged(note)) {
-//			onNoteSaved(noteTmp);
 			exitMessage = "";
-			goHome();
+			onNoteSaved(noteTmp);
 			return;
 		}		
 		
