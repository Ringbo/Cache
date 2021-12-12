diff --git a/dbexample/src/main/java/com/tonicartos/superslimdbexample/ContentFragment.java b/dbexample/src/main/java/com/tonicartos/superslimdbexample/ContentFragment.java
index 94de509..2151028 100644
--- a/dbexample/src/main/java/com/tonicartos/superslimdbexample/ContentFragment.java
+++ b/dbexample/src/main/java/com/tonicartos/superslimdbexample/ContentFragment.java
@@ -59,7 +59,8 @@
     public void onViewCreated(View view, Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);
 
-        getLoaderManager().initLoader(LOADER, null, mLoaderCallbacks);
+        getLoaderManager().restartLoader(LOADER, null, mLoaderCallbacks);
+
         mAdapter = new Adapter();
 
         RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_view);
