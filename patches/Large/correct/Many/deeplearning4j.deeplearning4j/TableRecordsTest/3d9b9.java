diff --git a/datavec-local/src/test/java/org/datavec/local/transforms/TableRecordsTest.java b/datavec-local/src/test/java/org/datavec/local/transforms/TableRecordsTest.java
index 44c4eeb..c5636e1 100644
--- a/datavec-local/src/test/java/org/datavec/local/transforms/TableRecordsTest.java
+++ b/datavec-local/src/test/java/org/datavec/local/transforms/TableRecordsTest.java
@@ -30,7 +30,7 @@
         assertEquals(2, table.rows().length);
         for (int i = 0; i < table.rows().length; i++) {
             for (int j = 0; j < table.columns().size(); j++) {
-                assertEquals(linspace.getDouble(i, j), Double.valueOf(table.get(j, i)), 1e-1);
+                assertEquals(linspace.getDouble(i, j), Double.valueOf(table.get(i, j)), 1e-1);
             }
         }
 
