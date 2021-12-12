diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncThread.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncThread.java
index 7e6ef35..7233814 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncThread.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncThread.java
@@ -321,7 +321,7 @@
                         continue;
                     }
 
-                    payload.put(0, getClientVersion());
+                    payload.put(getClientVersion());
 
                     try {
                         JSONObject response = actFmInvoker.postSync(payload, entity, token);
