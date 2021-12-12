diff --git a/src/com/origamilabs/library/views/StaggeredGridView.java b/src/com/origamilabs/library/views/StaggeredGridView.java
index ecdd6a6..c20bba1 100644
--- a/src/com/origamilabs/library/views/StaggeredGridView.java
+++ b/src/com/origamilabs/library/views/StaggeredGridView.java
@@ -1269,7 +1269,7 @@
             final int childRight = childLeft + child.getMeasuredWidth();
             
             if(position == 0){
-            	if(this.getChildCount()>1){
+            	if(this.getChildCount()>1 && this.mColCount>1){
             		childTop = this.getChildAt(1).getTop();
             		childBottom = childTop + childHeight;
             	}
