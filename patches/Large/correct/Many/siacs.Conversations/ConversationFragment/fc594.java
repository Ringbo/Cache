diff --git a/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java b/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
index 299f06c..58e29d3 100644
--- a/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
+++ b/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
@@ -280,10 +280,10 @@
 						if (message.getStatus() <= Message.STATUS_RECEIVED) {
 							if (message.getConversation().getMode() == Conversation.MODE_MULTI) {
 								if (message.getPresence() != null) {
-									highlightInConference(message.getPresence().toString());
+									highlightInConference(message.getPresence().getResourcepart());
 								} else {
 									highlightInConference(message
-											.getCounterpart().toString());
+											.getContact().getDisplayName());
 								}
 							} else {
 								Contact contact = message.getConversation()
