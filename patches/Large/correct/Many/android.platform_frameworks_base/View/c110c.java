diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 39f1170..147120e 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -6844,7 +6844,7 @@
         if (isAutofillable() && isAttachedToWindow()) {
             AutofillManager afm = getAutofillManager();
             if (afm != null) {
-                if (enter && hasWindowFocus() && isFocused()) {
+                if (enter && hasWindowFocus() && isFocused() && isVisibleToUser()) {
                     afm.notifyViewEntered(this);
                 } else if (!hasWindowFocus() || !isFocused()) {
                     afm.notifyViewExited(this);
