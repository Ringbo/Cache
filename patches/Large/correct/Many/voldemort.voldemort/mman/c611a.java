diff --git a/src/java/voldemort/store/readonly/io/jna/mman.java b/src/java/voldemort/store/readonly/io/jna/mman.java
index 3042285..2e82d1f 100644
--- a/src/java/voldemort/store/readonly/io/jna/mman.java
+++ b/src/java/voldemort/store/readonly/io/jna/mman.java
@@ -75,7 +75,7 @@
             logger.debug(error);
             logger.debug(res);
         } else {
-            logger.info("Mlock successfull");
+            logger.debug("Mlock successfull");
 
         }
 
@@ -89,7 +89,7 @@
         if(Delegate.munlock(addr, new NativeLong(len)) != 0) {
             logger.warn(errno.strerror());
         } else {
-            logger.info("munlocking region");
+            logger.debug("munlocking region");
         }
 
     }
@@ -123,12 +123,12 @@
         FileInputStream in = new FileInputStream(file);
         int fd = voldemort.store.readonly.io.Native.getFd(in.getFD());
 
-        logger.info("File descriptor is: " + fd);
+        logger.debug("File descriptor is: " + fd);
 
         // mmap a large file...
         Pointer addr = mmap(file.length(), PROT_READ, mman.MAP_SHARED | mman.MAP_ALIGN, fd, 0L);
 
-        logger.info("mmap address is: " + Pointer.nativeValue(addr));
+        logger.debug("mmap address is: " + Pointer.nativeValue(addr));
 
         // try to mlock it directly
         mlock(addr, file.length());
