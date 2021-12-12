diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLWordRule.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLWordRule.java
index 55123c7..ed6fd81 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLWordRule.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLWordRule.java
@@ -77,7 +77,7 @@
         }
         // Check for delimiter
         for (char[] wordDelimiter : delimiters) {
-            if (c == wordDelimiter[0]) {
+            if (!Character.isLetter(c) && c == wordDelimiter[0]) {
                 if (wordDelimiter.length == 1) {
                     return false;
                 }
