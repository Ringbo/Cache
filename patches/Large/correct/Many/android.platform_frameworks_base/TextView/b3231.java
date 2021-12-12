diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 8ec52bd..175ffb8 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -1162,12 +1162,12 @@
 
                 case com.android.internal.R.styleable.TextView_fontFamily:
                     try {
-                        fontTypeface = appearance.getFont(attr);
+                        fontTypeface = a.getFont(attr);
                     } catch (UnsupportedOperationException e) {
                         // Expected if it is not a font resource.
                     }
                     if (fontTypeface == null) {
-                        fontFamily = appearance.getString(attr);
+                        fontFamily = a.getString(attr);
                     }
                     fontFamilyExplicit = true;
                     break;
