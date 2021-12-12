diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 5ece016..8460375 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -710,19 +710,19 @@
                     break;
 
                 case com.android.internal.R.styleable.TextAppearance_shadowColor:
-                    shadowcolor = a.getInt(attr, 0);
+                    shadowcolor = appearance.getInt(attr, 0);
                     break;
 
                 case com.android.internal.R.styleable.TextAppearance_shadowDx:
-                    dx = a.getFloat(attr, 0);
+                    dx = appearance.getFloat(attr, 0);
                     break;
 
                 case com.android.internal.R.styleable.TextAppearance_shadowDy:
-                    dy = a.getFloat(attr, 0);
+                    dy = appearance.getFloat(attr, 0);
                     break;
 
                 case com.android.internal.R.styleable.TextAppearance_shadowRadius:
-                    r = a.getFloat(attr, 0);
+                    r = appearance.getFloat(attr, 0);
                     break;
                 }
             }
