diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
index cfc9454..1489b26 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
@@ -79,7 +79,7 @@
                     final int actualIndent = getLineStart(line, tabWidth);
 
                     if (actualIndent != indentInComment) {
-                        throw new RuntimeException(String.format(
+                        throw new IllegalStateException(String.format(
                                         "File \"%1$s\" has incorrect indentation in comment."
                                                         + "Line %2$d: comment:%3$d, actual:%4$d.",
                                         aFileName,
@@ -93,14 +93,14 @@
                     }
 
                     if (!isCommentConsistent(comment)) {
-                        throw new RuntimeException(String.format(
+                        throw new IllegalStateException(String.format(
                                         "File \"%1$s\" has inconsistent comment on line %2$d",
                                         aFileName,
                                         lineNumber));
                     }
                 }
                 else if (NONEMPTY_LINE_REGEX.matcher(line).matches()) {
-                    throw new RuntimeException(String.format(
+                    throw new IllegalStateException(String.format(
                                     "File \"%1$s\" has no indentation comment or its format "
                                                     + "malformed. Error on line: %2$d",
                                     aFileName,
