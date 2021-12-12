diff --git a/servers/src/main/java/tachyon/worker/TachyonWorker.java b/servers/src/main/java/tachyon/worker/TachyonWorker.java
index 29a2ecf..064162a 100644
--- a/servers/src/main/java/tachyon/worker/TachyonWorker.java
+++ b/servers/src/main/java/tachyon/worker/TachyonWorker.java
@@ -97,8 +97,9 @@
       mAdditionalWorkers = Lists.newArrayList();
       List<? extends Worker> workers = Lists.newArrayList(mBlockWorker, mFileSystemWorker);
       // Discover and register the available factories
+      // NOTE, ClassLoader is explicitly specified so we don't need to set ContextClassLoader
       ServiceLoader<WorkerFactory> discoveredMasterFactories =
-          ServiceLoader.load(WorkerFactory.class);
+          ServiceLoader.load(WorkerFactory.class, WorkerFactory.class.getClassLoader());
       for (WorkerFactory factory : discoveredMasterFactories) {
         Worker worker = factory.create(workers);
         if (worker != null) {
