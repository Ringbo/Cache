diff --git a/core/src/test/java/org/apache/calcite/rel/rel2sql/RelToSqlConverterTest.java b/core/src/test/java/org/apache/calcite/rel/rel2sql/RelToSqlConverterTest.java
index c3c724e..e9a37bd 100644
--- a/core/src/test/java/org/apache/calcite/rel/rel2sql/RelToSqlConverterTest.java
+++ b/core/src/test/java/org/apache/calcite/rel/rel2sql/RelToSqlConverterTest.java
@@ -393,7 +393,7 @@
     final String expectedSql = "SELECT *\n"
         + "FROM \"scott\".\"EMP\"\n"
         + "WHERE \"DEPTNO\" IN (21)";
-    assertThat(sql, is(expectedSql));
+    assertThat(sql, isLinux(expectedSql));
   }
 
   @Test public void testUnparseIn2() {
@@ -404,7 +404,7 @@
     final String expectedSql = "SELECT *\n"
         + "FROM \"scott\".\"EMP\"\n"
         + "WHERE \"DEPTNO\" IN (20, 21)";
-    assertThat(sql, is(expectedSql));
+    assertThat(sql, isLinux(expectedSql));
   }
 
   @Test public void testUnparseInStruct1() {
@@ -418,7 +418,7 @@
     final String expectedSql = "SELECT *\n"
         + "FROM \"scott\".\"EMP\"\n"
         + "WHERE ROW(\"DEPTNO\", \"JOB\") IN (ROW(1, 'PRESIDENT'))";
-    assertThat(sql, is(expectedSql));
+    assertThat(sql, isLinux(expectedSql));
   }
 
   @Test public void testUnparseInStruct2() {
@@ -434,7 +434,7 @@
     final String expectedSql = "SELECT *\n"
         + "FROM \"scott\".\"EMP\"\n"
         + "WHERE ROW(\"DEPTNO\", \"JOB\") IN (ROW(1, 'PRESIDENT'), ROW(2, 'PRESIDENT'))";
-    assertThat(sql, is(expectedSql));
+    assertThat(sql, isLinux(expectedSql));
   }
 
   @Test public void testSelectQueryWithLimitClause() {
