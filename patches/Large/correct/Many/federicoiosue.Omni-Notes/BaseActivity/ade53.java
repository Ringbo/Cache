diff --git a/src/it/feio/android/omninotes/BaseActivity.java b/src/it/feio/android/omninotes/BaseActivity.java
index e9fca1b..d757886 100644
--- a/src/it/feio/android/omninotes/BaseActivity.java
+++ b/src/it/feio/android/omninotes/BaseActivity.java
@@ -349,7 +349,7 @@
 		lp.setMargins(12, 12, 12, getResources().getDimensionPixelSize(R.dimen.showcase_margin_bottom));
 		co.buttonLayoutParams = lp;				
 		
-		co.fadeInDuration = 500;
+		co.fadeInDuration = 700;
 		
 		ItemViewProperties ivp;
 		for (Integer[] view : viewsArrays) {
