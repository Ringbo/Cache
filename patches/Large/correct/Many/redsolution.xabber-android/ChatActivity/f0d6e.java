diff --git a/xabber/src/main/java/com/xabber/android/ui/activity/ChatActivity.java b/xabber/src/main/java/com/xabber/android/ui/activity/ChatActivity.java
index 3d1f279..e190b47 100644
--- a/xabber/src/main/java/com/xabber/android/ui/activity/ChatActivity.java
+++ b/xabber/src/main/java/com/xabber/android/ui/activity/ChatActivity.java
@@ -702,7 +702,7 @@
     @Override
     public void onBlockedListChanged(AccountJid account) {
         // if chat of blocked contact is currently opened, it should be closed
-        final Collection<UserJid> blockedContacts = BlockingManager.getInstance().getBlockedContacts(account);
+        final Collection<UserJid> blockedContacts = BlockingManager.getInstance().getCachedBlockedContacts(account);
         if (blockedContacts.contains(user)) {
             close();
         }
