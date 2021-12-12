diff --git a/facebook/src/com/facebook/android/Facebook.java b/facebook/src/com/facebook/android/Facebook.java
index e3be9e0..aa92877 100644
--- a/facebook/src/com/facebook/android/Facebook.java
+++ b/facebook/src/com/facebook/android/Facebook.java
@@ -582,7 +582,7 @@
             serviceListener.onError(new Error("Service disconnected"));
             // We returned an error so there's no point in
             // keeping the binding open.
-            mAuthActivity.unbindService(TokenRefreshServiceConnection.this);
+            applicationsContext.unbindService(TokenRefreshServiceConnection.this);
         }
 
         private void refreshToken() {
