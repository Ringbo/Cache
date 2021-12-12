diff --git a/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java b/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java
index 1924181..5bfb70f 100644
--- a/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java
+++ b/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java
@@ -399,7 +399,7 @@
      * @param listener
      */
     public void setOnScrollListener(RecyclerView.OnScrollListener listener) {
-        mInternalOnScrollListener = listener;
+        mExternalOnScrollListener = listener;
     }
 
     /**
