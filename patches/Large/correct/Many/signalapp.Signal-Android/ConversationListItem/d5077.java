diff --git a/src/org/thoughtcrime/securesms/ConversationListItem.java b/src/org/thoughtcrime/securesms/ConversationListItem.java
index ed231c7..141d940 100644
--- a/src/org/thoughtcrime/securesms/ConversationListItem.java
+++ b/src/org/thoughtcrime/securesms/ConversationListItem.java
@@ -202,7 +202,7 @@
   }
 
   private void setStatusIcons(ThreadRecord thread) {
-    if (!thread.isOutgoing()) {
+    if (!thread.isOutgoing() || thread.isOutgoingCall()) {
       deliveryStatusIndicator.setNone();
       alertView.setNone();
     } else if (thread.isFailed()) {
