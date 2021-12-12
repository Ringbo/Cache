diff --git a/src/org/thoughtcrime/securesms/database/loaders/ConversationListLoader.java b/src/org/thoughtcrime/securesms/database/loaders/ConversationListLoader.java
index abc0b27..d4a3475 100644
--- a/src/org/thoughtcrime/securesms/database/loaders/ConversationListLoader.java
+++ b/src/org/thoughtcrime/securesms/database/loaders/ConversationListLoader.java
@@ -21,8 +21,7 @@
   @Override
   public Cursor getCursor() {
     if (filter != null && filter.trim().length() != 0) {
-      List<String> numbers = ContactAccessor.getInstance()
-          .getNumbersForThreadSearchFilter(filter, context);
+      List<String> numbers = ContactAccessor.getInstance().getNumbersForThreadSearchFilter(context, filter);
 
       return DatabaseFactory.getThreadDatabase(context).getFilteredConversationList(numbers);
     } else {
