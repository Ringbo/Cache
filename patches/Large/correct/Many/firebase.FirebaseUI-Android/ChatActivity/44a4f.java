diff --git a/app/src/main/java/com/firebase/uidemo/database/ChatActivity.java b/app/src/main/java/com/firebase/uidemo/database/ChatActivity.java
index 78ad629..73b33a1 100644
--- a/app/src/main/java/com/firebase/uidemo/database/ChatActivity.java
+++ b/app/src/main/java/com/firebase/uidemo/database/ChatActivity.java
@@ -77,7 +77,7 @@
                 String uid = mAuth.getCurrentUser().getUid();
                 String name = "User " + uid.substring(0, 6);
 
-                Chat chat = new Chat(name, uid, mMessageEdit.getText().toString());
+                Chat chat = new Chat(name, mMessageEdit.getText().toString(), uid);
                 mChatRef.push().setValue(chat, new DatabaseReference.CompletionListener() {
                     @Override
                     public void onComplete(DatabaseError databaseError, DatabaseReference reference) {
