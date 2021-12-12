diff --git a/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/ArrayCopyIntrinsificationTest.java b/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/ArrayCopyIntrinsificationTest.java
index aeda9fe..a922085 100644
--- a/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/ArrayCopyIntrinsificationTest.java
+++ b/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/ArrayCopyIntrinsificationTest.java
@@ -51,7 +51,7 @@
                     if (node instanceof Invoke) {
                         Invoke invoke = (Invoke) node;
                         Assert.assertTrue(invoke.callTarget() instanceof DirectCallTargetNode);
-                        DirectCallTargetNode directCall = (DirectCallTargetNode) invoke.callTarget();
+                        AbstractCallTargetNode directCall = (AbstractCallTargetNode) invoke.callTarget();
                         Assert.assertTrue(directCall.target() instanceof JavaMethod);
                         JavaMethod callee = (JavaMethod) directCall.target();
                         Assert.assertTrue(callee.getName().equals("<init>"));
@@ -64,7 +64,7 @@
                 for (Node node : graph.getNodes()) {
                     if (node instanceof Invoke) {
                         Invoke invoke = (Invoke) node;
-                        DirectCallTargetNode directCall = (DirectCallTargetNode) invoke.callTarget();
+                        AbstractCallTargetNode directCall = (AbstractCallTargetNode) invoke.callTarget();
                         JavaMethod callee = (JavaMethod) directCall.target();
                         if (callee.getDeclaringClass().equals(runtime.lookupJavaType(System.class)) && callee.getName().equals("arraycopy")) {
                             found = true;
