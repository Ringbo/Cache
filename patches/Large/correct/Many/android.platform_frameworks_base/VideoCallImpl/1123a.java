diff --git a/telecomm/java/android/telecom/VideoCallImpl.java b/telecomm/java/android/telecom/VideoCallImpl.java
index ba064cf..d1474fa 100644
--- a/telecomm/java/android/telecom/VideoCallImpl.java
+++ b/telecomm/java/android/telecom/VideoCallImpl.java
@@ -176,7 +176,7 @@
 
     /** {@inheritDoc} */
     public void removeVideoCallListener() {
-        mVideoCallListener = null;
+        mCallback = null;
         try {
             mVideoProvider.removeVideoCallback(mBinder);
         } catch (RemoteException e) {
