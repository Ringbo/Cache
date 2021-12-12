diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 78d18e6..caa30a1 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -2257,7 +2257,7 @@
 	            mSimpleCard.setBackgroundColor(mCurrentBackgroundColor);
 	            mSimpleCard.setTextColor(mForegroundColor);
 			}
-			if (mSimpleCard.getVisibility() != View.VISIBLE) {
+			if (mSimpleCard.getVisibility() != View.VISIBLE || (mCard != null && mCard.getVisibility() == View .VISIBLE)) {
 				mSimpleCard.setVisibility(View.VISIBLE);
 				mCard.setVisibility(View.GONE);				
 			}
@@ -2274,7 +2274,7 @@
 	                mCustomFontStyle = getCustomFontsStyle() + getDefaultFontStyle();
 	            }
 			}
-			if (mCard.getVisibility() != View.VISIBLE) {
+			if (mCard.getVisibility() != View.VISIBLE || (mSimpleCard != null && mSimpleCard.getVisibility() == View .VISIBLE)) {
 				mSimpleCard.setVisibility(View.GONE);
 				mCard.setVisibility(View.VISIBLE);				
 			}
