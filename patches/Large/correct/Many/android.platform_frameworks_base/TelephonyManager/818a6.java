diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 0e58388..fb1ec3c 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -4192,7 +4192,8 @@
     }
 
     /**
-     * Returns the voice mail count for a subscription. Return 0 if unavailable.
+     * Returns the voice mail count for a subscription. Return 0 if unavailable or the caller does
+     * not have the READ_PHONE_STATE permission.
      * @param subId whose voice message count is returned
      * @hide
      */
@@ -4203,7 +4204,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return 0;
-            return telephony.getVoiceMessageCountForSubscriber(subId);
+            return telephony.getVoiceMessageCountForSubscriber(subId, getOpPackageName());
         } catch (RemoteException ex) {
             return 0;
         } catch (NullPointerException ex) {
