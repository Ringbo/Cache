diff --git a/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/interceptor/InvokeAfterCodeGenerator.java b/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/interceptor/InvokeAfterCodeGenerator.java
index ca8b941..46e20a0 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/interceptor/InvokeAfterCodeGenerator.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/interceptor/InvokeAfterCodeGenerator.java
@@ -147,7 +147,7 @@
     private void parameterBind(CodeBuilder builder, Class<?>[] interceptorParamTypes) {
         int i = 0;
         int argNum = targetMethod.getParameterTypes().length;
-        int interceptorArgNum = interceptorParamTypes.length - 1;
+        int interceptorArgNum = interceptorParamTypes.length - 3;
         int matchNum = Math.min(argNum, interceptorArgNum);
 
         for (; i < matchNum; i++) {
