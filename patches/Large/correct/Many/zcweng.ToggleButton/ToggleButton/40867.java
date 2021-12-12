diff --git a/ToggleButtonLib/src/com/zcw/togglebutton/ToggleButton.java b/ToggleButtonLib/src/com/zcw/togglebutton/ToggleButton.java
index b79fa5f..2080d05 100644
--- a/ToggleButtonLib/src/com/zcw/togglebutton/ToggleButton.java
+++ b/ToggleButtonLib/src/com/zcw/togglebutton/ToggleButton.java
@@ -194,7 +194,7 @@
 			widthMeasureSpec = MeasureSpec.makeMeasureSpec(widthSize, MeasureSpec.EXACTLY);
 		}
 		
-		if(heightSize == MeasureSpec.UNSPECIFIED || heightSize == MeasureSpec.AT_MOST){
+		if(heightMode == MeasureSpec.UNSPECIFIED || heightSize == MeasureSpec.AT_MOST){
 			heightSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, r.getDisplayMetrics());
 			heightMeasureSpec = MeasureSpec.makeMeasureSpec(heightSize, MeasureSpec.EXACTLY);
 		}
