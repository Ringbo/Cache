diff --git a/translator/src/main/java/com/google/devtools/j2objc/gen/StatementGenerator.java b/translator/src/main/java/com/google/devtools/j2objc/gen/StatementGenerator.java
index 92ae5a0..d2d6caa 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/gen/StatementGenerator.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/gen/StatementGenerator.java
@@ -1265,7 +1265,7 @@
 
     for (CatchClause cc : node.getCatchClauses()) {
       if (cc.getException().getType() instanceof UnionType) {
-        printMultiCatch(cc, hasResources);
+        printMultiCatch(cc);
       }
       buffer.append("@catch (");
       cc.getException().accept(this);
