diff --git a/src/android/support/design/widget/TextInputLayout.java b/src/android/support/design/widget/TextInputLayout.java
index 21c6c53..a38439f 100644
--- a/src/android/support/design/widget/TextInputLayout.java
+++ b/src/android/support/design/widget/TextInputLayout.java
@@ -725,7 +725,7 @@
 
     private void ensureBackgroundDrawableStateWorkaround() {
         final int sdk = Build.VERSION.SDK_INT;
-        if (sdk != 21 || sdk != 22) {
+        if (sdk != 21 && sdk != 22) {
             // The workaround is only required on API 21-22
             return;
         }
