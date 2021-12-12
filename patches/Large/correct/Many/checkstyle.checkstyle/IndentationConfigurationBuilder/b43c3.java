diff --git a/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java b/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java
index e872768..841ca74 100644
--- a/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java
+++ b/src/it/java/com/google/checkstyle/test/base/IndentationConfigurationBuilder.java
@@ -139,7 +139,7 @@
                     || indentInComment < expectedMinimalIndent && isWarnComment;
         }
 
-        throw new IllegalArgumentException();
+        throw new IllegalArgumentException("Cannot determine if commit is consistent");
     }
 
     private static int getLineStart(String line, final int tabWidth)
