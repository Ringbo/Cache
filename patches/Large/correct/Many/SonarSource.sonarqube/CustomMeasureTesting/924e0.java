diff --git a/server/sonar-server/src/test/java/org/sonar/server/custommeasure/persistence/CustomMeasureTesting.java b/server/sonar-server/src/test/java/org/sonar/server/custommeasure/persistence/CustomMeasureTesting.java
index 3b21581..4c89ea9 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/custommeasure/persistence/CustomMeasureTesting.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/custommeasure/persistence/CustomMeasureTesting.java
@@ -32,9 +32,9 @@
 
   public static CustomMeasureDto newDto() {
     return new CustomMeasureDto()
-      .setDescription(RandomStringUtils.random(255))
-      .setTextValue(RandomStringUtils.random(255))
-      .setUserLogin(RandomStringUtils.random(255))
+      .setDescription(RandomStringUtils.randomAlphanumeric(255))
+      .setTextValue(RandomStringUtils.randomAlphanumeric(255))
+      .setUserLogin(RandomStringUtils.randomAlphanumeric(255))
       .setValue(RandomUtils.nextDouble())
       .setMetricId(RandomUtils.nextInt())
       .setResourceId(RandomUtils.nextInt())
