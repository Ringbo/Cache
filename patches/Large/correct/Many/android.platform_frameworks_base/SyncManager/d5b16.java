diff --git a/core/java/android/content/SyncManager.java b/core/java/android/content/SyncManager.java
index 80613d8..eff6f52 100644
--- a/core/java/android/content/SyncManager.java
+++ b/core/java/android/content/SyncManager.java
@@ -244,7 +244,7 @@
             // If this was the bootup case then don't sync everything, instead only
             // sync those that have an unknown syncable state, which will give them
             // a chance to set their syncable state.
-            boolean onlyThoseWithUnkownSyncableState = !justBootedUp;
+            boolean onlyThoseWithUnkownSyncableState = justBootedUp;
             scheduleSync(null, null, null, 0 /* no delay */, onlyThoseWithUnkownSyncableState);
         }
     }
