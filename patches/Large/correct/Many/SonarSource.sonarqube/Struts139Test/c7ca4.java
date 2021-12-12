diff --git a/tests/integration/tests/src/it/java/org/sonar/tests/integration/Struts139Test.java b/tests/integration/tests/src/it/java/org/sonar/tests/integration/Struts139Test.java
index 12e08db..aa6cc2e 100644
--- a/tests/integration/tests/src/it/java/org/sonar/tests/integration/Struts139Test.java
+++ b/tests/integration/tests/src/it/java/org/sonar/tests/integration/Struts139Test.java
@@ -76,7 +76,7 @@
     assertThat(getProjectMeasure(CoreMetrics.VIOLATIONS_KEY).getValue(), closeTo(7726.0, 500.0));
     assertThat(getProjectMeasure(CoreMetrics.BLOCKER_VIOLATIONS_KEY).getValue(), closeTo(0.0, 20.0));
     assertThat(getProjectMeasure(CoreMetrics.CRITICAL_VIOLATIONS_KEY).getValue(), closeTo(0.0, 20.0));
-    assertThat(getProjectMeasure(CoreMetrics.MAJOR_VIOLATIONS_KEY).getValue(), closeTo(2569.0, 200.0));
+    assertThat(getProjectMeasure(CoreMetrics.MAJOR_VIOLATIONS_KEY).getValue(), closeTo(2889.0, 200.0));
     assertThat(getProjectMeasure(CoreMetrics.MINOR_VIOLATIONS_KEY).getValue(), closeTo(0.0, 200.0));
     assertThat(getProjectMeasure(CoreMetrics.INFO_VIOLATIONS_KEY).getValue(), closeTo(5157.0, 20.0));
     assertThat(getProjectMeasure(CoreMetrics.VIOLATIONS_DENSITY_KEY).getValue(), closeTo(84.6, 5.0));
