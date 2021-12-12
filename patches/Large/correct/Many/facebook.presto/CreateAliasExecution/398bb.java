diff --git a/presto-main/src/main/java/com/facebook/presto/execution/CreateAliasExecution.java b/presto-main/src/main/java/com/facebook/presto/execution/CreateAliasExecution.java
index db40bdb..0c527b9 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/CreateAliasExecution.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/CreateAliasExecution.java
@@ -124,7 +124,7 @@
         QualifiedTableName remoteTableName = createQualifiedTableName(stateMachine.getSession(), statement.getRemote());
 
         Optional<TableHandle> remoteTableHandle = metadataManager.getTableHandle(remoteTableName);
-        checkState(!remoteTableHandle.isPresent(), "Table %s does not exist", remoteTableName);
+        checkState(remoteTableHandle.isPresent(), "Table %s does not exist", remoteTableName);
         Optional<String> remoteConnectorId = metadataManager.getConnectorId(remoteTableHandle.get());
         Preconditions.checkArgument(remoteConnectorId.isPresent(), "Table %s can not be aliased", remoteTableName);
 
