diff --git a/telecomm/java/android/telecom/TelecomManager.java b/telecomm/java/android/telecom/TelecomManager.java
index 7e89745..c848f77 100644
--- a/telecomm/java/android/telecom/TelecomManager.java
+++ b/telecomm/java/android/telecom/TelecomManager.java
@@ -1301,7 +1301,7 @@
     public boolean endCall() {
         try {
             if (isServiceConnected()) {
-                return getTelecomService().endCall();
+                return getTelecomService().endCall(mContext.getPackageName());
             }
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelecomService#endCall", e);
