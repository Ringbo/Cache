diff --git a/itests/hive-unit/src/test/java/org/apache/hive/service/cli/session/TestHiveSessionImpl.java b/itests/hive-unit/src/test/java/org/apache/hive/service/cli/session/TestHiveSessionImpl.java
index c9e6a13..d58a913 100644
--- a/itests/hive-unit/src/test/java/org/apache/hive/service/cli/session/TestHiveSessionImpl.java
+++ b/itests/hive-unit/src/test/java/org/apache/hive/service/cli/session/TestHiveSessionImpl.java
@@ -70,7 +70,7 @@
     Map<String, String> confOverlay = new HashMap<String, String>();
     String hql = "drop table if exists table_not_exists";
     Mockito.when(operationManager.newExecuteStatementOperation(same(session), eq(hql),
-        (Map<String, String>)Mockito.any(), eq(true), eq(0))).thenReturn(operation);
+        (Map<String, String>)Mockito.any(), eq(true), eq(0L))).thenReturn(operation);
 
     try {
 
