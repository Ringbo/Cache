diff --git a/app/src/main/java/com/mikepenz/fastadapter/app/EndlessScrollListActivity.java b/app/src/main/java/com/mikepenz/fastadapter/app/EndlessScrollListActivity.java
index 55804dc..dcb38f3 100755
--- a/app/src/main/java/com/mikepenz/fastadapter/app/EndlessScrollListActivity.java
+++ b/app/src/main/java/com/mikepenz/fastadapter/app/EndlessScrollListActivity.java
@@ -94,7 +94,7 @@
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setItemAnimator(new DefaultItemAnimator());
         recyclerView.setAdapter(footerAdapter.wrap(fastItemAdapter));
-        recyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
+        recyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener(footerAdapter) {
             @Override
             public void onLoadMore(final int currentPage) {
                 footerAdapter.clear();
@@ -135,7 +135,7 @@
 
     @Override
     protected void onSaveInstanceState(Bundle outState) {
-        //add the values which need to be saved from the adapter to the bundel
+        //add the values which need to be saved from the adapter to the bundle
         outState = fastItemAdapter.saveInstanceState(outState);
         super.onSaveInstanceState(outState);
     }
