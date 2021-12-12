diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 53cf877..37d56ee 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -1471,7 +1471,8 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return null;
-            return telephony.getNeighboringCellInfo(mContext.getOpPackageName());
+            return telephony.getNeighboringCellInfo(mContext.getOpPackageName(),
+                    mContext.getApplicationInfo().targetSdkVersion);
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
