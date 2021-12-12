diff --git a/sql/src/main/java/io/crate/operation/collect/sources/SystemCollectSource.java b/sql/src/main/java/io/crate/operation/collect/sources/SystemCollectSource.java
index de6a411..89fdd03 100644
--- a/sql/src/main/java/io/crate/operation/collect/sources/SystemCollectSource.java
+++ b/sql/src/main/java/io/crate/operation/collect/sources/SystemCollectSource.java
@@ -116,13 +116,13 @@
         iterableGetters.put(InformationSqlFeaturesTableInfo.IDENT.fqn(),
            () -> completedFuture(informationSchemaIterables.features()));
         iterableGetters.put(SysJobsTableInfo.IDENT.fqn(),
-           () -> completedFuture(jobsLogs.jobsGetter()));
+           () -> completedFuture(jobsLogs.activeJobs()));
         iterableGetters.put(SysJobsLogTableInfo.IDENT.fqn(),
-           () -> completedFuture(jobsLogs.jobsLogGetter()));
+           () -> completedFuture(jobsLogs.jobsLog()));
         iterableGetters.put(SysOperationsTableInfo.IDENT.fqn(),
-           () -> completedFuture(jobsLogs.operationsGetter()));
+           () -> completedFuture(jobsLogs.activeOperations()));
         iterableGetters.put(SysOperationsLogTableInfo.IDENT.fqn(),
-           () -> completedFuture(jobsLogs.operationsLogGetter()));
+           () -> completedFuture(jobsLogs.operationsLog()));
 
         SysChecker<SysCheck> sysChecker = new SysChecker<>(sysChecks);
         iterableGetters.put(SysChecksTableInfo.IDENT.fqn(), sysChecker::computeResultAndGet);
