diff --git a/sql/src/main/java/io/crate/planner/Planner.java b/sql/src/main/java/io/crate/planner/Planner.java
index 32e196f..0f2f85c 100644
--- a/sql/src/main/java/io/crate/planner/Planner.java
+++ b/sql/src/main/java/io/crate/planner/Planner.java
@@ -133,7 +133,7 @@
     }
 
     private Plan planDelete(DeleteAnalysis analysis) {
-        if (analysis.primaryKeyLiterals().size() > 1) {
+        if (analysis.primaryKeyLiterals() !=null && analysis.primaryKeyLiterals().size() > 1) {
             throw new UnsupportedOperationException("Multi column primary keys are currently not supported");
         }
         Plan plan = new Plan();
