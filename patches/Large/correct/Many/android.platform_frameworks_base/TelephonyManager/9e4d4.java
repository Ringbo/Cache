diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 3b281e2..0b5aaa3 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -766,7 +766,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getDeviceIdForPhone(slotId);
+            return info.getDeviceIdForPhone(slotId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
