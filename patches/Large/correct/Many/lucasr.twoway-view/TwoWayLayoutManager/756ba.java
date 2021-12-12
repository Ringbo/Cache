diff --git a/core/src/main/java/org/lucasr/twowayview/TwoWayLayoutManager.java b/core/src/main/java/org/lucasr/twowayview/TwoWayLayoutManager.java
index 7020639..2aac23c 100644
--- a/core/src/main/java/org/lucasr/twowayview/TwoWayLayoutManager.java
+++ b/core/src/main/java/org/lucasr/twowayview/TwoWayLayoutManager.java
@@ -273,7 +273,7 @@
     }
 
     private void fillSpecific(int position, Recycler recycler, State state) {
-        if (state.getItemCount() == 0) {
+        if (state.getItemCount() <= 0) {
             return;
         }
 
