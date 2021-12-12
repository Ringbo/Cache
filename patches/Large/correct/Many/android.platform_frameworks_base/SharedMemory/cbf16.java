diff --git a/core/java/android/os/SharedMemory.java b/core/java/android/os/SharedMemory.java
index 459aeb0..e6c7a17 100644
--- a/core/java/android/os/SharedMemory.java
+++ b/core/java/android/os/SharedMemory.java
@@ -60,7 +60,8 @@
         }
 
         mMemoryRegistration = new MemoryRegistration(mSize);
-        mCleaner = Cleaner.create(this, new Closer(mFileDescriptor, mMemoryRegistration));
+        mCleaner = Cleaner.create(mFileDescriptor,
+                new Closer(mFileDescriptor, mMemoryRegistration));
     }
 
     /**
@@ -138,6 +139,8 @@
      * This FileDescriptor is interoperable with the ASharedMemory NDK APIs.
      *
      * @return Returns the FileDescriptor associated with this object.
+     *
+     * @hide Exists only for MemoryFile interop
      */
     public @NonNull FileDescriptor getFileDescriptor() {
         return mFileDescriptor;
@@ -150,6 +153,8 @@
      * This fd is interoperable with the ASharedMemory NDK APIs.
      *
      * @return Returns the native fd associated with this object, or -1 if it is already closed.
+     *
+     * @hide Exposed for native ASharedMemory_dupFromJava()
      */
     public int getFd() {
         return mFileDescriptor.getInt$();
