diff --git a/core/java/android/widget/Switch.java b/core/java/android/widget/Switch.java
index 57f73ac..9ac170d 100644
--- a/core/java/android/widget/Switch.java
+++ b/core/java/android/widget/Switch.java
@@ -507,13 +507,13 @@
     }
 
     private boolean getTargetCheckedState() {
-        return mThumbPosition <= getThumbScrollRange() / 2;
+        return mThumbPosition >= getThumbScrollRange() / 2;
     }
 
     @Override
     public void setChecked(boolean checked) {
         super.setChecked(checked);
-        mThumbPosition = checked ? 0 : getThumbScrollRange();
+        mThumbPosition = checked ? getThumbScrollRange() : 0;
         invalidate();
     }
 
@@ -521,7 +521,7 @@
     protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
         super.onLayout(changed, left, top, right, bottom);
 
-        mThumbPosition = isChecked() ? 0 : getThumbScrollRange();
+        mThumbPosition = isChecked() ? getThumbScrollRange() : 0;
 
         int switchRight = getWidth() - getPaddingRight();
         int switchLeft = switchRight - mSwitchWidth;
