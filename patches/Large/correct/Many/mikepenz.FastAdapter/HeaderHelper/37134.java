diff --git a/library-extensions/src/main/java/com/mikepenz/fastadapter_extensions/HeaderHelper.java b/library-extensions/src/main/java/com/mikepenz/fastadapter_extensions/HeaderHelper.java
index fb78092..44bcaea 100644
--- a/library-extensions/src/main/java/com/mikepenz/fastadapter_extensions/HeaderHelper.java
+++ b/library-extensions/src/main/java/com/mikepenz/fastadapter_extensions/HeaderHelper.java
@@ -11,10 +11,10 @@
  * Created by mikepenz on 17.08.16.
  */
 
-public class HeaderHelper<Item> {
+public class HeaderHelper<Item, HeaderItem> {
     private ItemAdapter itemAdapter;
     private GenericItemAdapter genericItemAdapter;
-    private GroupingFunction<Item> groupingFunction;
+    private GroupingFunction<Item, HeaderItem> groupingFunction;
     private Comparator<Item> comparator;
 
     /**
@@ -28,7 +28,7 @@
      * @param itemAdapter
      * @param groupingFunction
      */
-    public HeaderHelper(ItemAdapter itemAdapter, GroupingFunction<Item> groupingFunction) {
+    public HeaderHelper(ItemAdapter itemAdapter, GroupingFunction<Item, HeaderItem> groupingFunction) {
         this.itemAdapter = itemAdapter;
         this.groupingFunction = groupingFunction;
     }
@@ -37,7 +37,7 @@
      * @param genericItemAdapter
      * @param groupingFunction
      */
-    public HeaderHelper(GenericItemAdapter genericItemAdapter, GroupingFunction<Item> groupingFunction) {
+    public HeaderHelper(GenericItemAdapter genericItemAdapter, GroupingFunction<Item, HeaderItem> groupingFunction) {
         this.genericItemAdapter = genericItemAdapter;
         this.groupingFunction = groupingFunction;
     }
@@ -47,7 +47,7 @@
      *
      * @param items the list which will get the headers added inbetween
      */
-    public void apply(List<Item> items) {
+    public void apply(List items) {
         //sort beforehand
         if (comparator != null) {
             Collections.sort(items, comparator);
@@ -55,13 +55,13 @@
 
         //we have to get the list size each time, as we will add the headers to it
         for (int i = -1; i < items.size(); i++) {
-            Item headerItem;
+            HeaderItem headerItem;
             if (i == -1) {
-                headerItem = groupingFunction.group(null, items.get(i + 1), i);
+                headerItem = groupingFunction.group(null, (Item) items.get(i + 1), i);
             } else if (i == items.size() - 1) {
-                headerItem = groupingFunction.group(items.get(i), null, i);
+                headerItem = groupingFunction.group((Item) items.get(i), null, i);
             } else {
-                headerItem = groupingFunction.group(items.get(i), items.get(i + 1), i);
+                headerItem = groupingFunction.group((Item) items.get(i), (Item) items.get(i + 1), i);
             }
 
             if (headerItem != null) {
@@ -128,25 +128,25 @@
     /**
      * @return the function used to determine headers
      */
-    public GroupingFunction<Item> getGroupingFunction() {
+    public GroupingFunction<Item, HeaderItem> getGroupingFunction() {
         return groupingFunction;
     }
 
     /**
      * @param groupingFunction the function used to determine headers
      */
-    public void setGroupingFunction(GroupingFunction<Item> groupingFunction) {
+    public void setGroupingFunction(GroupingFunction<Item, HeaderItem> groupingFunction) {
         this.groupingFunction = groupingFunction;
     }
 
 
-    public interface GroupingFunction<Item> {
+    public interface GroupingFunction<Item, HeaderItem> {
         /**
          * @param currentItem     the current item we check
          * @param nextItem        the item comming after the current item
          * @param currentPosition the current position of the currentItem
          * @return the HeaderItem we want to add after the currentItem
          */
-        Item group(Item currentItem, Item nextItem, int currentPosition);
+        HeaderItem group(Item currentItem, Item nextItem, int currentPosition);
     }
 }
