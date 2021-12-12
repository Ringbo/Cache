diff --git a/xabber/src/main/java/com/xabber/android/data/xaccount/XabberAccountManager.java b/xabber/src/main/java/com/xabber/android/data/xaccount/XabberAccountManager.java
index d1a21f6..9ed08db 100644
--- a/xabber/src/main/java/com/xabber/android/data/xaccount/XabberAccountManager.java
+++ b/xabber/src/main/java/com/xabber/android/data/xaccount/XabberAccountManager.java
@@ -424,7 +424,7 @@
             // add to sync only accounts required sync
             XMPPAccountSettings accountSettings = getAccountSettings(dtoItem.getJid());
             if (accountSettings != null) {
-                if (accountSettings.isSynchronization()) {
+                if (accountSettings.isSynchronization() || SettingsManager.isSyncAllAccounts()) {
                     realmItem.setSynchronization(accountSettings.isSynchronization());
                     realmItems.add(realmItem);
                 }
