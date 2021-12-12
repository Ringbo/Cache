diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 2415165..7f724f1 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -726,7 +726,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getDeviceIdForPhone(slotId);
+            return info.getDeviceIdForPhone(slotId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
