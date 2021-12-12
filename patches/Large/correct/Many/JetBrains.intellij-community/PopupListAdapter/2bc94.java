diff --git a/platform/platform-impl/src/com/intellij/ui/popup/PopupListAdapter.java b/platform/platform-impl/src/com/intellij/ui/popup/PopupListAdapter.java
index e253529..bc6ac39 100644
--- a/platform/platform-impl/src/com/intellij/ui/popup/PopupListAdapter.java
+++ b/platform/platform-impl/src/com/intellij/ui/popup/PopupListAdapter.java
@@ -34,7 +34,7 @@
  */
 class PopupListAdapter<T> implements PopupChooserBuilder.PopupComponentAdapter<T> {
   private final JList myList;
-  private PopupChooserBuilder myBuilder;
+  private final PopupChooserBuilder myBuilder;
   private ListWithFilter myListWithFilter;
 
   PopupListAdapter(PopupChooserBuilder builder, JList list) {
@@ -88,7 +88,7 @@
 
   @Override
   public JComponent buildFinalComponent() {
-    myListWithFilter = (ListWithFilter)ListWithFilter.wrap(myList, new MyListWrapper(myList), myBuilder.getItemsNamer());
+    myListWithFilter = ListWithFilter.wrap(myList, new MyListWrapper(myList), myBuilder.getItemsNamer());
     myListWithFilter.setAutoPackHeight(myBuilder.isAutoPackHeightOnFiltering());
     return myListWithFilter;
   }
