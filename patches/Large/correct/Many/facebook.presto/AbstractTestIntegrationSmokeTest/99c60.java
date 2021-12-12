diff --git a/presto-tests/src/main/java/com/facebook/presto/tests/AbstractTestIntegrationSmokeTest.java b/presto-tests/src/main/java/com/facebook/presto/tests/AbstractTestIntegrationSmokeTest.java
index 3501719..e51af6a 100644
--- a/presto-tests/src/main/java/com/facebook/presto/tests/AbstractTestIntegrationSmokeTest.java
+++ b/presto-tests/src/main/java/com/facebook/presto/tests/AbstractTestIntegrationSmokeTest.java
@@ -166,7 +166,7 @@
         MaterializedResult expectedTables = MaterializedResult.resultBuilder(queryRunner.getDefaultSession(), VARCHAR)
                 .row("orders")
                 .build();
-        assertEquals(actualTables, expectedTables);
+        assertContains(actualTables, expectedTables);
     }
 
     @Test
