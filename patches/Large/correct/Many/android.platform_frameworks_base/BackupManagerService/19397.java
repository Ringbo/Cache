diff --git a/services/backup/java/com/android/server/backup/BackupManagerService.java b/services/backup/java/com/android/server/backup/BackupManagerService.java
index d2d71bf..1ab8160 100644
--- a/services/backup/java/com/android/server/backup/BackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/BackupManagerService.java
@@ -3528,6 +3528,7 @@
 
     private void routeSocketDataToOutput(ParcelFileDescriptor inPipe, OutputStream out)
             throws IOException {
+        // We do not take close() responsibility for the pipe FD
         FileInputStream raw = new FileInputStream(inPipe.getFileDescriptor());
         DataInputStream in = new DataInputStream(raw);
 
@@ -4445,7 +4446,8 @@
                         (new Thread(backupRunner, "package-backup-bridge")).start();
 
                         // Read data off the engine pipe and pass it to the transport
-                        // pipe until we hit EOD on the input stream.
+                        // pipe until we hit EOD on the input stream.  We do not take
+                        // close() responsibility for these FDs into these stream wrappers.
                         FileInputStream in = new FileInputStream(
                                 enginePipes[0].getFileDescriptor());
                         FileOutputStream out = new FileOutputStream(
@@ -8579,7 +8581,10 @@
             EngineThread(FullRestoreEngine engine, ParcelFileDescriptor engineSocket) {
                 mEngine = engine;
                 engine.setRunning(true);
-                mEngineStream = new FileInputStream(engineSocket.getFileDescriptor());
+                // We *do* want this FileInputStream to own the underlying fd, so that
+                // when we are finished with it, it closes this end of the pipe in a way
+                // that signals its other end.
+                mEngineStream = new FileInputStream(engineSocket.getFileDescriptor(), true);
             }
 
             public boolean isRunning() {
@@ -8598,6 +8603,8 @@
                         mEngine.restoreOneFile(mEngineStream, false);
                     }
                 } finally {
+                    // Because mEngineStream adopted its underlying FD, this also
+                    // closes this end of the pipe.
                     IoUtils.closeQuietly(mEngineStream);
                 }
             }
