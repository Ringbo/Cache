diff --git a/sonar-scanner-engine/src/test/java/org/sonar/scanner/sensor/DefaultSensorContextTest.java b/sonar-scanner-engine/src/test/java/org/sonar/scanner/sensor/DefaultSensorContextTest.java
index 6d78060..ff7a8ff 100644
--- a/sonar-scanner-engine/src/test/java/org/sonar/scanner/sensor/DefaultSensorContextTest.java
+++ b/sonar-scanner-engine/src/test/java/org/sonar/scanner/sensor/DefaultSensorContextTest.java
@@ -72,7 +72,7 @@
     sensorStorage = mock(SensorStorage.class);
     analysisMode = mock(AnalysisMode.class);
     runtime = SonarRuntimeImpl.forSonarQube(Version.parse("5.5"), SonarQubeSide.SCANNER);
-    adaptor = new DefaultSensorContext(mock(InputModule.class), settings.asConfig(), settings, fs, activeRules, analysisMode, sensorStorage, runtime, branchConfig);
+    adaptor = new DefaultSensorContext(mock(InputModule.class), settings.asConfig(), settings, fs, activeRules, analysisMode, sensorStorage, runtime);
   }
 
   @Test
