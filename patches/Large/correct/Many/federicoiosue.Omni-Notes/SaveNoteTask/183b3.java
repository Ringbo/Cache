diff --git a/src/it/feio/android/omninotes/async/SaveNoteTask.java b/src/it/feio/android/omninotes/async/SaveNoteTask.java
index e105caa..720c1fa 100644
--- a/src/it/feio/android/omninotes/async/SaveNoteTask.java
+++ b/src/it/feio/android/omninotes/async/SaveNoteTask.java
@@ -75,7 +75,7 @@
 		}
 
 		// Return back to parent activity now that the heavy work is done to speed up interface
-		if (mActivity.get() != null) {
+		if (mActivity.get() != null && !mActivity.get().isFinishing()) {
 			((DetailActivity)mActivity.get()).goHome();
 		}
 	}
