diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index ada697f..cd6a98d 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -4279,7 +4279,7 @@
         try {
             ITelephony telephony = getITelephony();
             if (telephony != null)
-                return telephony.iccTransmitApduBasicChannel(subId, cla,
+                return telephony.iccTransmitApduBasicChannel(subId, getOpPackageName(), cla,
                     instruction, p1, p2, p3, data);
         } catch (RemoteException ex) {
         } catch (NullPointerException ex) {
