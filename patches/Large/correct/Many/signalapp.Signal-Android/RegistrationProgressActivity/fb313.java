diff --git a/src/org/thoughtcrime/securesms/RegistrationProgressActivity.java b/src/org/thoughtcrime/securesms/RegistrationProgressActivity.java
index 98d1dbf..8804897 100644
--- a/src/org/thoughtcrime/securesms/RegistrationProgressActivity.java
+++ b/src/org/thoughtcrime/securesms/RegistrationProgressActivity.java
@@ -515,7 +515,7 @@
         @Override
         protected Integer doInBackground(Void... params) {
           try {
-            TextSecureAccountManager accountManager = TextSecureCommunicationFactory.createManager(context);
+            TextSecureAccountManager accountManager = TextSecureCommunicationFactory.createManager(context, e164number, password);
             int registrationId = TextSecurePreferences.getLocalRegistrationId(context);
 
             accountManager.verifyAccount(code, signalingKey, true, registrationId);
@@ -608,7 +608,7 @@
         @Override
         protected Integer doInBackground(Void... params) {
           try {
-            TextSecureAccountManager accountManager = TextSecureCommunicationFactory.createManager(context);
+            TextSecureAccountManager accountManager = TextSecureCommunicationFactory.createManager(context, e164number, password);
             accountManager.requestVoiceVerificationCode();
 
             return SUCCESS;
