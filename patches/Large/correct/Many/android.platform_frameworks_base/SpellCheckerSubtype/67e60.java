diff --git a/core/java/android/view/textservice/SpellCheckerSubtype.java b/core/java/android/view/textservice/SpellCheckerSubtype.java
index f235295..c753188 100644
--- a/core/java/android/view/textservice/SpellCheckerSubtype.java
+++ b/core/java/android/view/textservice/SpellCheckerSubtype.java
@@ -146,7 +146,10 @@
         return false;
     }
 
-    private static Locale constructLocaleFromString(String localeStr) {
+    /**
+     * @hide
+     */
+    public static Locale constructLocaleFromString(String localeStr) {
         if (TextUtils.isEmpty(localeStr))
             return null;
         String[] localeParams = localeStr.split("_", 3);
