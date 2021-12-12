diff --git a/sonar-db/src/test/java/org/sonar/db/measure/MeasureDaoTest.java b/sonar-db/src/test/java/org/sonar/db/measure/MeasureDaoTest.java
index 83e5f34..75111ce 100644
--- a/sonar-db/src/test/java/org/sonar/db/measure/MeasureDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/measure/MeasureDaoTest.java
@@ -177,28 +177,28 @@
   public void select_past_measures_by_component_uuid_and_root_snapshot_id_and_metric_keys() {
     db.prepareDbUnit(getClass(), "past_measures.xml");
 
-    List<PastMeasureDto> fileMeasures = underTest.selectByComponentUuidAndProjectSnapshotIdAndMetricIds(dbSession, "CDEF", 1000L, ImmutableSet.of(1, 2));
+    Map<Long, PastMeasureDto> fileMeasures = pastMeasuresById(underTest.selectByComponentUuidAndProjectSnapshotIdAndMetricIds(dbSession, "CDEF", 1000L, ImmutableSet.of(1, 2)));
     assertThat(fileMeasures).hasSize(2);
 
-    PastMeasureDto fileMeasure1 = fileMeasures.get(0);
+    PastMeasureDto fileMeasure1 = fileMeasures.get(5L);
     assertThat(fileMeasure1.getValue()).isEqualTo(5d);
     assertThat(fileMeasure1.getMetricId()).isEqualTo(1);
     assertThat(fileMeasure1.getRuleId()).isNull();
     assertThat(fileMeasure1.getCharacteristicId()).isNull();
     assertThat(fileMeasure1.getPersonId()).isNull();
 
-    PastMeasureDto fileMeasure2 = fileMeasures.get(1);
+    PastMeasureDto fileMeasure2 = fileMeasures.get(6L);
     assertThat(fileMeasure2.getValue()).isEqualTo(60d);
     assertThat(fileMeasure2.getMetricId()).isEqualTo(2);
 
-    List<PastMeasureDto> projectMeasures = underTest.selectByComponentUuidAndProjectSnapshotIdAndMetricIds(dbSession, "ABCD", 1000L, ImmutableSet.of(1, 2));
+    Map<Long, PastMeasureDto> projectMeasures = pastMeasuresById(underTest.selectByComponentUuidAndProjectSnapshotIdAndMetricIds(dbSession, "ABCD", 1000L, ImmutableSet.of(1, 2)));
     assertThat(projectMeasures).hasSize(2);
 
-    PastMeasureDto projectMeasure1 = projectMeasures.get(0);
+    PastMeasureDto projectMeasure1 = projectMeasures.get(1L);
     assertThat(projectMeasure1.getValue()).isEqualTo(60d);
     assertThat(projectMeasure1.getMetricId()).isEqualTo(1);
 
-    PastMeasureDto projectMeasure2 = projectMeasures.get(1);
+    PastMeasureDto projectMeasure2 = projectMeasures.get(2L);
     assertThat(projectMeasure2.getValue()).isEqualTo(80d);
     assertThat(projectMeasure2.getMetricId()).isEqualTo(2);
 
