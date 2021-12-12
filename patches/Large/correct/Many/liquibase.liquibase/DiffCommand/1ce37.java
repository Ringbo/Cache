diff --git a/liquibase-core/src/main/java/liquibase/command/core/DiffCommand.java b/liquibase-core/src/main/java/liquibase/command/core/DiffCommand.java
index 3d3d9aa..b8f462e 100644
--- a/liquibase-core/src/main/java/liquibase/command/core/DiffCommand.java
+++ b/liquibase-core/src/main/java/liquibase/command/core/DiffCommand.java
@@ -178,12 +178,12 @@
         if (getSnapshotListener() != null) {
             snapshotControl.setSnapshotListener(getSnapshotListener());
         }
-        ObjectQuotingStrategy originalStrategy = referenceDatabase.getObjectQuotingStrategy();
+        ObjectQuotingStrategy originalStrategy = targetDatabase.getObjectQuotingStrategy();
         try {
-            referenceDatabase.setObjectQuotingStrategy(ObjectQuotingStrategy.QUOTE_ALL_OBJECTS);
+            targetDatabase.setObjectQuotingStrategy(ObjectQuotingStrategy.QUOTE_ALL_OBJECTS);
             return SnapshotGeneratorFactory.getInstance().createSnapshot(schemas, targetDatabase, snapshotControl);
         } finally {
-            referenceDatabase.setObjectQuotingStrategy(originalStrategy);
+            targetDatabase.setObjectQuotingStrategy(originalStrategy);
         }
     }
 
