diff --git a/server/sonar-server/src/test/java/org/sonar/server/measure/custom/persistence/CustomMeasureTesting.java b/server/sonar-server/src/test/java/org/sonar/server/measure/custom/persistence/CustomMeasureTesting.java
index 72cd665..4c96857 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/measure/custom/persistence/CustomMeasureTesting.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/measure/custom/persistence/CustomMeasureTesting.java
@@ -38,7 +38,7 @@
       .setValue(RandomUtils.nextDouble())
       .setMetricId(RandomUtils.nextInt())
       .setComponentId(RandomUtils.nextInt())
-      .setComponentUuid(RandomStringUtils.random(50))
+      .setComponentUuid(RandomStringUtils.randomAlphanumeric(50))
       .setCreatedAt(System2.INSTANCE.now())
       .setUpdatedAt(System2.INSTANCE.now());
   }
