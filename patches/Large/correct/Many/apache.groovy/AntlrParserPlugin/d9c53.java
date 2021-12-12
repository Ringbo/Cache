diff --git a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
index e66d5fe..a80b7a7 100644
--- a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
+++ b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
@@ -2795,7 +2795,7 @@
         List strings = new ArrayList();
         List values = new ArrayList();
 
-        StringBuffer buffer = new StringBuffer();
+        StringBuilder buffer = new StringBuilder();
 
         boolean isPrevString = false;
 
@@ -2842,7 +2842,7 @@
         }
         if (isType(DOT, qualifiedNameNode)) {
             AST node = qualifiedNameNode.getFirstChild();
-            StringBuffer buffer = new StringBuffer();
+            StringBuilder buffer = new StringBuilder();
             boolean first = true;
 
             for (; node != null && !isType(TYPE_ARGUMENTS, node); node = node.getNextSibling()) {
