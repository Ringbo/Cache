diff --git a/library/src/main/java/com/daimajia/numberprogressbar/NumberProgressBar.java b/library/src/main/java/com/daimajia/numberprogressbar/NumberProgressBar.java
index b121434..4379298 100644
--- a/library/src/main/java/com/daimajia/numberprogressbar/NumberProgressBar.java
+++ b/library/src/main/java/com/daimajia/numberprogressbar/NumberProgressBar.java
@@ -374,7 +374,7 @@
 
     public void setUnreachedBarColor(int barColor) {
         this.mUnreachedBarColor = barColor;
-        mUnreachedBarPaint.setColor(mReachedBarColor);
+        mUnreachedBarPaint.setColor(mUnreachedBarColor);
         invalidate();
     }
 
