diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
index 73179f4..87b5a0f 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
@@ -133,7 +133,7 @@
         .setOverallCoveredConditions(i)
         .setScmDate(150000000L)
         .setHighlighting("2,9,k;9,18,k")
-        .addAllDuplications(Arrays.asList(19,33,141))
+        .addAllDuplication(Arrays.asList(19, 33, 141))
         .build();
     }
     return FileSourceDto.encodeData(dataBuilder.build());
