diff --git a/app/src/main/java/com/chad/baserecyclerviewadapterhelper/EmptyViewUseActivity.java b/app/src/main/java/com/chad/baserecyclerviewadapterhelper/EmptyViewUseActivity.java
index fe3d883..1ba5fd4 100644
--- a/app/src/main/java/com/chad/baserecyclerviewadapterhelper/EmptyViewUseActivity.java
+++ b/app/src/main/java/com/chad/baserecyclerviewadapterhelper/EmptyViewUseActivity.java
@@ -24,7 +24,7 @@
     }
 
     private void initAdapter() {
-        mQuickAdapter = new QuickAdapter(this, 0);
+        mQuickAdapter = new QuickAdapter(0);
         View emptyView = getLayoutInflater().inflate(R.layout.empty_view, (ViewGroup) mRecyclerView.getParent(), false);
         mQuickAdapter.setEmptyView(emptyView);
         View view = getLayoutInflater().inflate(R.layout.head_view, (ViewGroup) mRecyclerView.getParent(), false);
