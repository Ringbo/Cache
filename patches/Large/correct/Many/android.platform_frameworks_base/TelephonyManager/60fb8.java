diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index e334c63..03b635d 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -4539,7 +4539,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return null;
-            return telephony.getForbiddenPlmns(subId, appType);
+            return telephony.getForbiddenPlmns(subId, appType, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
