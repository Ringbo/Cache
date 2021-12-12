diff --git a/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java b/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java
index d635275..1ddb4ad 100644
--- a/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java
+++ b/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java
@@ -972,7 +972,7 @@
         Field<?> user = trim(lower(currentUser()));
         Record record = create().select(user).fetchOne();
 
-        assertTrue(Arrays.asList("test", "lukas", "sa", "root@localhost", "postgres", "dbo", "dba", "dba@lukas-hp")
+        assertTrue(Arrays.asList("test", "lukas", "sa", "root@localhost", "postgres", "dbo", "dba", "dba@lukas-hp", "dba@lukas-omni27")
             .contains(record.getValue(user)));
     }
 
