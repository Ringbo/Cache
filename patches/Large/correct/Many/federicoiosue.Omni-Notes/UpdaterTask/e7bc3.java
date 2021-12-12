diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/async/UpdaterTask.java b/omniNotes/src/main/java/it/feio/android/omninotes/async/UpdaterTask.java
index 4545089..9937aaf 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/async/UpdaterTask.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/async/UpdaterTask.java
@@ -66,7 +66,7 @@
 	@Override
 	protected void onPreExecute() {
 		now = System.currentTimeMillis();
-		if (now > prefs.getLong(Constants.PREF_LAST_UPDATE_CHECK, 0) + Constants.UPDATE_MIN_FREQUENCY) {
+		if (now < prefs.getLong(Constants.PREF_LAST_UPDATE_CHECK, 0) + Constants.UPDATE_MIN_FREQUENCY) {
 			cancel(true);
 		}
 		super.onPreExecute();
