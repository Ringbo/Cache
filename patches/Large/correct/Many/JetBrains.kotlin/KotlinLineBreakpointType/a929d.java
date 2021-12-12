diff --git a/idea/src/org/jetbrains/kotlin/idea/debugger/breakpoints/KotlinLineBreakpointType.java b/idea/src/org/jetbrains/kotlin/idea/debugger/breakpoints/KotlinLineBreakpointType.java
index c612cfc..5d47ec5 100644
--- a/idea/src/org/jetbrains/kotlin/idea/debugger/breakpoints/KotlinLineBreakpointType.java
+++ b/idea/src/org/jetbrains/kotlin/idea/debugger/breakpoints/KotlinLineBreakpointType.java
@@ -88,7 +88,7 @@
     private static KtFunction getLambdaByOrdinal(SourcePosition position, Integer ordinal) {
         if (ordinal != null && ordinal >= 0) {
             List<KtFunction> lambdas = BreakpointTypeUtilsKt.getLambdasAtLineIfAny(position);
-            if (lambdas.size() >= ordinal) {
+            if (lambdas.size() > ordinal) {
                 return lambdas.get(ordinal);
             }
         }
