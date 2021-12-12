diff --git a/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByImplementationBenchmark.java b/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByImplementationBenchmark.java
index 7fa16d9..6a79e86 100644
--- a/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByImplementationBenchmark.java
+++ b/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByImplementationBenchmark.java
@@ -274,7 +274,7 @@
                 .make()
                 .load(newClassLoader(), ClassLoadingStrategy.Default.INJECTION)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
     }
 
@@ -333,7 +333,7 @@
             }
         });
         @SuppressWarnings("unchecked")
-        Object instance = proxyFactory.createClass().getConstructor().newInstance();
+        Object instance = proxyFactory.createClass().getDeclaredConstructor().newInstance();
         ((javassist.util.proxy.Proxy) instance).setHandler(new MethodHandler() {
             public Object invoke(Object self,
                                  Method thisMethod,
