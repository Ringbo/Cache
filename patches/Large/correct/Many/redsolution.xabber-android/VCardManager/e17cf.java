diff --git a/xabber/src/main/java/com/xabber/android/data/extension/vcard/VCardManager.java b/xabber/src/main/java/com/xabber/android/data/extension/vcard/VCardManager.java
index a42715a..aaba062 100644
--- a/xabber/src/main/java/com/xabber/android/data/extension/vcard/VCardManager.java
+++ b/xabber/src/main/java/com/xabber/android/data/extension/vcard/VCardManager.java
@@ -128,7 +128,7 @@
         String account = accountItem.getAccount();
         if (!accountRequested.contains(account) && SettingsManager.connectionLoadVCard()) {
             String bareAddress = Jid.getBareAddress(accountItem.getRealJid());
-            if (bareAddress != null) {
+            if (bareAddress != null && !names.containsKey(bareAddress)) {
                 request(account, bareAddress);
                 accountRequested.add(account);
             }
@@ -136,7 +136,7 @@
 
         // Request vCards for new contacts.
         for (RosterContact contact : RosterManager.getInstance().getContacts()) {
-            if (account.equals(contact.getUser()) && !names.containsKey(contact.getUser())) {
+            if (account.equals(contact.getAccount()) && !names.containsKey(contact.getUser())) {
                 request(account, contact.getUser());
             }
         }
