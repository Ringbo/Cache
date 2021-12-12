diff --git a/smack-core/src/main/java/org/jivesoftware/smack/ChatManager.java b/smack-core/src/main/java/org/jivesoftware/smack/ChatManager.java
index 2796736..c568ed1 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/ChatManager.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/ChatManager.java
@@ -235,7 +235,7 @@
         Chat chat = new Chat(this, userJID, threadID);
         threadChats.put(threadID, chat);
         jidChats.put(userJID, chat);
-        baseJidChats.put(XmppStringUtils.parseBareAddress(userJID), chat);
+        baseJidChats.put(XmppStringUtils.parseBareJid(userJID), chat);
 
         for(ChatManagerListener listener : chatManagerListeners) {
             listener.chatCreated(chat, createdLocally);
@@ -248,7 +248,7 @@
         threadChats.remove(chat.getThreadID());
         String userJID = chat.getParticipant();
         jidChats.remove(userJID);
-        baseJidChats.remove(XmppStringUtils.parseBareAddress(userJID));
+        baseJidChats.remove(XmppStringUtils.parseBareJid(userJID));
     }
 
     /**
@@ -294,7 +294,7 @@
         Chat match = jidChats.get(userJID);
 	
         if (match == null && (matchMode == MatchMode.BARE_JID)) {
-            match = baseJidChats.get(XmppStringUtils.parseBareAddress(userJID));
+            match = baseJidChats.get(XmppStringUtils.parseBareJid(userJID));
         }
         return match;
     }
