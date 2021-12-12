diff --git a/src/it/feio/android/omninotes/BaseActivity.java b/src/it/feio/android/omninotes/BaseActivity.java
index 8d39ded..60695a8 100644
--- a/src/it/feio/android/omninotes/BaseActivity.java
+++ b/src/it/feio/android/omninotes/BaseActivity.java
@@ -322,7 +322,7 @@
 		}
 		
 		LayoutParams lp = new LayoutParams(300, 300);
-		lp.bottomMargin = DensityUtil.convertPixelsToDp(100, this);
+		lp.bottomMargin = DensityUtil.dpToPx(100, this);
 		lp.setMargins(12, 12, 12, getResources().getDimensionPixelSize(R.dimen.showcase_margin_bottom));
 		co.buttonLayoutParams = lp;				
 		
