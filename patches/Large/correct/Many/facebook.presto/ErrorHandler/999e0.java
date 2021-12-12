diff --git a/presto-parser/src/main/java/com/facebook/presto/sql/parser/ErrorHandler.java b/presto-parser/src/main/java/com/facebook/presto/sql/parser/ErrorHandler.java
index c7bd446..ecd23d8 100644
--- a/presto-parser/src/main/java/com/facebook/presto/sql/parser/ErrorHandler.java
+++ b/presto-parser/src/main/java/com/facebook/presto/sql/parser/ErrorHandler.java
@@ -86,7 +86,7 @@
             message = String.format("mismatched input '%s'. Expecting: %s", ((Token) offendingSymbol).getText(), expected);
         }
         catch (Exception exception) {
-            LOG.error(e, "Unexpected failure when handling parsing error. This is likely a bug in the implementation");
+            LOG.error(exception, "Unexpected failure when handling parsing error. This is likely a bug in the implementation");
         }
 
         throw new ParsingException(message, e, line, charPositionInLine);
