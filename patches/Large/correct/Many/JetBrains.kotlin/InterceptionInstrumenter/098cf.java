diff --git a/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java b/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java
index b35bd2c..3edf226 100644
--- a/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java
+++ b/compiler/preloader/instrumentation/src/org/jetbrains/jet/preloading/instrumentation/InterceptionInstrumenter.java
@@ -324,7 +324,7 @@
                         if (enterDataWritten) return;
                         enterDataWritten = true;
                         for (MethodData methodData : enterData) {
-                            invokeMethod(access, name, desc, getInstructionAdapter(), methodData);
+                            invokeMethod(access, name, desc, getInstructionAdapter(), methodData, "<init>".equals(name));
                         }
                     }
 
@@ -340,7 +340,7 @@
                             case ARETURN:
                             case ATHROW:
                                 for (MethodData methodData : exitData) {
-                                    invokeMethod(access, name, desc, getInstructionAdapter(), methodData);
+                                    invokeMethod(access, name, desc, getInstructionAdapter(), methodData, false);
                                 }
                                 break;
                         }
@@ -361,11 +361,11 @@
                 }
             }
 
-            private TraceMethodVisitor getDumpingVisitorWrapper(MethodVisitor mv, final String name, final String desc) {
+            private TraceMethodVisitor getDumpingVisitorWrapper(MethodVisitor mv, final String methodName, final String methodDesc) {
                 return new TraceMethodVisitor(mv, new Textifier() {
                     @Override
                     public void visitMethodEnd() {
-                        System.out.println(cr.getClassName() + ":" + name + desc);
+                        System.out.println(cr.getClassName() + ":" + methodName + methodDesc);
                         for (Object line : getText()) {
                             System.out.print(line);
                         }
@@ -379,7 +379,14 @@
         return cw.toByteArray();
     }
 
-    private static void invokeMethod(int access, String instrumentedMethodName, String instrumentedMethodDesc, InstructionAdapter ia, MethodData methodData) {
+    private static void invokeMethod(
+            int access,
+            String instrumentedMethodName,
+            String instrumentedMethodDesc,
+            InstructionAdapter ia,
+            MethodData methodData,
+            boolean constructorEntryPoint
+    ) {
         FieldData field = methodData.getOwnerField();
         ia.getstatic(field.getDeclaringClass(), field.getName(), field.getDesc());
         ia.checkcast(field.getRuntimeType());
@@ -392,8 +399,10 @@
             int parameterOffset = 0;
             for (int i = 0; i < parameterCount; i++) {
                 if (i == methodData.getThisParameterIndex()) {
-                    if (isStatic) {
-                        // static method, 'this' is null
+                    if (isStatic || constructorEntryPoint) {
+                        // a) static method, 'this' is null
+                        // b) At the very beginning of a constructor, i.e. before any super() call, 'this' is not available
+                        //    It's too hard to detect a place right after the super() call, so we just put null instead of 'this' in such cases
                         ia.aconst(null);
                     }
                     else {
