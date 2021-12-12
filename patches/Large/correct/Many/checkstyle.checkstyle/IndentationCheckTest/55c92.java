diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
index 2ad47a9..a3266ac 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentationCheckTest.java
@@ -154,7 +154,7 @@
                     || indentInComment < expectedMinimalIndent && isWarnComment;
         }
 
-        throw new IllegalStateException();
+        throw new IllegalStateException("Comments are not consistent");
     }
 
     private static int getLineStart(String line, final int tabWidth) {
