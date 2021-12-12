diff --git a/OsmAnd/src/net/osmand/plus/quickaction/QuickActionListFragment.java b/OsmAnd/src/net/osmand/plus/quickaction/QuickActionListFragment.java
index 7dcac96..c08cd7d 100644
--- a/OsmAnd/src/net/osmand/plus/quickaction/QuickActionListFragment.java
+++ b/OsmAnd/src/net/osmand/plus/quickaction/QuickActionListFragment.java
@@ -251,7 +251,7 @@
         }
 
         public void deleteItem(int position) {
-            if (position == -1)
+            if (position == -1 || position >= itemsList.size())
                 return;
 
             itemsList.remove(position);
