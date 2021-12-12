diff --git a/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorChain.java b/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorChain.java
index c899278..4f5b15b 100644
--- a/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorChain.java
+++ b/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorChain.java
@@ -65,7 +65,7 @@
 
         SnapshotGenerator next = snapshotGenerators.next();
         for (Class<? extends SnapshotGenerator> removedGenerator : replacedGenerators) {
-            if (removedGenerator.isAssignableFrom(next.getClass())) {
+            if (removedGenerator.equals(next.getClass())) {
                 return getNextValidGenerator();
             }
         }
