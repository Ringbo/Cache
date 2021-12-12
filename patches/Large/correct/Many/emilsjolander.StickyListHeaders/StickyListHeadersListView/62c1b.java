diff --git a/library/src/com/emilsjolander/components/StickyListHeaders/StickyListHeadersListView.java b/library/src/com/emilsjolander/components/StickyListHeaders/StickyListHeadersListView.java
index 8c216d1..72594a7 100644
--- a/library/src/com/emilsjolander/components/StickyListHeaders/StickyListHeadersListView.java
+++ b/library/src/com/emilsjolander/components/StickyListHeaders/StickyListHeadersListView.java
@@ -207,7 +207,7 @@
 		if(scrollListener!=null){
 			scrollListener.onScroll(view,firstVisibleItem,visibleItemCount,totalItemCount);
 		}
-		if(getAdapter()==null) return;
+		if(getAdapter()==null || getAdapter().getCount() == 0) return;
 		if(areHeadersSticky){
 			if(getChildCount()!=0){
 				if(lastWatchedViewHeader!=null){
