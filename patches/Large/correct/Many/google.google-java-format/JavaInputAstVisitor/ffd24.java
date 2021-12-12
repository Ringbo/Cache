diff --git a/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java b/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
index d3b2ea5..144516e 100644
--- a/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
+++ b/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
@@ -1530,8 +1530,7 @@
       for (Tree typeArgument : node.getTypeArguments()) {
         if (!first) {
           token(",");
-          // TODO(cushon): unify breaks
-          builder.breakToFill(" ");
+          builder.breakOp(" ");
         }
         scan(typeArgument, null);
         first = false;
