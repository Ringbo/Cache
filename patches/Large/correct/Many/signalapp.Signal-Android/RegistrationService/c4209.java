diff --git a/src/org/thoughtcrime/securesms/service/RegistrationService.java b/src/org/thoughtcrime/securesms/service/RegistrationService.java
index 8685ac6..7d80fa4 100644
--- a/src/org/thoughtcrime/securesms/service/RegistrationService.java
+++ b/src/org/thoughtcrime/securesms/service/RegistrationService.java
@@ -180,7 +180,7 @@
     int          registrationId = TextSecurePreferences.getLocalRegistrationId(this);
 
     if (registrationId == 0) {
-      registrationId = KeyHelper.generateRegistrationId();
+      registrationId = KeyHelper.generateRegistrationId(false);
       TextSecurePreferences.setLocalRegistrationId(this, registrationId);
     }
 
