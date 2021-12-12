diff --git a/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java b/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java
index bc1db55..a79862a 100644
--- a/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java
+++ b/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java
@@ -690,7 +690,7 @@
          * + getItemCount is zero
          */
         if (mAdapter.getAdapterItemCount() == 0) {
-            mEmpty.setVisibility(mEmptyId == 0 ? View.VISIBLE : View.GONE);
+            mEmpty.setVisibility(mEmptyId != 0 ? View.VISIBLE : View.GONE);
         }
         if (mAdapter.getCustomLoadMoreView() == null) return;
         if (mAdapter.getAdapterItemCount() >= showLoadMoreItemNum && mAdapter.getCustomLoadMoreView().getVisibility() == View.GONE) {
