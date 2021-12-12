diff --git a/graal/GraalCompiler/src/com/sun/c1x/ir/Invoke.java b/graal/GraalCompiler/src/com/sun/c1x/ir/Invoke.java
index e8e2032..48aede1 100644
--- a/graal/GraalCompiler/src/com/sun/c1x/ir/Invoke.java
+++ b/graal/GraalCompiler/src/com/sun/c1x/ir/Invoke.java
@@ -93,7 +93,7 @@
      * @param target the target method being called
      * @param stateBefore the state before executing the invocation
      */
-    public Invoke(int opcode, CiKind result, Value[] args, RiMethod target, RiType returnType, Graph graph, int bci) {
+    public Invoke(int bci, int opcode, CiKind result, Value[] args, RiMethod target, RiType returnType, Graph graph) {
         super(result, args.length, SUCCESSOR_COUNT, graph);
         this.opcode = opcode;
         this.target = target;
@@ -185,7 +185,7 @@
 
     @Override
     public Node copy(Graph into) {
-        Invoke x = new Invoke(opcode, kind, new Value[argumentCount], target, returnType, into);
+        Invoke x = new Invoke(bci, opcode, kind, new Value[argumentCount], target, returnType, into);
         x.setNonNull(isNonNull());
         return x;
     }
