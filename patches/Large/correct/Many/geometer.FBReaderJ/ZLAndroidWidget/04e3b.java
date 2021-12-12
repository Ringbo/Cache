diff --git a/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java b/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java
index 02e5071..12e007e 100644
--- a/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java
+++ b/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java
@@ -486,7 +486,7 @@
 	private int getTextViewWidth() {
 		int width = getWidth();
 		ZLView view = ZLApplication.Instance().getCurrentView();
-		if (view != null && view.showScrollbar()) {
+		if (view != null && view.isScrollbarShown()) {
 			width -= getVerticalScrollbarWidth();
 		}
 		return width;
