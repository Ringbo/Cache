diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java
index b2567c1..3912c41 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncV2Provider.java
@@ -140,9 +140,9 @@
                     time = actFmSyncService.fetchTags(time);
                     Preferences.setInt(LAST_TAG_FETCH_TIME, time);
                 } catch (JSONException e) {
-                    handler.handleException("actfm-sync", e, e.getMessage()); //$NON-NLS-1$
+                    handler.handleException("actfm-sync", e, e.toString()); //$NON-NLS-1$
                 } catch (IOException e) {
-                    handler.handleException("actfm-sync", e, e.getMessage()); //$NON-NLS-1$
+                    handler.handleException("actfm-sync", e, e.toString()); //$NON-NLS-1$
                 } finally {
                     callback.incrementProgress(20);
                     if(finisher.decrementAndGet() == 0) {
