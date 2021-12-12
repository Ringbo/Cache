diff --git a/library/src/se/emilsjolander/stickylistheaders/AdapterWrapper.java b/library/src/se/emilsjolander/stickylistheaders/AdapterWrapper.java
index 369d7c7..e67de0d 100644
--- a/library/src/se/emilsjolander/stickylistheaders/AdapterWrapper.java
+++ b/library/src/se/emilsjolander/stickylistheaders/AdapterWrapper.java
@@ -161,7 +161,7 @@
 	@Override
 	public WrapperView getView(int position, View convertView, ViewGroup parent) {
 		WrapperView wv = (convertView == null) ? new WrapperView(mContext) : (WrapperView) convertView;
-		View item = mDelegate.getView(position, wv.mItem, wv);
+		View item = mDelegate.getView(position, wv.mItem, parent);
 		View header = null;
 		if (previousPositionHasSameHeader(position)) {
 			recycleHeaderIfExists(wv);
