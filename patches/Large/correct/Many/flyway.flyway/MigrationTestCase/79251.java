diff --git a/flyway-core/src/test/java/org/flywaydb/core/migration/MigrationTestCase.java b/flyway-core/src/test/java/org/flywaydb/core/migration/MigrationTestCase.java
index 9e29a73..4545f03 100644
--- a/flyway-core/src/test/java/org/flywaydb/core/migration/MigrationTestCase.java
+++ b/flyway-core/src/test/java/org/flywaydb/core/migration/MigrationTestCase.java
@@ -146,7 +146,7 @@
         assertEquals(3, flyway.migrate());
         flyway.validate();
         assertEquals(5, flyway.info().applied().length);
-        assertEquals(814278929, flyway.info().applied()[1].getChecksum().intValue());
+        assertEquals(454910647, flyway.info().applied()[1].getChecksum().intValue());
     }
 
     @Test
