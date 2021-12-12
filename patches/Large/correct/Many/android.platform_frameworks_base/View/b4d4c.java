diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index a64827a..e648114 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -4215,25 +4215,25 @@
                     setAlpha(a.getFloat(attr, 1f));
                     break;
                 case com.android.internal.R.styleable.View_transformPivotX:
-                    setPivotX(a.getDimensionPixelOffset(attr, 0));
+                    setPivotX(a.getDimension(attr, 0));
                     break;
                 case com.android.internal.R.styleable.View_transformPivotY:
-                    setPivotY(a.getDimensionPixelOffset(attr, 0));
+                    setPivotY(a.getDimension(attr, 0));
                     break;
                 case com.android.internal.R.styleable.View_translationX:
-                    tx = a.getDimensionPixelOffset(attr, 0);
+                    tx = a.getDimension(attr, 0);
                     transformSet = true;
                     break;
                 case com.android.internal.R.styleable.View_translationY:
-                    ty = a.getDimensionPixelOffset(attr, 0);
+                    ty = a.getDimension(attr, 0);
                     transformSet = true;
                     break;
                 case com.android.internal.R.styleable.View_translationZ:
-                    tz = a.getDimensionPixelOffset(attr, 0);
+                    tz = a.getDimension(attr, 0);
                     transformSet = true;
                     break;
                 case com.android.internal.R.styleable.View_elevation:
-                    elevation = a.getDimensionPixelOffset(attr, 0);
+                    elevation = a.getDimension(attr, 0);
                     transformSet = true;
                     break;
                 case com.android.internal.R.styleable.View_rotation:
