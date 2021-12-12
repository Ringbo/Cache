diff --git a/plugins/testng/src/com/theoryinpractice/testng/configuration/TestNGRunnableState.java b/plugins/testng/src/com/theoryinpractice/testng/configuration/TestNGRunnableState.java
index 4459b01..55b48d2 100644
--- a/plugins/testng/src/com/theoryinpractice/testng/configuration/TestNGRunnableState.java
+++ b/plugins/testng/src/com/theoryinpractice/testng/configuration/TestNGRunnableState.java
@@ -179,7 +179,8 @@
       LOGGER.info("Adding coverage data from " + fileProvider.getCoverageDataFilePath());
       myCurrentCoverageSuite = coverageDataManager.addCoverageSuite(config.getGeneratedName() + " Coverage Results", fileProvider,
                                                                     config.getPatterns(), new Date().getTime(),
-                                                                    null, config.getCoverageRunner(), config.isTrackPerTestCoverage() && !config.isSampling());
+                                                                    null, config.getCoverageRunner(), config.isTrackPerTestCoverage() && !config.isSampling(),
+                                                                    !config.isSampling());
       LOGGER.info("Added coverage data with name '" + myCurrentCoverageSuite.getPresentableName() + "'");
       config.appendCoverageArgument(javaParameters);
     }
