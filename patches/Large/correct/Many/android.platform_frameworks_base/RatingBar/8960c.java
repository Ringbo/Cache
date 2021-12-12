diff --git a/core/java/android/widget/RatingBar.java b/core/java/android/widget/RatingBar.java
index 2230961..3ad05b5 100644
--- a/core/java/android/widget/RatingBar.java
+++ b/core/java/android/widget/RatingBar.java
@@ -110,8 +110,8 @@
         }
 
         // A touch inside a star fill up to that fractional area (slightly more
-        // than 1 so boundaries round up).
-        mTouchProgressOffset = 1.1f;
+        // than 0.5 so boundaries round up).
+        mTouchProgressOffset = 0.6f;
     }
 
     public RatingBar(Context context, AttributeSet attrs) {
