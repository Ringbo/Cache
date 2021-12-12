diff --git a/sonar-core/src/main/java/org/sonar/core/measure/db/MeasureDataDto.java b/sonar-core/src/main/java/org/sonar/core/measure/db/MeasureDataDto.java
index e47ec52..474aee6 100644
--- a/sonar-core/src/main/java/org/sonar/core/measure/db/MeasureDataDto.java
+++ b/sonar-core/src/main/java/org/sonar/core/measure/db/MeasureDataDto.java
@@ -28,7 +28,7 @@
 
   private Integer id;
 
-  private Integer measureId;
+  private Long measureId;
 
   private Integer snapshotId;
 
@@ -43,11 +43,11 @@
     return this;
   }
 
-  public Integer getMeasureId() {
+  public Long getMeasureId() {
     return measureId;
   }
 
-  public MeasureDataDto setMeasureId(Integer measureId) {
+  public MeasureDataDto setMeasureId(Long measureId) {
     this.measureId = measureId;
     return this;
   }
