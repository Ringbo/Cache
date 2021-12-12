diff --git a/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JavassistClass.java b/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JavassistClass.java
index 3735bc7..b7c8255 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JavassistClass.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JavassistClass.java
@@ -525,7 +525,7 @@
 
     @Override
     public int addGroupedInterceptor(MethodFilter filter, String interceptorClassName, InterceptorGroup group, ExecutionPolicy executionPolicy) throws InstrumentException {
-        return addGroupedInterceptor(filter, interceptorClassName, group, executionPolicy);
+        return addGroupedInterceptor(filter, interceptorClassName, null, group, executionPolicy);
     }
 
     @Override
