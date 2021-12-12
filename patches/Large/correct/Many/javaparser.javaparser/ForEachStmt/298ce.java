diff --git a/javaparser-core/src/main/java/com/github/javaparser/ast/stmt/ForEachStmt.java b/javaparser-core/src/main/java/com/github/javaparser/ast/stmt/ForEachStmt.java
index 73b11a9..59edd4a 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/ast/stmt/ForEachStmt.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/ast/stmt/ForEachStmt.java
@@ -151,7 +151,7 @@
              variable.getModifiers().get(0).getKeyword() != Modifier.Keyword.FINAL)) {
             throw new IllegalArgumentException("A foreach statement's variable declaration may have at most one " +
                                                "'final' modifier, and no other modifiers. Given: " +
-                                               variable.getVariables() + ".");
+                                               variable.getModifiers() + ".");
         }
         if (variable == this.variable) {
             return (ForEachStmt) this;
