diff --git a/app/src/main/java/com/chad/baserecyclerviewadapterhelper/PullToRefreshUseActivity.java b/app/src/main/java/com/chad/baserecyclerviewadapterhelper/PullToRefreshUseActivity.java
index ed66553..6d327ec 100644
--- a/app/src/main/java/com/chad/baserecyclerviewadapterhelper/PullToRefreshUseActivity.java
+++ b/app/src/main/java/com/chad/baserecyclerviewadapterhelper/PullToRefreshUseActivity.java
@@ -99,7 +99,7 @@
     }
 
     private void initAdapter() {
-        mQuickAdapter = new QuickAdapter(PullToRefreshUseActivity.this, PAGE_SIZE);
+        mQuickAdapter = new QuickAdapter(PAGE_SIZE);
         mQuickAdapter.openLoadAnimation();
         mRecyclerView.setAdapter(mQuickAdapter);
         mCurrentCounter = mQuickAdapter.getData().size();
