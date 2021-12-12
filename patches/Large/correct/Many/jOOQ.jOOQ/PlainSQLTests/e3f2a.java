diff --git a/jOOQ-test/src/org/jooq/test/_/testcases/PlainSQLTests.java b/jOOQ-test/src/org/jooq/test/_/testcases/PlainSQLTests.java
index bbcaa54..238d870 100644
--- a/jOOQ-test/src/org/jooq/test/_/testcases/PlainSQLTests.java
+++ b/jOOQ-test/src/org/jooq/test/_/testcases/PlainSQLTests.java
@@ -293,7 +293,7 @@
 
     @Test
     public void testPlainSQLResultQuery() throws Exception {
-        String sql = create().select(param("p", String.class).as("p")).getSQL();
+        String sql = create().select(param("p", String.class).as("p")).getSQL(false);
         ResultQuery<Record> q = create().resultQuery(sql, "10");
 
         Result<Record> fetch1 = q.fetch();
