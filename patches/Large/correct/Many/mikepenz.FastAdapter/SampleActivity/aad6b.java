diff --git a/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java b/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java
index f5eaa76..b3695c0 100755
--- a/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java
+++ b/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java
@@ -34,7 +34,7 @@
     //save our header or result
     private Drawer result = null;
     //save our FastAdapter
-    private FastAdapter fastAdapter;
+    private FastAdapter<SampleItem> fastAdapter;
 
     private UndoHelper undoHelper;
 
@@ -96,10 +96,10 @@
                 .build();
 
         //create our FastAdapter which will manage everything
-        fastAdapter = new FastAdapter();
+        fastAdapter = new FastAdapter<>();
 
         //create our ItemAdapter which will host our items
-        final ItemAdapter itemAdapter = new ItemAdapter();
+        final ItemAdapter<SampleItem> itemAdapter = new ItemAdapter<>();
 
         //
         undoHelper = new UndoHelper(itemAdapter, new UndoHelper.UndoListener() {
@@ -135,7 +135,7 @@
         rv.setAdapter(itemAdapter.wrap(fastAdapter));
 
         //fill with some sample data
-        List<IItem> items = new ArrayList<>();
+        List<SampleItem> items = new ArrayList<>();
         for (int i = 1; i <= 100; i++) {
             items.add(new SampleItem().withName("Test " + i).withIdentifier(100 + i));
         }
