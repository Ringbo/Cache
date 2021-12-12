diff --git a/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByExtensionBenchmark.java b/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByExtensionBenchmark.java
index d2a1c8a..112f4ea 100644
--- a/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByExtensionBenchmark.java
+++ b/byte-buddy-benchmark/src/main/java/net/bytebuddy/benchmark/ClassByExtensionBenchmark.java
@@ -93,7 +93,7 @@
                 .make()
                 .load(newClassLoader(), ClassLoadingStrategy.Default.INJECTION)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
     }
 
@@ -114,7 +114,7 @@
                 .make()
                 .load(newClassLoader(), ClassLoadingStrategy.Default.INJECTION)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance();
     }
 
@@ -175,7 +175,7 @@
             }
         });
         @SuppressWarnings("unchecked")
-        Object instance = proxyFactory.createClass().getConstructor().newInstance();
+        Object instance = proxyFactory.createClass().getDeclaredConstructor().newInstance();
         ((javassist.util.proxy.Proxy) instance).setHandler(new MethodHandler() {
             public Object invoke(Object self,
                                  Method thisMethod,
