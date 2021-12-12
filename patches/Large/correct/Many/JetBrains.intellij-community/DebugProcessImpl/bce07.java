diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
index 63b3f57..20f0cb1 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
@@ -918,7 +918,7 @@
     private final Method myMethod;
     private final List myArgs;
 
-    protected InvokeCommand(Method method, List args) {
+    protected InvokeCommand(@NotNull Method method, @NotNull List args) {
       myMethod = method;
       if (!args.isEmpty()) {
         myArgs = new ArrayList(args);
@@ -932,16 +932,16 @@
       return "INVOKE: " + super.toString();
     }
 
-    protected abstract E invokeMethod(int invokePolicy, final List args) throws InvocationException,
+    protected abstract E invokeMethod(int invokePolicy, Method method, final List args) throws InvocationException,
                                                                                 ClassNotLoadedException,
                                                                                 IncompatibleThreadStateException,
                                                                                 InvalidTypeException;
 
 
-    E start(EvaluationContextImpl evaluationContext, Method method, boolean internalEvaluate) throws EvaluateException {
+    E start(EvaluationContextImpl evaluationContext, boolean internalEvaluate) throws EvaluateException {
       while (true) {
         try {
-          return startInternal(evaluationContext, method, internalEvaluate);
+          return startInternal(evaluationContext, internalEvaluate);
         }
         catch (ClassNotLoadedException e) {
           ReferenceType loadedClass = null;
@@ -960,7 +960,7 @@
       }
     }
 
-    E startInternal(EvaluationContextImpl evaluationContext, Method method, boolean internalEvaluate)
+    E startInternal(EvaluationContextImpl evaluationContext, boolean internalEvaluate)
       throws EvaluateException, ClassNotLoadedException {
       DebuggerManagerThreadImpl.assertIsManagerThread();
       SuspendContextImpl suspendContext = evaluationContext.getSuspendContext();
@@ -976,7 +976,7 @@
       final ThreadReference invokeThreadRef = invokeThread.getThreadReference();
 
       myEvaluationDispatcher.getMulticaster().evaluationStarted(suspendContext);
-      beforeMethodInvocation(suspendContext, method, internalEvaluate);
+      beforeMethodInvocation(suspendContext, myMethod, internalEvaluate);
 
       Object resumeData = null;
       try {
@@ -1086,7 +1086,7 @@
                   }
                 }
               }
-              result[0] = invokeMethod(invokePolicy, myArgs);
+              result[0] = invokeMethod(invokePolicy, myMethod , myArgs);
             }
             finally {
               //  assertThreadSuspended(thread, context);
@@ -1147,18 +1147,21 @@
   }
 
   @Override
-  public Value invokeInstanceMethod(@NotNull EvaluationContext evaluationContext, @NotNull final ObjectReference objRef, final Method method,
-                                    final List args, final int invocationOptions) throws EvaluateException {
+  public Value invokeInstanceMethod(@NotNull EvaluationContext evaluationContext,
+                                    @NotNull final ObjectReference objRef,
+                                    @NotNull Method method,
+                                    @NotNull List args,
+                                    final int invocationOptions) throws EvaluateException {
     final ThreadReference thread = getEvaluationThread(evaluationContext);
     return new InvokeCommand<Value>(method, args) {
       @Override
-      protected Value invokeMethod(int invokePolicy, final List args) throws InvocationException, ClassNotLoadedException, IncompatibleThreadStateException, InvalidTypeException {
+      protected Value invokeMethod(int invokePolicy, Method method, final List args) throws InvocationException, ClassNotLoadedException, IncompatibleThreadStateException, InvalidTypeException {
         if (LOG.isDebugEnabled()) {
           LOG.debug("Invoke " + method.name());
         }
         return objRef.invokeMethod(thread, method, args, invokePolicy | invocationOptions);
       }
-    }.start((EvaluationContextImpl)evaluationContext, method, false);
+    }.start((EvaluationContextImpl)evaluationContext, false);
   }
 
   private static ThreadReference getEvaluationThread(final EvaluationContext evaluationContext) throws EvaluateException {
@@ -1178,13 +1181,13 @@
 
   public Value invokeMethod(@NotNull EvaluationContext evaluationContext,
                             @NotNull final ClassType classType,
-                            @NotNull final Method method,
-                            final List args,
+                            @NotNull Method method,
+                            @NotNull List args,
                             boolean internalEvaluate) throws EvaluateException {
     final ThreadReference thread = getEvaluationThread(evaluationContext);
     return new InvokeCommand<Value>(method, args) {
       @Override
-      protected Value invokeMethod(int invokePolicy, final List args) throws InvocationException,
+      protected Value invokeMethod(int invokePolicy, Method method, List args) throws InvocationException,
                                                                              ClassNotLoadedException,
                                                                              IncompatibleThreadStateException,
                                                                              InvalidTypeException {
@@ -1193,7 +1196,7 @@
         }
         return classType.invokeMethod(thread, method, args, invokePolicy);
       }
-    }.start((EvaluationContextImpl)evaluationContext, method, internalEvaluate);
+    }.start((EvaluationContextImpl)evaluationContext, internalEvaluate);
   }
 
   @Override
@@ -1209,13 +1212,14 @@
   }
 
   @Override
-  public ObjectReference newInstance(final EvaluationContext evaluationContext, final ClassType classType,
-                                     final Method method,
-                                     final List args) throws EvaluateException {
+  public ObjectReference newInstance(@NotNull final EvaluationContext evaluationContext,
+                                     @NotNull final ClassType classType,
+                                     @NotNull Method method,
+                                     @NotNull List args) throws EvaluateException {
     final ThreadReference thread = getEvaluationThread(evaluationContext);
     InvokeCommand<ObjectReference> invokeCommand = new InvokeCommand<ObjectReference>(method, args) {
       @Override
-      protected ObjectReference invokeMethod(int invokePolicy, final List args) throws InvocationException,
+      protected ObjectReference invokeMethod(int invokePolicy, Method method, List args) throws InvocationException,
                                                                                        ClassNotLoadedException,
                                                                                        IncompatibleThreadStateException,
                                                                                        InvalidTypeException {
@@ -1225,7 +1229,7 @@
         return classType.newInstance(thread, method, args, invokePolicy);
       }
     };
-    return invokeCommand.start((EvaluationContextImpl)evaluationContext, method, false);
+    return invokeCommand.start((EvaluationContextImpl)evaluationContext, false);
   }
 
   public void clearCashes(int suspendPolicy) {
