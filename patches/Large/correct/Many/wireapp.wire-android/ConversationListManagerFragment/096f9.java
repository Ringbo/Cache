diff --git a/app/src/main/java/com/waz/zclient/pages/main/conversationlist/ConversationListManagerFragment.java b/app/src/main/java/com/waz/zclient/pages/main/conversationlist/ConversationListManagerFragment.java
index 39c35f5..88c49bc 100644
--- a/app/src/main/java/com/waz/zclient/pages/main/conversationlist/ConversationListManagerFragment.java
+++ b/app/src/main/java/com/waz/zclient/pages/main/conversationlist/ConversationListManagerFragment.java
@@ -340,7 +340,7 @@
 
     @Override
     public void onPageVisible(Page page) {
-        if (page != Page.ARCHIVE) {
+        if (page != Page.ARCHIVE && page != Page.CONVERSATION_MENU_OVER_CONVERSATION_LIST) {
             closeArchive();
         }
         if (page == Page.CONVERSATION_LIST) {
