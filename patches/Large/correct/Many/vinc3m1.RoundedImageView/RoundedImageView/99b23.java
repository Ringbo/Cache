diff --git a/library/src/com/makeramen/rounded/RoundedImageView.java b/library/src/com/makeramen/rounded/RoundedImageView.java
index 8d1be68..477d12e 100644
--- a/library/src/com/makeramen/rounded/RoundedImageView.java
+++ b/library/src/com/makeramen/rounded/RoundedImageView.java
@@ -119,7 +119,7 @@
 	
 	@Override
 	public void setImageDrawable(Drawable drawable) {
-		if (mDrawable != null) {
+		if (drawable != null) {
 			mDrawable = RoundedDrawable.fromDrawable(drawable, mCornerRadius, mBorderWidth, mBorderColor);
 			((RoundedDrawable) mDrawable).setScaleType(mScaleType); 
 		 } else {
