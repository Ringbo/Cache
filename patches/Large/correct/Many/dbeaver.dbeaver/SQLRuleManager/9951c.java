diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLRuleManager.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLRuleManager.java
index 2dd88b1..6ab7490 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLRuleManager.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLRuleManager.java
@@ -382,7 +382,7 @@
                     if (buffer.charAt(0) == namedParameterPrefix && buffer.length() > 1) {
                         boolean validChars = true;
                         for (int i = 1; i < buffer.length(); i++) {
-                            if (!Character.isLetterOrDigit(buffer.charAt(i))) {
+                            if (!Character.isJavaIdentifierPart(buffer.charAt(i))) {
                                 validChars = false;
                                 break;
                             }
