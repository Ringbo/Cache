diff --git a/src/java/org/apache/cassandra/db/DefsTables.java b/src/java/org/apache/cassandra/db/DefsTables.java
index e2abe97..fc43c27 100644
--- a/src/java/org/apache/cassandra/db/DefsTables.java
+++ b/src/java/org/apache/cassandra/db/DefsTables.java
@@ -543,7 +543,7 @@
         ksm.userTypes.removeType(ut);
 
         if (!StorageService.instance.isClientMode())
-            MigrationManager.instance.notifyUpdateUserType(ut);
+            MigrationManager.instance.notifyDropUserType(ut);
     }
 
     private static KSMetaData makeNewKeyspaceDefinition(KSMetaData ksm, CFMetaData toExclude)
