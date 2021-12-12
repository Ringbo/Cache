diff --git a/src/main/java/net/sf/jabref/bst/BibtexCaseChanger.java b/src/main/java/net/sf/jabref/bst/BibtexCaseChanger.java
index 158de13..a930ebb 100644
--- a/src/main/java/net/sf/jabref/bst/BibtexCaseChanger.java
+++ b/src/main/java/net/sf/jabref/bst/BibtexCaseChanger.java
@@ -277,11 +277,13 @@
      * Determine whether there starts a special char at pos (e.g., oe, AE). Return it as string.
      * If nothing found, return null
      *
+     * Also used by BibtexPurify
+     *
      * @param c the current "String"
      * @param pos the position
      * @return the special LaTeX character or null
      */
-    private static String findSpecialChar(char[] c, int pos) {
+    static String findSpecialChar(char[] c, int pos) {
         if ((pos + 1) < c.length) {
             if ((c[pos] == 'o') && (c[pos + 1] == 'e')) {
                 return "oe";
