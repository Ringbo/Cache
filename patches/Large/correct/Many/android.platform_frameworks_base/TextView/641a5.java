diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 4a3a748..c330926 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -5514,7 +5514,7 @@
                      * call performClick(), but that won't do anything in
                      * this case.)
                      */
-                    if (hasOnClickListeners()) {
+                    if (!hasOnClickListeners()) {
                         if (mMovement != null && mText instanceof Editable
                                 && mLayout != null && onCheckIsTextEditor()) {
                             InputMethodManager imm = InputMethodManager.peekInstance();
@@ -5551,7 +5551,7 @@
                          * call performClick(), but that won't do anything in
                          * this case.)
                          */
-                        if (hasOnClickListeners()) {
+                        if (!hasOnClickListeners()) {
                             View v = focusSearch(FOCUS_DOWN);
 
                             if (v != null) {
