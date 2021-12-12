diff --git a/liquibase-integration-tests/src/test/java/liquibase/dbtest/mssql/MssqlIntegrationTest.java b/liquibase-integration-tests/src/test/java/liquibase/dbtest/mssql/MssqlIntegrationTest.java
index 267b755..4fcf32c 100644
--- a/liquibase-integration-tests/src/test/java/liquibase/dbtest/mssql/MssqlIntegrationTest.java
+++ b/liquibase-integration-tests/src/test/java/liquibase/dbtest/mssql/MssqlIntegrationTest.java
@@ -54,7 +54,7 @@
                             Calendar calendar = Calendar.getInstance();
                             calendar.setTime(((Date) defaultValue));
                             assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
-                            assertEquals(1, calendar.get(Calendar.MONTH));
+                            assertEquals(0, calendar.get(Calendar.MONTH));
                             assertEquals(2000, calendar.get(Calendar.YEAR));
                         }
                     } else if (column.getName().toLowerCase().contains("char_")) {
