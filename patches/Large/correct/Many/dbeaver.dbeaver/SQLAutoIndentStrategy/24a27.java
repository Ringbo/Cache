diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java
index 5c827c7..d2abacb 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/indent/SQLAutoIndentStrategy.java
@@ -92,8 +92,8 @@
             if (ch == '"') {
                 quoteStart = i;
                 break;
-            } else if (Character.isUnicodeIdentifierPart(ch)) {
-                // Letter before quote
+            } else if (Character.isUnicodeIdentifierPart(ch) || ch == '{' || ch == '<' || ch == '[') {
+                // Letter or bracket before quote
                 return false;
             }
         }
