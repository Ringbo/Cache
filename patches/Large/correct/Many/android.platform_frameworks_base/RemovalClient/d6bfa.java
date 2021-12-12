diff --git a/services/core/java/com/android/server/fingerprint/RemovalClient.java b/services/core/java/com/android/server/fingerprint/RemovalClient.java
index 6610634..88a6bdd 100644
--- a/services/core/java/com/android/server/fingerprint/RemovalClient.java
+++ b/services/core/java/com/android/server/fingerprint/RemovalClient.java
@@ -91,7 +91,7 @@
         } catch (RemoteException e) {
             Slog.w(TAG, "Failed to notify Removed:", e);
         }
-        return fingerId == 0;
+        return remaining == 0;
     }
 
     @Override
