diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
index cbbad88..c917a63 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
@@ -154,7 +154,7 @@
                     || indentInComment < expectedMinimalIndent && isWarnComment;
         }
 
-        throw new IllegalArgumentException();
+        throw new IllegalStateException();
     }
 
     private static int getLineStart(String line, final int tabWidth) {
