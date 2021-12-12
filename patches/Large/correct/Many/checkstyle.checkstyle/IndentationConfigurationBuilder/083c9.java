diff --git a/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java b/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java
index 395f4ac..f20e030 100644
--- a/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java
+++ b/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java
@@ -61,7 +61,7 @@
                     final int actualIndent = getLineStart(line, tabWidth);
 
                     if (actualIndent != indentInComment) {
-                        throw new RuntimeException(String.format(
+                        throw new IllegalStateException(String.format(
                                         "File \"%1$s\" has incorrect indentation in comment."
                                                         + "Line %2$d: comment:%3$d, actual:%4$d.",
                                         aFileName,
@@ -75,14 +75,14 @@
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
                                                     + "malformed. Error on line: %2$d(%3$s)",
                                     aFileName,
