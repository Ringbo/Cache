diff --git a/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java b/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java
index 306552f..a19061f 100644
--- a/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java
+++ b/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java
@@ -827,7 +827,7 @@
    */
   private static Node getEnclosingDeclNameNode(Node n) {
     Node fn = NodeUtil.getEnclosingFunction(n);
-    return fn == null ? null : NodeUtil.getFunctionNameNode(enclosingFunction);
+    return fn == null ? null : NodeUtil.getFunctionNameNode(fn);
   }
 
   /** Verify if goog.base call is used in a class */
