diff --git a/core/java/android/animation/AnimatorInflater.java b/core/java/android/animation/AnimatorInflater.java
index ed4036d..d753e32 100644
--- a/core/java/android/animation/AnimatorInflater.java
+++ b/core/java/android/animation/AnimatorInflater.java
@@ -185,7 +185,7 @@
         TypedArray a =
                 context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.Animator);
 
-        long duration = a.getInt(com.android.internal.R.styleable.Animator_duration, 0);
+        long duration = a.getInt(com.android.internal.R.styleable.Animator_duration, 300);
 
         long startDelay = a.getInt(com.android.internal.R.styleable.Animator_startOffset, 0);
 
