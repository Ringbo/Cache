diff --git a/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java b/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java
index f2a3e99..b4d2bbd 100644
--- a/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java
+++ b/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/UltimateRecyclerView.java
@@ -829,7 +829,7 @@
         mAdapter.setEmptyViewPolicy(policy_empty);
         mAdapter.setEmptyViewOnInitPolicy(policy_init);
 
-        if (mAdapter.getAdapterItemCount() == 0 && policy_empty == UltimateRecyclerView.STARTWITH_OFFLINE_ITEMS) {
+        if (mAdapter.getAdapterItemCount() == 0 && policy_init == UltimateRecyclerView.STARTWITH_OFFLINE_ITEMS) {
             showEmptyView();
         }
 
