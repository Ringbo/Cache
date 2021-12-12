diff --git a/app/src/main/java/com/chad/baserecyclerviewadapterhelper/HeaderAndFooterUseActivity.java b/app/src/main/java/com/chad/baserecyclerviewadapterhelper/HeaderAndFooterUseActivity.java
index 562da6e..89a65fc 100644
--- a/app/src/main/java/com/chad/baserecyclerviewadapterhelper/HeaderAndFooterUseActivity.java
+++ b/app/src/main/java/com/chad/baserecyclerviewadapterhelper/HeaderAndFooterUseActivity.java
@@ -47,7 +47,7 @@
     }
 
     private void initAdapter() {
-        mQuickAdapter = new QuickAdapter(HeaderAndFooterUseActivity.this, PAGE_SIZE);
+        mQuickAdapter = new QuickAdapter(PAGE_SIZE);
         mQuickAdapter.openLoadAnimation();
         mRecyclerView.setAdapter(mQuickAdapter);
         mQuickAdapter.setOnRecyclerViewItemClickListener(new BaseQuickAdapter.OnRecyclerViewItemClickListener() {
