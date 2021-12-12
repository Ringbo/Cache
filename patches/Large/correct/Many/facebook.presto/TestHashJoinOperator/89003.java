diff --git a/presto-main/src/test/java/com/facebook/presto/operator/TestHashJoinOperator.java b/presto-main/src/test/java/com/facebook/presto/operator/TestHashJoinOperator.java
index 9d007bd..75305b8 100644
--- a/presto-main/src/test/java/com/facebook/presto/operator/TestHashJoinOperator.java
+++ b/presto-main/src/test/java/com/facebook/presto/operator/TestHashJoinOperator.java
@@ -118,7 +118,7 @@
         );
 
         // expected
-        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probePages.getTypes(), buildPages.getTypes()))
+        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probePages.getTypesWithoutHash(), buildPages.getTypesWithoutHash()))
                 .row("20", 1020L, 2020L, "20", 30L, 40L)
                 .row("21", 1021L, 2021L, "21", 31L, 41L)
                 .row("22", 1022L, 2022L, "22", 32L, 42L)
@@ -169,7 +169,7 @@
         );
 
         // expected
-        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probeTypes, buildPages.getTypes()))
+        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probeTypes, buildPages.getTypesWithoutHash()))
                 .row("a", "a")
                 .row("a", "a")
                 .row("b", "b")
@@ -588,7 +588,7 @@
                 Optional.empty());
 
         // expected
-        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probeTypes, buildPages.getTypes()))
+        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probeTypes, buildPages.getTypesWithoutHash()))
                 .row("a", "a")
                 .row("a", "a")
                 .row("b", "b")
@@ -637,7 +637,7 @@
                 Optional.empty());
 
         // expected
-        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probeTypes, buildPages.getTypes()))
+        MaterializedResult expected = MaterializedResult.resultBuilder(taskContext.getSession(), concat(probeTypes, buildPages.getTypesWithoutHash()))
                 .row("a", "a")
                 .row("a", "a")
                 .row("b", null)
