diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallUtils.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallUtils.java
index f06bc70..ae011b0 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallUtils.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/OptimizedCallUtils.java
@@ -45,7 +45,7 @@
 
             public boolean visit(List<TruffleInlining> decisionStack, Node node) {
                 if (node == null) {
-                    return false;
+                    return true;
                 }
                 int level = CallTreeNodeVisitor.getNodeDepth(decisionStack, node);
                 for (int i = 0; i < level; i++) {
@@ -79,7 +79,7 @@
                     p.println(node.getClass().getSimpleName());
                 }
                 p.flush();
-                return false;
+                return true;
             }
 
         }, true);
