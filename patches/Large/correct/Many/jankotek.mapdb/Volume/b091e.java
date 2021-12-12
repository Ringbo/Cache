diff --git a/src/main/java/org/mapdb/Volume.java b/src/main/java/org/mapdb/Volume.java
index 68f264c..40245fe 100644
--- a/src/main/java/org/mapdb/Volume.java
+++ b/src/main/java/org/mapdb/Volume.java
@@ -579,7 +579,7 @@
                 }
                 buffers = null;
             }finally{
-                growLock.lock();
+                growLock.unlock();
             }
         }
 
