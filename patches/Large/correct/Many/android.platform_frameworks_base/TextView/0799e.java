diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index af820ac..8db6592 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -8945,7 +8945,7 @@
         final boolean isPassword = hasPasswordTransformationMethod();
         if (!isPassword) {
             CharSequence text = getTextForAccessibility();
-            if (TextUtils.isEmpty(text)) {
+            if (!TextUtils.isEmpty(text)) {
                 event.getText().add(text);
             }
         }
