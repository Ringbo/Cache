diff --git a/xabber/src/main/java/com/xabber/android/ui/adapter/ContactItemInflater.java b/xabber/src/main/java/com/xabber/android/ui/adapter/ContactItemInflater.java
index 467fb92..71ce36a 100644
--- a/xabber/src/main/java/com/xabber/android/ui/adapter/ContactItemInflater.java
+++ b/xabber/src/main/java/com/xabber/android/ui/adapter/ContactItemInflater.java
@@ -70,7 +70,7 @@
 
         viewHolder.name.setText(contact.getName());
 
-        if (MUCManager.getInstance().hasRoom(contact.getAccount(), Jid.getBareAddress(contact.getName()))) {
+        if (MUCManager.getInstance().hasRoom(contact.getAccount(), Jid.getBareAddress(contact.getUser()))) {
             viewHolder.mucIndicator.setVisibility(View.VISIBLE);
         } else {
             viewHolder.mucIndicator.setVisibility(View.GONE);
