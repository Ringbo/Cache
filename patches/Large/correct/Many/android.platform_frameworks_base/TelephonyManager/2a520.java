diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index e420448..279dcb0 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -1591,8 +1591,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return null;
-            return telephony.getNeighboringCellInfo(mContext.getOpPackageName(),
-                    mContext.getApplicationInfo().targetSdkVersion);
+            return telephony.getNeighboringCellInfo(mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
