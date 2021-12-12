diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java
index 28aa820..3ad969d 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java
@@ -92,7 +92,7 @@
 
     private boolean isQuoteString(String str) {
         for (String[] qs : syntaxManager.getQuoteStrings()) {
-            if (str.equals(qs[0]) || str.equals(qs[0])) {
+            if (str.equals(qs[0]) || str.equals(qs[1])) {
                 return true;
             }
         }
