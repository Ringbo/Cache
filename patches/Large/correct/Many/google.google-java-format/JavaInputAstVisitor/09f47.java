diff --git a/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java b/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
index 9cfd81c..aeabe7b 100644
--- a/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
+++ b/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
@@ -2026,7 +2026,7 @@
     boolean first = true;
     for (Type type : types) {
       if (!first) {
-        builder.breakToFill(" ");
+        builder.breakOp(" ");
         token("|");
         builder.space();
       }
