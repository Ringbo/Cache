diff --git a/library-core/src/main/java/com/mikepenz/fastadapter/FastAdapter.java b/library-core/src/main/java/com/mikepenz/fastadapter/FastAdapter.java
index d2c60c0..65383d6 100644
--- a/library-core/src/main/java/com/mikepenz/fastadapter/FastAdapter.java
+++ b/library-core/src/main/java/com/mikepenz/fastadapter/FastAdapter.java
@@ -1420,7 +1420,7 @@
     public static <Item extends IItem> Item getHolderAdapterItemTag(@Nullable RecyclerView.ViewHolder holder) {
         if (holder != null) {
             Object item = holder.itemView.getTag(com.mikepenz.fastadapter.R.id.fastadapter_item);
-            if (item instanceof FastAdapter) {
+            if (item instanceof IItem) {
                 return (Item) item;
             }
         }
