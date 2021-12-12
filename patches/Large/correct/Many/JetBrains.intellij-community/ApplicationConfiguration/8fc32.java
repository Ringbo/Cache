diff --git a/execution/impl/com/intellij/execution/application/ApplicationConfiguration.java b/execution/impl/com/intellij/execution/application/ApplicationConfiguration.java
index 4fb225f..e7b6a0b 100644
--- a/execution/impl/com/intellij/execution/application/ApplicationConfiguration.java
+++ b/execution/impl/com/intellij/execution/application/ApplicationConfiguration.java
@@ -234,7 +234,7 @@
           new DefaultCoverageFileProvider(coverageFileName),
           getPatterns(),
           lastCoverageTime,
-          getSuiteToMergeWith(), getCoverageRunner(), isTrackPerTestCoverage() && !isSampling());
+          getSuiteToMergeWith(), getCoverageRunner(), isTrackPerTestCoverage() && !isSampling(), !isSampling());
         appendCoverageArgument(params);
       }
 
