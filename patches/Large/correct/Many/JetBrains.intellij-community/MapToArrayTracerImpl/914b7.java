diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/smart/MapToArrayTracerImpl.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/smart/MapToArrayTracerImpl.java
index d09829f..6158a91 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/smart/MapToArrayTracerImpl.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/smart/MapToArrayTracerImpl.java
@@ -24,7 +24,7 @@
 public class MapToArrayTracerImpl extends EvaluateExpressionTracerBase {
   private static final Logger LOG = Logger.getInstance(MapToArrayTracerImpl.class);
 
-  private static final String INFO_ARRAY_DECLARATION_FORMAT = "final info = new Object[%f];" + System.lineSeparator();
+  private static final String INFO_ARRAY_DECLARATION_FORMAT = "final info = new Object[%d];" + System.lineSeparator();
   private static final String RETURN_EXPRESSION = "new java.lang.Object[]{ info, streamResult };" + System.lineSeparator();
 
   public MapToArrayTracerImpl(@NotNull XDebugSession session) {
@@ -66,7 +66,7 @@
 
       declarationBuilder.append(handler.additionalVariablesDeclaration());
       resultPreparationBuilder.append(handler.prepareResult());
-      resultBuilder.append(String.format("additional[%d] = %s;", i, handler.getResultExpression()));
+      resultBuilder.append(String.format("info[%d] = %s;", i, handler.getResultExpression())).append(System.lineSeparator());
 
       final List<MethodCall> callsBefore = handler.additionalCallsBefore();
       final List<MethodCall> callsAfter = handler.additionalCallsAfter();
@@ -78,7 +78,7 @@
 
     resultBuilder.append(RETURN_EXPRESSION);
     final StreamChain newChain = new StreamChain(tracingChainCalls);
-    final String tracingCall = "final Object streamResult = " + newChain.toString() + ";" + System.lineSeparator();
+    final String tracingCall = "final Object streamResult = " + newChain.getText() + ";" + System.lineSeparator();
 
     final String result = declarationBuilder.toString() + tracingCall + resultPreparationBuilder.toString() + resultBuilder.toString();
     LOG.info("stream expression to trace:" + System.lineSeparator() + result);
