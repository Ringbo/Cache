diff --git a/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java b/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java
index b51dfa3..cb26a95 100644
--- a/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java
+++ b/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java
@@ -431,7 +431,7 @@
             }
 
             private TraceMethodVisitor getDumpingVisitorWrapper(MethodVisitor mv, final String methodName, final String methodDesc) {
-                return new TraceMethodVisitor(mv, new Textifier() {
+                return new TraceMethodVisitor(mv, new Textifier(ASM5) {
                     @Override
                     public void visitMethodEnd() {
                         System.out.println(cr.getClassName() + ":" + methodName + methodDesc);
@@ -479,7 +479,7 @@
                 if (i == methodData.getThisParameterIndex()) {
                     if (isStatic || thisUnavailable) {
                         // a) static method, 'this' is null
-                        // b) this is not available (some locations in constructors
+                        // b) this is not available (some locations in constructors)
                         ia.aconst(null);
                     }
                     else {
