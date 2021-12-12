diff --git a/lib/src/main/java/com/rey/material/widget/EditText.java b/lib/src/main/java/com/rey/material/widget/EditText.java
index 8b7167a..53cee93 100644
--- a/lib/src/main/java/com/rey/material/widget/EditText.java
+++ b/lib/src/main/java/com/rey/material/widget/EditText.java
@@ -514,7 +514,7 @@
 		int supportWidth = 0;
 		int supportHeight = 0;
 		
-		if(mLabelView != null){
+		if(mLabelView != null && mLabelView.getLayoutParams() != null){
 			mLabelView.measure(tempWidthSpec, tempHeightSpec);
 			labelWidth = mLabelView.getMeasuredWidth();
 			labelHeight = mLabelView.getMeasuredHeight();
@@ -524,7 +524,7 @@
 		inputWidth = mInputView.getMeasuredWidth();
 		inputHeight = mInputView.getMeasuredHeight();
 		
-		if(mSupportView != null){
+		if(mSupportView != null && mSupportView.getLayoutParams() != null){
 			mSupportView.measure(tempWidthSpec, tempHeightSpec);
 			supportWidth = mSupportView.getMeasuredWidth();
 			supportHeight = mSupportView.getMeasuredHeight();
@@ -560,12 +560,12 @@
 		setMeasuredDimension(width, height);		
 		
 		tempWidthSpec = MeasureSpec.makeMeasureSpec(width - getPaddingLeft() - getPaddingRight(),  MeasureSpec.EXACTLY);
-		if(mLabelView != null)
+		if(mLabelView != null && mLabelView.getLayoutParams() != null)
 			mLabelView.measure(tempWidthSpec, tempHeightSpec);
 		
 		mInputView.measure(tempWidthSpec, tempHeightSpec);
 		
-		if(mSupportView != null)
+		if(mSupportView != null && mSupportView.getLayoutParams() != null)
 			mSupportView.measure(tempWidthSpec, tempHeightSpec);				
 	}	
 
