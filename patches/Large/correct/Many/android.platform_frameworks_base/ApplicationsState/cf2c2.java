diff --git a/packages/SettingsLib/src/com/android/settingslib/applications/ApplicationsState.java b/packages/SettingsLib/src/com/android/settingslib/applications/ApplicationsState.java
index 8f7efb5..336942a 100644
--- a/packages/SettingsLib/src/com/android/settingslib/applications/ApplicationsState.java
+++ b/packages/SettingsLib/src/com/android/settingslib/applications/ApplicationsState.java
@@ -332,7 +332,7 @@
         if (DEBUG_LOCKING) Log.v(TAG, "requestSize about to acquire lock...");
         synchronized (mEntriesMap) {
             AppEntry entry = mEntriesMap.get(userId).get(packageName);
-            if (entry != null) {
+            if (entry != null && (entry.info.flags & ApplicationInfo.FLAG_INSTALLED) != 0) {
                 mBackgroundHandler.post(() -> {
                     final StorageStats stats = mStats.queryStatsForPackage(entry.info.volumeUuid,
                             packageName, UserHandle.of(userId));
@@ -964,7 +964,8 @@
                         long now = SystemClock.uptimeMillis();
                         for (int i=0; i<mAppEntries.size(); i++) {
                             AppEntry entry = mAppEntries.get(i);
-                            if (entry.size == SIZE_UNKNOWN || entry.sizeStale) {
+                            if ((entry.info.flags & ApplicationInfo.FLAG_INSTALLED) != 0
+                                    && (entry.size == SIZE_UNKNOWN || entry.sizeStale)) {
                                 if (entry.sizeLoadStart == 0 ||
                                         (entry.sizeLoadStart < (now-20*1000))) {
                                     if (!mRunning) {
