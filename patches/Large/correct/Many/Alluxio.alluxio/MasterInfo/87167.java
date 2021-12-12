diff --git a/src/main/java/tachyon/MasterInfo.java b/src/main/java/tachyon/MasterInfo.java
index 59e1fbd..6d8153e 100644
--- a/src/main/java/tachyon/MasterInfo.java
+++ b/src/main/java/tachyon/MasterInfo.java
@@ -153,7 +153,7 @@
                       dep.addLostFile(tFile.getId());
                       LOG.info("File " + tFile.getId() + " got lost from worker " + worker.getId() +
                           " . Trying to recompute it using dependency " + dep.ID);
-                      if (getPath(tFile).startsWith(MASTER_CONF.TEMPORARY_FOLDER)) {
+                      if (!getPath(tFile).startsWith(MASTER_CONF.TEMPORARY_FOLDER)) {
                         mMustRecomputeDependencies.add(depId);
                       }
                     }
