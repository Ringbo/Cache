diff --git a/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java b/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
index 0c097d3..861411e 100644
--- a/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
+++ b/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
@@ -1590,7 +1590,7 @@
 				for (int i = pos; i >= 0; --i) {
 					try {
 						message = (Message) binding.messagesView.getItemAtPosition(i);
-					} catch (ArrayIndexOutOfBoundsException e) {
+					} catch (IndexOutOfBoundsException e) {
 						//should not happen if we synchronize properly. however if that fails we just gonna try item -1
 						continue;
 					}
