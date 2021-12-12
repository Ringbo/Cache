diff --git a/QKSMS/src/main/java/com/moez/QKSMS/ui/messagelist/MessageListFragment.java b/QKSMS/src/main/java/com/moez/QKSMS/ui/messagelist/MessageListFragment.java
index ff90ceb..24a7569 100644
--- a/QKSMS/src/main/java/com/moez/QKSMS/ui/messagelist/MessageListFragment.java
+++ b/QKSMS/src/main/java/com/moez/QKSMS/ui/messagelist/MessageListFragment.java
@@ -780,7 +780,7 @@
         inflater.inflate(R.menu.conversation, menu);
         setTitle();
 
-        ConversationPrefsHelper conversationPrefs = new ConversationPrefsHelper(mContext, mThreadId);
+        ConversationPrefsHelper conversationPrefs = new ConversationPrefsHelper(context, mThreadId);
         menu.findItem(R.id.menu_notifications).setTitle(conversationPrefs.getNotificationsEnabled() ?
                 R.string.menu_notifications : R.string.menu_notifications_off);
         menu.findItem(R.id.menu_notifications).setIcon(conversationPrefs.getNotificationsEnabled() ?
