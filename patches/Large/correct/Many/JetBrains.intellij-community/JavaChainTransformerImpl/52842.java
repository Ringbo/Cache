diff --git a/plugins/stream-debugger/src/com/intellij/debugger/streams/psi/impl/JavaChainTransformerImpl.java b/plugins/stream-debugger/src/com/intellij/debugger/streams/psi/impl/JavaChainTransformerImpl.java
index 3afe28c..bdf73d6 100644
--- a/plugins/stream-debugger/src/com/intellij/debugger/streams/psi/impl/JavaChainTransformerImpl.java
+++ b/plugins/stream-debugger/src/com/intellij/debugger/streams/psi/impl/JavaChainTransformerImpl.java
@@ -68,7 +68,7 @@
   }
 
   @NotNull
-  private GenericType getGenericTypeOfThis(PsiExpression expression) {
+  private static GenericType getGenericTypeOfThis(PsiExpression expression) {
     final PsiClass klass = ClassUtils.getContainingClass(expression);
 
     return klass == null ? JavaTypes.INSTANCE.getANY()
@@ -76,7 +76,7 @@
   }
 
   @NotNull
-  private List<IntermediateStreamCall> createIntermediateCalls(@NotNull GenericType producerAfterType,
+  private static List<IntermediateStreamCall> createIntermediateCalls(@NotNull GenericType producerAfterType,
                                                                @NotNull List<PsiMethodCallExpression> expressions) {
     final List<IntermediateStreamCall> result = new ArrayList<>();
 
@@ -94,7 +94,7 @@
   }
 
   @NotNull
-  private TerminatorStreamCall createTerminationCall(@NotNull GenericType typeBefore, @NotNull PsiMethodCallExpression expression) {
+  private static TerminatorStreamCall createTerminationCall(@NotNull GenericType typeBefore, @NotNull PsiMethodCallExpression expression) {
     final String name = resolveMethodName(expression);
     final List<CallArgument> args = resolveArguments(expression);
     final GenericType resultType = resolveTerminationCallType(expression);
