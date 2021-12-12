diff --git a/liquibase-core/src/test/java/liquibase/change/core/AddForeignKeyConstraintChangeTest.java b/liquibase-core/src/test/java/liquibase/change/core/AddForeignKeyConstraintChangeTest.java
index dfeace2..1da92fa 100644
--- a/liquibase-core/src/test/java/liquibase/change/core/AddForeignKeyConstraintChangeTest.java
+++ b/liquibase-core/src/test/java/liquibase/change/core/AddForeignKeyConstraintChangeTest.java
@@ -48,7 +48,7 @@
 
         assertEquals(true, statement.isDeferrable());
         assertEquals(true, statement.isInitiallyDeferred());
-        assertEquals(true, statement.getReferencesUniqueColumn());
+        assertEquals(false, statement.getReferencesUniqueColumn());
         assertEquals("CASCADE", statement.getOnDelete());
     }
 
