diff --git a/core/java/android/view/inputmethod/InputMethodSubtype.java b/core/java/android/view/inputmethod/InputMethodSubtype.java
index 9d84c3e..4a98336 100644
--- a/core/java/android/view/inputmethod/InputMethodSubtype.java
+++ b/core/java/android/view/inputmethod/InputMethodSubtype.java
@@ -160,10 +160,10 @@
         if (mSubtypeNameResId == 0) {
             return localeStr;
         }
-        final String subtypeName = context.getPackageManager().getText(
-                packageName, mSubtypeNameResId, appInfo).toString();
+        final CharSequence subtypeName = context.getPackageManager().getText(
+                packageName, mSubtypeNameResId, appInfo);
         if (!TextUtils.isEmpty(subtypeName)) {
-            return String.format(subtypeName, localeStr);
+            return String.format(subtypeName.toString(), localeStr);
         } else {
             return localeStr;
         }
