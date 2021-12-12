diff --git a/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java b/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java
index a25fd6c..7affbff 100644
--- a/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java
+++ b/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java
@@ -367,7 +367,7 @@
     public void Count_All_Oracle() {
         expectedQuery = "select count(*) rc from EMPLOYEE e";
         NumberPath<Long> rowCount = Expressions.numberPath(Long.class, "rc");
-        assertEquals(0, query().from(employee).select(Wildcard.count.as(rowCount)).fetchOne().intValue());
+        assertEquals(10, query().from(employee).select(Wildcard.count.as(rowCount)).fetchOne().intValue());
     }
 
     @Test
