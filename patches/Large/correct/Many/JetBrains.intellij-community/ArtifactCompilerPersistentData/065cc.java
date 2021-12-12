diff --git a/jps/jps-builders/src/org/jetbrains/jps/incremental/artifacts/ArtifactCompilerPersistentData.java b/jps/jps-builders/src/org/jetbrains/jps/incremental/artifacts/ArtifactCompilerPersistentData.java
index 65120bb..1d9597f7 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/incremental/artifacts/ArtifactCompilerPersistentData.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/incremental/artifacts/ArtifactCompilerPersistentData.java
@@ -40,7 +40,7 @@
   public ArtifactCompilerPersistentData(File cacheStoreDirectory) throws IOException {
     myFile = new File(cacheStoreDirectory, "info");
     if (!myFile.exists()) {
-      LOG.info("Artifacts compiler info file doesn't exist: " + myFile.getAbsolutePath());
+      LOG.debug("Artifacts compiler info file doesn't exist: " + myFile.getAbsolutePath());
       myVersionChanged = true;
       return;
     }
@@ -49,7 +49,7 @@
     try {
       final int version = input.readInt();
       if (version != VERSION) {
-        LOG.info("Artifacts compiler version changed (" + myFile.getAbsolutePath() + "): " + version + " -> " + VERSION);
+        LOG.debug("Artifacts compiler version changed (" + myFile.getAbsolutePath() + "): " + version + " -> " + VERSION);
         myVersionChanged = true;
         return;
       }
