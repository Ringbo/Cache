diff --git a/profiler-test/src/main/java/com/navercorp/pinpoint/test/PluginTestAgent.java b/profiler-test/src/main/java/com/navercorp/pinpoint/test/PluginTestAgent.java
index d1dc028..4a2cb7e 100644
--- a/profiler-test/src/main/java/com/navercorp/pinpoint/test/PluginTestAgent.java
+++ b/profiler-test/src/main/java/com/navercorp/pinpoint/test/PluginTestAgent.java
@@ -744,7 +744,7 @@
 
     private String getConstructorInfo(Constructor<?> constructor) {
         Class<?>[] parameterTypes = constructor.getParameterTypes();
-        String[] parameterTypeNames = JavaAssistUtils.getParameterType(parameterTypes);
+        String[] parameterTypeNames = JavaAssistUtils.toPinpointParameterType(parameterTypes);
 
         final String constructorSimpleName = MethodDescriptionUtils.getConstructorSimpleName(constructor);
         return MethodDescriptionUtils.toJavaMethodDescriptor(constructor.getDeclaringClass().getName(), constructorSimpleName , parameterTypeNames);
