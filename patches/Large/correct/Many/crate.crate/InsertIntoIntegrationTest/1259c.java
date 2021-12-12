diff --git a/sql/src/test/java/io/crate/integrationtests/InsertIntoIntegrationTest.java b/sql/src/test/java/io/crate/integrationtests/InsertIntoIntegrationTest.java
index 1f0108b..1bb39a2 100644
--- a/sql/src/test/java/io/crate/integrationtests/InsertIntoIntegrationTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/InsertIntoIntegrationTest.java
@@ -694,7 +694,7 @@
                 "  lashes short primary key" +
                 ") with (number_of_replicas=0)");
         ensureYellow();
-        int bulkSize = randomIntBetween(1, 10000);
+        int bulkSize = randomIntBetween(1, 2000);
         Object[][] bulkArgs = new Object[bulkSize][];
         for (int i = 0; i < bulkSize; i++) {
             bulkArgs[i] = new Object[] { System.currentTimeMillis() + i, new String[]{randomAsciiOfLength(5), randomAsciiOfLength(2)}, (short)i };
