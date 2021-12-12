diff --git a/library/src/main/java/com/afollestad/materialdialogs/internal/MDButton.java b/library/src/main/java/com/afollestad/materialdialogs/internal/MDButton.java
index b9d3741..38ed502 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/internal/MDButton.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/internal/MDButton.java
@@ -81,7 +81,7 @@
     public void setDefaultSelector(Drawable d) {
         mDefaultBackground = d;
         if (!mStacked)
-            setStacked(true, true);
+            setStacked(false, true);
     }
 
     public void setAllCapsCompat(boolean allCaps) {
