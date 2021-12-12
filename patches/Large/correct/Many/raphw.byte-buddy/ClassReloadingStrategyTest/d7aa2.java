diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java
index 51f3790..884ac10 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java
@@ -212,7 +212,7 @@
         Instrumentation instrumentation = ByteBuddyAgent.install();
         Class<?> factory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
         @SuppressWarnings("unchecked")
-        Callable<String> instance = (Callable<String>) factory.getDeclaredMethod("nonCapturing").invoke(factory.getConstructor().newInstance());
+        Callable<String> instance = (Callable<String>) factory.getDeclaredMethod("nonCapturing").invoke(factory.getDeclaredConstructor().newInstance());
         // Anonymous types can only be reset to their original format, if a retransformation is applied.
         ClassReloadingStrategy classReloadingStrategy = new ClassReloadingStrategy(instrumentation,
                 ClassReloadingStrategy.Strategy.RETRANSFORMATION).preregistered(instance.getClass());
