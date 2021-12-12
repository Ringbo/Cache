diff --git a/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java b/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java
index a3f57ee..5c2e30b 100644
--- a/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java
+++ b/src/main/java/com/google/devtools/j2objc/util/UnicodeUtils.java
@@ -141,7 +141,7 @@
   public static boolean isValidCppCharacter(char c) {
     // This would be more efficiently implemented as a bitmap, but since it's
     // not used in performance-critical code, this form is easier to inspect.
-    return c < 0xe000 ||
+    return c < 0xd800 ||
         c >= 0xf900 && c <= 0xfad9 ||
         c >= 0xfb50 && c <= 0xfbc1 ||
         c >= 0xfbd3 && c <= 0xfd3f ||
