diff --git a/library/src/main/java/me/grantland/widget/AutofitHelper.java b/library/src/main/java/me/grantland/widget/AutofitHelper.java
index ab8ee53..c97e0f3 100644
--- a/library/src/main/java/me/grantland/widget/AutofitHelper.java
+++ b/library/src/main/java/me/grantland/widget/AutofitHelper.java
@@ -77,7 +77,7 @@
             precision = ta.getFloat(R.styleable.AutofitTextView_precision, precision);
             ta.recycle();
 
-            helper.setMinTextSize(minTextSize)
+            helper.setMinTextSize(TypedValue.COMPLEX_UNIT_PX, minTextSize)
                 .setPrecision(precision);
         }
         helper.setEnabled(sizeToFit);
