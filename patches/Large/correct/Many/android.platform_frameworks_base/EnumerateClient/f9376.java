diff --git a/services/core/java/com/android/server/fingerprint/EnumerateClient.java b/services/core/java/com/android/server/fingerprint/EnumerateClient.java
index 12827d0..b6bbd1b 100644
--- a/services/core/java/com/android/server/fingerprint/EnumerateClient.java
+++ b/services/core/java/com/android/server/fingerprint/EnumerateClient.java
@@ -95,7 +95,7 @@
         } catch (RemoteException e) {
             Slog.w(TAG, "Failed to notify enumerated:", e);
         }
-        return fingerId == 0; // done when id hits 0
+        return remaining == 0;
     }
 
     @Override
