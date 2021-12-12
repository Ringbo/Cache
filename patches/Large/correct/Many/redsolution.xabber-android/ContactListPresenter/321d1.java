diff --git a/xabber/src/main/java/com/xabber/android/presentation/mvp/contactlist/ContactListPresenter.java b/xabber/src/main/java/com/xabber/android/presentation/mvp/contactlist/ContactListPresenter.java
index 90ff85d..4832cb0 100644
--- a/xabber/src/main/java/com/xabber/android/presentation/mvp/contactlist/ContactListPresenter.java
+++ b/xabber/src/main/java/com/xabber/android/presentation/mvp/contactlist/ContactListPresenter.java
@@ -405,7 +405,7 @@
                     filterString != null);
 
         if (view != null) {
-            if (items.size() == 1) {
+            if (items.size() == 1 && (filterString == null || filterString.isEmpty())) {
                 if (currentChatsState == ContactListAdapter.ChatListState.unread)
                     view.showPlaceholder(context.getString(R.string.placeholder_no_unread));
                 if (currentChatsState == ContactListAdapter.ChatListState.archived)
