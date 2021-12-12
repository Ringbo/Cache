diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java
index c34391e..b0e759a 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/MultiUserChat.java
@@ -316,7 +316,7 @@
         connection.addSyncStanzaListener(presenceListener, new AndFilter(fromRoomFilter,
                         StanzaTypeFilter.PRESENCE));
         connection.addSyncStanzaListener(subjectListener, new AndFilter(fromRoomFilter,
-                        MessageWithSubjectFilter.INSTANCE));
+                        MessageWithSubjectFilter.INSTANCE, new NotFilter(MessageTypeFilter.ERROR)));
         connection.addSyncStanzaListener(declinesListener, new AndFilter(new StanzaExtensionFilter(MUCUser.ELEMENT,
                         MUCUser.NAMESPACE), new NotFilter(MessageTypeFilter.ERROR)));
         connection.addPacketInterceptor(presenceInterceptor, new AndFilter(new ToFilter(room),
