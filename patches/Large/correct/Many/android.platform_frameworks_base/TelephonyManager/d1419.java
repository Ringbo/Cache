diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 8291a30..c6fadda 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -2143,7 +2143,7 @@
         try {
             ITelephony telephony = getITelephony();
             if (telephony != null)
-                return telephony.getMergedSubscriberIds();
+                return telephony.getMergedSubscriberIds(mContext.getOpPackageName());
         } catch (RemoteException ex) {
         } catch (NullPointerException ex) {
         }
