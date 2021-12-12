diff --git a/src/test/java/com/alibaba/druid/bvt/sql/postgresql/select/PGSelectTest1.java b/src/test/java/com/alibaba/druid/bvt/sql/postgresql/select/PGSelectTest1.java
index 5a491de..f328f44 100644
--- a/src/test/java/com/alibaba/druid/bvt/sql/postgresql/select/PGSelectTest1.java
+++ b/src/test/java/com/alibaba/druid/bvt/sql/postgresql/select/PGSelectTest1.java
@@ -47,7 +47,7 @@
 //        System.out.println("coditions : " + visitor.getConditions());
 
         assertEquals(2, visitor.getColumns().size());
-        assertEquals(4, visitor.getTables().size());
+        assertEquals(2, visitor.getTables().size());
     }
     
     public void test_1() throws Exception {
