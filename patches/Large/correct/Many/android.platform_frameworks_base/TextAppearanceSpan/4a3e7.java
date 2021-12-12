diff --git a/core/java/android/text/style/TextAppearanceSpan.java b/core/java/android/text/style/TextAppearanceSpan.java
index deed713..5fd7c57 100644
--- a/core/java/android/text/style/TextAppearanceSpan.java
+++ b/core/java/android/text/style/TextAppearanceSpan.java
@@ -205,7 +205,7 @@
         }
 
         if (mTextColorLink != null) {
-            ds.linkColor = mTextColor.getColorForState(ds.drawableState, 0);
+            ds.linkColor = mTextColorLink.getColorForState(ds.drawableState, 0);
         }
     }
 
