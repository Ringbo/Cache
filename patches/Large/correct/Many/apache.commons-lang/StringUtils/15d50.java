diff --git a/src/main/java/org/apache/commons/lang3/StringUtils.java b/src/main/java/org/apache/commons/lang3/StringUtils.java
index 27e3f8e..e34d90d 100644
--- a/src/main/java/org/apache/commons/lang3/StringUtils.java
+++ b/src/main/java/org/apache/commons/lang3/StringUtils.java
@@ -5195,11 +5195,11 @@
      * <p>Checks if the CharSequence contains only unicode letters.</p>
      *
      * <p><code>null</code> will return <code>false</code>.
-     * An empty CharSequence (length()=0) will return <code>true</code>.</p>
+     * An empty CharSequence (length()=0) will return <code>false</code>.</p>
      *
      * <pre>
      * StringUtils.isAlpha(null)   = false
-     * StringUtils.isAlpha("")     = true
+     * StringUtils.isAlpha("")     = false
      * StringUtils.isAlpha("  ")   = false
      * StringUtils.isAlpha("abc")  = true
      * StringUtils.isAlpha("ab2c") = false
@@ -5209,9 +5209,10 @@
      * @param cs  the CharSequence to check, may be null
      * @return <code>true</code> if only contains letters, and is non-null
      * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)
+     * @since 3.0 Changed "" to return false and not true
      */
     public static boolean isAlpha(CharSequence cs) {
-        if (cs == null) {
+        if (cs == null || cs.length() == 0) {
             return false;
         }
         int sz = cs.length();
@@ -5262,11 +5263,11 @@
      * <p>Checks if the CharSequence contains only unicode letters or digits.</p>
      *
      * <p><code>null</code> will return <code>false</code>.
-     * An empty CharSequence (length()=0) will return <code>true</code>.</p>
+     * An empty CharSequence (length()=0) will return <code>false</code>.</p>
      *
      * <pre>
      * StringUtils.isAlphanumeric(null)   = false
-     * StringUtils.isAlphanumeric("")     = true
+     * StringUtils.isAlphanumeric("")     = false
      * StringUtils.isAlphanumeric("  ")   = false
      * StringUtils.isAlphanumeric("abc")  = true
      * StringUtils.isAlphanumeric("ab c") = false
@@ -5278,9 +5279,10 @@
      * @return <code>true</code> if only contains letters or digits,
      *  and is non-null
      * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)
+     * @since 3.0 Changed "" to return false and not true
      */
     public static boolean isAlphanumeric(CharSequence cs) {
-        if (cs == null) {
+        if (cs == null || cs.length() == 0) {
             return false;
         }
         int sz = cs.length();
@@ -5300,13 +5302,13 @@
      * An empty CharSequence (length()=0) will return <code>true</code>.</p>
      *
      * <pre>
-     * StringUtils.isAlphanumeric(null)   = false
-     * StringUtils.isAlphanumeric("")     = true
-     * StringUtils.isAlphanumeric("  ")   = true
-     * StringUtils.isAlphanumeric("abc")  = true
-     * StringUtils.isAlphanumeric("ab c") = true
-     * StringUtils.isAlphanumeric("ab2c") = true
-     * StringUtils.isAlphanumeric("ab-c") = false
+     * StringUtils.isAlphanumericSpace(null)   = false
+     * StringUtils.isAlphanumericSpace("")     = true
+     * StringUtils.isAlphanumericSpace("  ")   = true
+     * StringUtils.isAlphanumericSpace("abc")  = true
+     * StringUtils.isAlphanumericSpace("ab c") = true
+     * StringUtils.isAlphanumericSpace("ab2c") = true
+     * StringUtils.isAlphanumericSpace("ab-c") = false
      * </pre>
      *
      * @param cs  the CharSequence to check, may be null
@@ -5371,11 +5373,11 @@
      * A decimal point is not a unicode digit and returns false.</p>
      *
      * <p><code>null</code> will return <code>false</code>.
-     * An empty CharSequence (length()=0) will return <code>true</code>.</p>
+     * An empty CharSequence (length()=0) will return <code>false</code>.</p>
      *
      * <pre>
      * StringUtils.isNumeric(null)   = false
-     * StringUtils.isNumeric("")     = true
+     * StringUtils.isNumeric("")     = false
      * StringUtils.isNumeric("  ")   = false
      * StringUtils.isNumeric("123")  = true
      * StringUtils.isNumeric("12 3") = false
@@ -5387,9 +5389,10 @@
      * @param cs  the CharSequence to check, may be null
      * @return <code>true</code> if only contains digits, and is non-null
      * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)
+     * @since 3.0 Changed "" to return false and not true
      */
     public static boolean isNumeric(CharSequence cs) {
-        if (cs == null) {
+        if (cs == null || cs.length() == 0) {
             return false;
         }
         int sz = cs.length();
@@ -5410,14 +5413,14 @@
      * An empty CharSequence (length()=0) will return <code>true</code>.</p>
      *
      * <pre>
-     * StringUtils.isNumeric(null)   = false
-     * StringUtils.isNumeric("")     = true
-     * StringUtils.isNumeric("  ")   = true
-     * StringUtils.isNumeric("123")  = true
-     * StringUtils.isNumeric("12 3") = true
-     * StringUtils.isNumeric("ab2c") = false
-     * StringUtils.isNumeric("12-3") = false
-     * StringUtils.isNumeric("12.3") = false
+     * StringUtils.isNumericSpace(null)   = false
+     * StringUtils.isNumericSpace("")     = true
+     * StringUtils.isNumericSpace("  ")   = true
+     * StringUtils.isNumericSpace("123")  = true
+     * StringUtils.isNumericSpace("12 3") = true
+     * StringUtils.isNumericSpace("ab2c") = false
+     * StringUtils.isNumericSpace("12-3") = false
+     * StringUtils.isNumericSpace("12.3") = false
      * </pre>
      *
      * @param cs  the CharSequence to check, may be null
