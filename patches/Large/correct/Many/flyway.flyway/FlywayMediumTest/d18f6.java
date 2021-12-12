diff --git a/flyway-core/src/test/java/org/flywaydb/core/FlywayMediumTest.java b/flyway-core/src/test/java/org/flywaydb/core/FlywayMediumTest.java
index d2d6797..de0960f 100644
--- a/flyway-core/src/test/java/org/flywaydb/core/FlywayMediumTest.java
+++ b/flyway-core/src/test/java/org/flywaydb/core/FlywayMediumTest.java
@@ -379,7 +379,7 @@
         flyway.setValidateOnMigrate(true);
         flyway.setTarget(MigrationVersion.LATEST);
         flyway.setOutOfOrder(true);
-        assertEquals(MigrationState.PENDING, flyway.info().all()[2].getState());
+        assertEquals(MigrationState.PENDING, flyway.info().all()[3].getState());
         assertEquals(2, flyway.migrate());
 
         MigrationInfo[] all = flyway.info().all();
