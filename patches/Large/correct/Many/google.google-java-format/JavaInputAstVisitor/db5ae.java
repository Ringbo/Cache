diff --git a/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java b/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
index 336138a..996f0c8 100644
--- a/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
+++ b/core/src/main/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
@@ -2960,7 +2960,7 @@
     builder.open(plusIndent);
     token("(");
     if (!arguments.isEmpty()) {
-      if (argumentsAreTabular(arguments) == 2) {
+      if (arguments.size() % 2 == 0 && argumentsAreTabular(arguments) == 2) {
         builder.forcedBreak();
         builder.open(ZERO);
         boolean first = true;
