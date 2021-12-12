diff --git a/app/src/main/java/com/mikepenz/fastadapter/app/AdvancedSampleActivity.java b/app/src/main/java/com/mikepenz/fastadapter/app/AdvancedSampleActivity.java
index ffebca6..82d9155 100755
--- a/app/src/main/java/com/mikepenz/fastadapter/app/AdvancedSampleActivity.java
+++ b/app/src/main/java/com/mikepenz/fastadapter/app/AdvancedSampleActivity.java
@@ -43,7 +43,7 @@
     //save our FastAdapter
     private FastAdapter<IItem> mFastAdapter;
     private HeaderAdapter<SampleItem> mHeaderAdapter;
-    private ItemAdapter<ExpandableItem> mItemAdapter;
+    private ItemAdapter<IItem> mItemAdapter;
 
     private ActionModeHelper mActionModeHelper;
 
@@ -147,7 +147,7 @@
     private void setItems() {
         mHeaderAdapter.add(new SampleItem().withName("Header").withSelectable(false).withIdentifier(1));
         //fill with some sample data
-        List<ExpandableItem> items = new ArrayList<>();
+        List<IItem> items = new ArrayList<>();
         int size = new Random().nextInt(25) + 10;
         for (int i = 1; i <= size; i++) {
 
@@ -168,7 +168,7 @@
                 expandableItem.withSubItems(subItems);
                 items.add(expandableItem);
             } else {
-                items.add(new ExpandableItem().withName("Test " + i).withHeader(headers[i / 5]));
+                items.add(new SampleItem().withName("Test " + i).withHeader(headers[i / 5]));
             }
         }
         mItemAdapter.set(items);
