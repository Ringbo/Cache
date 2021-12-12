diff --git a/library/src/main/java/com/chad/library/adapter/base/loadmore/LoadMoreView.java b/library/src/main/java/com/chad/library/adapter/base/loadmore/LoadMoreView.java
index b7ca523..1cd65d8 100644
--- a/library/src/main/java/com/chad/library/adapter/base/loadmore/LoadMoreView.java
+++ b/library/src/main/java/com/chad/library/adapter/base/loadmore/LoadMoreView.java
@@ -54,17 +54,17 @@
     }
 
     private void visibleLoading(BaseViewHolder holder, boolean visible) {
-        holder.setVisible(getLoadingViewId(), visible);
+        holder.setGone(getLoadingViewId(), visible);
     }
 
     private void visibleLoadFail(BaseViewHolder holder, boolean visible) {
-        holder.setVisible(getLoadFailViewId(), visible);
+        holder.setGone(getLoadFailViewId(), visible);
     }
 
     private void visibleLoadEnd(BaseViewHolder holder, boolean visible) {
         final int loadEndViewId = getLoadEndViewId();
         if (loadEndViewId != 0) {
-            holder.setVisible(loadEndViewId, visible);
+            holder.setGone(loadEndViewId, visible);
         }
     }
 
