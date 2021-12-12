diff --git a/src/main/java/org/mockito/internal/creation/bytebuddy/MockMethodAdvice.java b/src/main/java/org/mockito/internal/creation/bytebuddy/MockMethodAdvice.java
index 66fbb84..f4a6108 100644
--- a/src/main/java/org/mockito/internal/creation/bytebuddy/MockMethodAdvice.java
+++ b/src/main/java/org/mockito/internal/creation/bytebuddy/MockMethodAdvice.java
@@ -144,14 +144,14 @@
 
         private final Method origin;
 
-        private final WeakReference<Object> instanceRef;
+        private final MockWeakReference<Object> instanceRef;
 
         private final Object[] arguments;
 
         private RealMethodCall(SelfCallInfo selfCallInfo, Method origin, Object instance, Object[] arguments) {
             this.selfCallInfo = selfCallInfo;
             this.origin = origin;
-            this.instanceRef = new WeakReference<Object>(instance);
+            this.instanceRef = new MockWeakReference<Object>(instance);
             this.arguments = arguments;
         }
 
