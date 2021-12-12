diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index c9afb9f..d4a8066 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -4605,7 +4605,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return null;
-            return telephony.getForbiddenPlmns(subId, appType);
+            return telephony.getForbiddenPlmns(subId, appType, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
