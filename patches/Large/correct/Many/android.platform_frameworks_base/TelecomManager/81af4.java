diff --git a/telecomm/java/android/telecom/TelecomManager.java b/telecomm/java/android/telecom/TelecomManager.java
index 60b9cb9..5abbb50 100644
--- a/telecomm/java/android/telecom/TelecomManager.java
+++ b/telecomm/java/android/telecom/TelecomManager.java
@@ -720,20 +720,21 @@
     }
 
     /**
-     * Return whether a given phone account has a voicemail number configured.
+     * Return the voicemail number for a given phone account.
      *
-     * @param accountHandle The handle for the account to check for a voicemail number.
-     * @return {@code true} If the given phone account has a voicemail number.
+     * @param accountHandle The handle for the phone account.
+     * @return The voicemail number for the phone account, and {@code null} if one has not been
+     *         configured.
      */
-    public boolean hasVoiceMailNumber(PhoneAccountHandle accountHandle) {
+    public String getVoiceMailNumber(PhoneAccountHandle accountHandle) {
         try {
             if (isServiceConnected()) {
-                return getTelecomService().hasVoiceMailNumber(accountHandle);
+                return getTelecomService().getVoiceMailNumber(accountHandle);
             }
         } catch (RemoteException e) {
             Log.e(TAG, "RemoteException calling ITelecomService#hasVoiceMailNumber.", e);
         }
-        return false;
+        return null;
     }
 
     /**
