diff --git a/library-core/src/main/java/com/mikepenz/fastadapter/utils/DefaultItemListImpl.java b/library-core/src/main/java/com/mikepenz/fastadapter/utils/DefaultItemListImpl.java
index f106b0d..6898507 100644
--- a/library-core/src/main/java/com/mikepenz/fastadapter/utils/DefaultItemListImpl.java
+++ b/library-core/src/main/java/com/mikepenz/fastadapter/utils/DefaultItemListImpl.java
@@ -91,7 +91,7 @@
     @Override
     public void set(int position, Item item) {
         mItems.set(position, item);
-        getFastAdapter().notifyAdapterItemInserted(position);
+        getFastAdapter().notifyAdapterItemChanged(position);
     }
 
     @Override
