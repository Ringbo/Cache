diff --git a/UltimateRecyclerView/app/src/main/java/com/marshalchen/ultimaterecyclerview/demo/loadmoredemo/DebugLoadMoreActivity.java b/UltimateRecyclerView/app/src/main/java/com/marshalchen/ultimaterecyclerview/demo/loadmoredemo/DebugLoadMoreActivity.java
index a4fe4eb..4e0824c 100644
--- a/UltimateRecyclerView/app/src/main/java/com/marshalchen/ultimaterecyclerview/demo/loadmoredemo/DebugLoadMoreActivity.java
+++ b/UltimateRecyclerView/app/src/main/java/com/marshalchen/ultimaterecyclerview/demo/loadmoredemo/DebugLoadMoreActivity.java
@@ -255,7 +255,7 @@
         findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
-                simpleRecyclerViewAdapter.insertLast("rand added item");
+                simpleRecyclerViewAdapter.insertFirst("rand added item");
                 // - simpleRecyclerViewAdapter.in
             }
         });
@@ -263,8 +263,7 @@
         findViewById(R.id.del).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
-                simpleRecyclerViewAdapter.removeAt(1);
-                // - simpleRecyclerViewAdapter.in
+                simpleRecyclerViewAdapter.removeLast();
             }
         });
 
@@ -285,7 +284,7 @@
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
-        setContentView(R.layout.activity_main);
+        setContentView(R.layout.activity_loadmore);
         toolbar = (Toolbar) findViewById(R.id.tool_bar);
         setSupportActionBar(toolbar);
         getSupportActionBar().setDisplayShowTitleEnabled(false);
