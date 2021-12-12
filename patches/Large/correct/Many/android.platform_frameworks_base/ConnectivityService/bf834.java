diff --git a/services/java/com/android/server/ConnectivityService.java b/services/java/com/android/server/ConnectivityService.java
index faa8d3c..dd650bf 100644
--- a/services/java/com/android/server/ConnectivityService.java
+++ b/services/java/com/android/server/ConnectivityService.java
@@ -2422,15 +2422,15 @@
                     }
 
                     // Connectivity state changed:
-                    // [31-13] Reserved for future use
-                    // [12-9] Network subtype (for mobile network, as defined
+                    // [31-14] Reserved for future use
+                    // [13-10] Network subtype (for mobile network, as defined
                     //         by TelephonyManager)
-                    // [8-3] Detailed state ordinal (as defined by
+                    // [9-4] Detailed state ordinal (as defined by
                     //         NetworkInfo.DetailedState)
-                    // [2-0] Network type (as defined by ConnectivityManager)
-                    int eventLogParam = (info.getType() & 0x7) |
-                            ((info.getDetailedState().ordinal() & 0x3f) << 3) |
-                            (info.getSubtype() << 9);
+                    // [3-0] Network type (as defined by ConnectivityManager)
+                    int eventLogParam = (info.getType() & 0xf) |
+                            ((info.getDetailedState().ordinal() & 0x3f) << 4) |
+                            (info.getSubtype() << 10);
                     EventLog.writeEvent(EventLogTags.CONNECTIVITY_STATE_CHANGED,
                             eventLogParam);
 
