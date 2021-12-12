diff --git a/services/core/java/com/android/server/trust/TrustManagerService.java b/services/core/java/com/android/server/trust/TrustManagerService.java
index 1aec569..60a8090 100644
--- a/services/core/java/com/android/server/trust/TrustManagerService.java
+++ b/services/core/java/com/android/server/trust/TrustManagerService.java
@@ -340,7 +340,7 @@
     private void removeListener(ITrustListener listener) {
         for (int i = 0; i < mTrustListeners.size(); i++) {
             if (mTrustListeners.get(i).asBinder() == listener.asBinder()) {
-                mTrustListeners.get(i);
+                mTrustListeners.remove(i);
                 return;
             }
         }
