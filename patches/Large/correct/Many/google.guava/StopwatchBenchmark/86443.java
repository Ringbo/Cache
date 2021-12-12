diff --git a/guava-tests/benchmark/com/google/common/base/StopwatchBenchmark.java b/guava-tests/benchmark/com/google/common/base/StopwatchBenchmark.java
index 0caba86..f651052 100644
--- a/guava-tests/benchmark/com/google/common/base/StopwatchBenchmark.java
+++ b/guava-tests/benchmark/com/google/common/base/StopwatchBenchmark.java
@@ -35,7 +35,7 @@
     for (int i = 0; i < reps; i++) {
       Stopwatch s = new Stopwatch().start();
       // here is where you would do something
-      total += s.elapsedTime(TimeUnit.NANOSECONDS);
+      total += s.elapsed(TimeUnit.NANOSECONDS);
     }
     return total;
   }
