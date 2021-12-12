diff --git a/servers/src/main/java/tachyon/master/filesystem/meta/InodeFile.java b/servers/src/main/java/tachyon/master/filesystem/meta/InodeFile.java
index 892ab5a..e832e95 100644
--- a/servers/src/main/java/tachyon/master/filesystem/meta/InodeFile.java
+++ b/servers/src/main/java/tachyon/master/filesystem/meta/InodeFile.java
@@ -234,7 +234,7 @@
       getNewBlockId();
       length -= blockSize;
     }
-    setComplete(length);
+    setComplete(mLength);
   }
 
   @Override
