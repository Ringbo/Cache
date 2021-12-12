diff --git a/src/java/org/apache/cassandra/db/DefsTables.java b/src/java/org/apache/cassandra/db/DefsTables.java
index 98ced8d..96327c4 100644
--- a/src/java/org/apache/cassandra/db/DefsTables.java
+++ b/src/java/org/apache/cassandra/db/DefsTables.java
@@ -537,7 +537,7 @@
         ksm.userTypes.removeType(ut);
 
         if (!StorageService.instance.isClientMode())
-            MigrationManager.instance.notifyUpdateUserType(ut);
+            MigrationManager.instance.notifyDropUserType(ut);
     }
 
     private static KSMetaData makeNewKeyspaceDefinition(KSMetaData ksm, CFMetaData toExclude)
