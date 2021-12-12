diff --git a/angel-ps/psf/src/main/java/com/tencent/angel/ml/matrix/psf/update/Abs.java b/angel-ps/psf/src/main/java/com/tencent/angel/ml/matrix/psf/update/Abs.java
index 0a0bed3..21ffc5c 100644
--- a/angel-ps/psf/src/main/java/com/tencent/angel/ml/matrix/psf/update/Abs.java
+++ b/angel-ps/psf/src/main/java/com/tencent/angel/ml/matrix/psf/update/Abs.java
@@ -46,7 +46,7 @@
         to.put(i, Math.abs(from.get(i)));
       }
     } finally {
-      rows[1].getLock().writeLock().lock();
+      rows[1].getLock().writeLock().unlock();
     }
   }
 
