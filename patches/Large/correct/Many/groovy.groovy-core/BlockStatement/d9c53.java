diff --git a/src/main/org/codehaus/groovy/ast/stmt/BlockStatement.java b/src/main/org/codehaus/groovy/ast/stmt/BlockStatement.java
index bbe97ca..28926eb 100644
--- a/src/main/org/codehaus/groovy/ast/stmt/BlockStatement.java
+++ b/src/main/org/codehaus/groovy/ast/stmt/BlockStatement.java
@@ -86,7 +86,7 @@
     }
 
     public String getText() {
-        StringBuffer buffer = new StringBuffer("{ ");
+        StringBuilder buffer = new StringBuilder("{ ");
         boolean first = true;
         for (Statement statement : statements) {
             if (first) {
