diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index b003a07..ac9724b 100755
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -612,7 +612,7 @@
 
         void write(boolean force) {
             if (force) {
-                write();
+                writeInternal();
                 return;
             }
             if (SystemClock.elapsedRealtime() - mLastWritten.get() < WRITE_INTERVAL
@@ -624,7 +624,7 @@
                     @Override
                     public void run() {
                         try {
-                            write(true);
+                            writeInternal();
                         } finally {
                             mBackgroundWriteRunning.set(false);
                         }
@@ -633,7 +633,7 @@
             }
         }
 
-        private void write() {
+        private void writeInternal() {
             synchronized (mPackages) {
                 synchronized (mFileLock) {
                     AtomicFile file = getFile();
@@ -4251,7 +4251,7 @@
             if (updateUsage) {
                 p.mLastPackageUsageTimeInMills = System.currentTimeMillis();
             }
-            mPackageUsage.write();
+            mPackageUsage.write(false);
             if (!p.mDexOptNeeded) {
                 return false;
             }
