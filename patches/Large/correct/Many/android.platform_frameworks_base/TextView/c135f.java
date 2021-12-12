diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 8f073de..a4a9680 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -8194,7 +8194,7 @@
         final boolean isPassword = hasPasswordTransformationMethod();
         info.setPassword(isPassword);
 
-        if (!isPassword) {
+        if (!isPassword || shouldSpeakPasswordsForAccessibility()) {
             info.setText(getTextForAccessibility());
         }
 
