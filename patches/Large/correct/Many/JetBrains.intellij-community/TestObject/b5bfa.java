diff --git a/plugins/junit/src/com/intellij/execution/junit/TestObject.java b/plugins/junit/src/com/intellij/execution/junit/TestObject.java
index 7109b6a..e8261e6 100644
--- a/plugins/junit/src/com/intellij/execution/junit/TestObject.java
+++ b/plugins/junit/src/com/intellij/execution/junit/TestObject.java
@@ -194,7 +194,8 @@
         myConfiguration.getName(),
         new DefaultCoverageFileProvider(coverageFileName),
         myConfiguration.getPatterns(), lastCoverageTime,
-        myConfiguration.getSuiteToMergeWith(), myConfiguration.getCoverageRunner(), myConfiguration.isTrackPerTestCoverage() && !myConfiguration.isSampling());
+        myConfiguration.getSuiteToMergeWith(), myConfiguration.getCoverageRunner(), myConfiguration.isTrackPerTestCoverage() && !myConfiguration.isSampling(),
+        !myConfiguration.isSampling());
       myConfiguration.appendCoverageArgument(myJavaParameters);
     }
   }
