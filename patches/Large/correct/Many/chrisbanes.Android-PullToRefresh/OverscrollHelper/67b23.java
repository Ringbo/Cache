diff --git a/library/src/com/handmark/pulltorefresh/library/OverscrollHelper.java b/library/src/com/handmark/pulltorefresh/library/OverscrollHelper.java
index ef9602d..9818921 100644
--- a/library/src/com/handmark/pulltorefresh/library/OverscrollHelper.java
+++ b/library/src/com/handmark/pulltorefresh/library/OverscrollHelper.java
@@ -5,7 +5,7 @@
 final class OverscrollHelper {
 
 	static void overScrollBy(PullToRefreshBase<?> view, int deltaY, int scrollY, boolean isTouchEvent) {
-		final Mode mode = view.getCurrentMode();
+		final Mode mode = view.getMode();
 
 		if (mode != Mode.DISABLED && !isTouchEvent) {
 			final int newY = (deltaY + scrollY);
