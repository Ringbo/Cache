diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index a7f4b28..d1333b2 100755
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -621,7 +621,7 @@
 
         void write(boolean force) {
             if (force) {
-                write();
+                writeInternal();
                 return;
             }
             if (SystemClock.elapsedRealtime() - mLastWritten.get() < WRITE_INTERVAL
@@ -633,7 +633,7 @@
                     @Override
                     public void run() {
                         try {
-                            write(true);
+                            writeInternal();
                         } finally {
                             mBackgroundWriteRunning.set(false);
                         }
@@ -642,7 +642,7 @@
             }
         }
 
-        private void write() {
+        private void writeInternal() {
             synchronized (mPackages) {
                 synchronized (mFileLock) {
                     AtomicFile file = getFile();
@@ -4554,7 +4554,7 @@
             if (updateUsage) {
                 p.mLastPackageUsageTimeInMills = System.currentTimeMillis();
             }
-            mPackageUsage.write();
+            mPackageUsage.write(false);
             if (!p.mDexOptNeeded) {
                 return false;
             }
