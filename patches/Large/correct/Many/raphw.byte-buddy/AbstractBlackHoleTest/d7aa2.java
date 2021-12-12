diff --git a/byte-buddy-benchmark/src/test/java/net/bytebuddy/benchmark/AbstractBlackHoleTest.java b/byte-buddy-benchmark/src/test/java/net/bytebuddy/benchmark/AbstractBlackHoleTest.java
index 0a88a32..6b30aa9 100644
--- a/byte-buddy-benchmark/src/test/java/net/bytebuddy/benchmark/AbstractBlackHoleTest.java
+++ b/byte-buddy-benchmark/src/test/java/net/bytebuddy/benchmark/AbstractBlackHoleTest.java
@@ -32,6 +32,6 @@
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         Method method = blackHoleGenerator.getDeclaredMethod(BLACK_HOLE_METHOD);
-        blackHole = (Blackhole) method.invoke(blackHoleGenerator.getConstructor().newInstance());
+        blackHole = (Blackhole) method.invoke(blackHoleGenerator.getDeclaredConstructor().newInstance());
     }
 }
