diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java
index e8d1482..275ec71 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java
@@ -70,7 +70,7 @@
                 new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
-                        Preferences.setLong(ActFmPreferenceService.PREF_USER_ID, 0); // As though no one has ever logged in
+                        Preferences.clear(ActFmPreferenceService.PREF_USER_ID); // As though no one has ever logged in
                         activity.deleteDatabase(database.getName());
                         RemoteModelDao.setOutstandingEntryFlags(RemoteModelDao.OUTSTANDING_FLAG_UNINITIALIZED);
                         System.exit(0);
