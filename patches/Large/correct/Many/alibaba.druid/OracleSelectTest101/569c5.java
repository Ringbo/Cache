diff --git a/src/test/java/com/alibaba/druid/bvt/sql/oracle/select/OracleSelectTest101.java b/src/test/java/com/alibaba/druid/bvt/sql/oracle/select/OracleSelectTest101.java
index 538b79e..c6f0345 100644
--- a/src/test/java/com/alibaba/druid/bvt/sql/oracle/select/OracleSelectTest101.java
+++ b/src/test/java/com/alibaba/druid/bvt/sql/oracle/select/OracleSelectTest101.java
@@ -145,7 +145,7 @@
 
         assertEquals(5, visitor.getTables().size());
         assertEquals(24, visitor.getColumns().size());
-        assertEquals(11, visitor.getConditions().size());
+        assertEquals(12, visitor.getConditions().size());
         assertEquals(4, visitor.getRelationships().size());
         assertEquals(1, visitor.getOrderByColumns().size());
     }
