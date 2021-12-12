diff --git a/src/java/voldemort/store/readonly/io/MemLock.java b/src/java/voldemort/store/readonly/io/MemLock.java
index 92fef21..5aa0571 100644
--- a/src/java/voldemort/store/readonly/io/MemLock.java
+++ b/src/java/voldemort/store/readonly/io/MemLock.java
@@ -34,7 +34,7 @@
     public MemLock(File file, FileDescriptor descriptor, long offset, long length)
                                                                                   throws IOException {
 
-        log.info("mlocking " + file + " with length " + length);
+        log.debug("mlocking " + file + " with length " + length);
 
         this.setFile(file);
         this.setDescriptor(descriptor);
@@ -61,7 +61,7 @@
         mman.munlock(pa, length);
         mman.munmap(pa, length);
 
-        log.info("munlocking " + file + " with length " + length);
+        log.debug("munlocking " + file + " with length " + length);
 
     }
 
