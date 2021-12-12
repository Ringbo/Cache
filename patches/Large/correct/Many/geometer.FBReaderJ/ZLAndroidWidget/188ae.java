diff --git a/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java b/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java
index 6869dfb..18ff4a3 100644
--- a/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java
+++ b/src/org/geometerplus/zlibrary/ui/android/view/ZLAndroidWidget.java
@@ -208,7 +208,7 @@
 		}
 		final AnimationProvider animator = getAnimationProvider();
 		final int w = getWidth();
-		final int h = getHeight();
+		final int h = getMainAreaHeight();
 		switch (pageIndex) {
 			case current:
 				switch (myPageToScrollTo) {
