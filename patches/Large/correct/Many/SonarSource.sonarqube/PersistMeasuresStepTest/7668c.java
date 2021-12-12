diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java
index ef400b4..47527df 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java
@@ -172,7 +172,7 @@
         "rule_priority as \"severity\" from project_measures");
 
     Map<String, Object> dto = dtos.get(0);
-    assertThat(dto.get("snapshotId")).isNotNull();
+    assertThat(dto.get("snapshotId")).isEqualTo(3L);
     assertThat(dto.get("componentId")).isEqualTo(projectDto.getId());
     assertThat(dto.get("metricId")).isEqualTo(metric.getId().longValue());
     assertThat(dto.get("ruleId")).isEqualTo(rule.getId().longValue());
@@ -180,7 +180,7 @@
     assertThat(dto.get("severity")).isEqualTo(0L);
 
     dto = dtos.get(1);
-    assertThat(dto.get("snapshotId")).isNotNull();
+    assertThat(dto.get("snapshotId")).isEqualTo(4L);
     assertThat(dto.get("componentId")).isEqualTo(fileDto.getId());
     assertThat(dto.get("metricId")).isEqualTo(metric.getId().longValue());
     assertThat(dto.get("ruleId")).isEqualTo(rule.getId().longValue());
