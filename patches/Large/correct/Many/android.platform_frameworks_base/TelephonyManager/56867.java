diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index ee7f0ea..d674b31 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -3703,7 +3703,7 @@
     @SystemApi
     public void silenceRinger() {
         try {
-            getTelecomService().silenceRinger();
+            getTelecomService().silenceRinger(mContext.getOpPackageName());
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelecomService#silenceRinger", e);
         }
