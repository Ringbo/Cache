diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index b414243..6f9e6be 100755
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -611,7 +611,7 @@
 
         void write(boolean force) {
             if (force) {
-                write();
+                writeInternal();
                 return;
             }
             if (SystemClock.elapsedRealtime() - mLastWritten.get() < WRITE_INTERVAL
@@ -623,7 +623,7 @@
                     @Override
                     public void run() {
                         try {
-                            write(true);
+                            writeInternal();
                         } finally {
                             mBackgroundWriteRunning.set(false);
                         }
@@ -632,7 +632,7 @@
             }
         }
 
-        private void write() {
+        private void writeInternal() {
             synchronized (mPackages) {
                 synchronized (mFileLock) {
                     AtomicFile file = getFile();
@@ -4219,7 +4219,7 @@
             if (updateUsage) {
                 p.mLastPackageUsageTimeInMills = System.currentTimeMillis();
             }
-            mPackageUsage.write();
+            mPackageUsage.write(false);
             if (!p.mDexOptNeeded) {
                 return false;
             }
