diff --git a/src/main/java/tachyon/UnderFileSystemHdfs.java b/src/main/java/tachyon/UnderFileSystemHdfs.java
index 5067b32..c5eac84 100644
--- a/src/main/java/tachyon/UnderFileSystemHdfs.java
+++ b/src/main/java/tachyon/UnderFileSystemHdfs.java
@@ -195,7 +195,7 @@
         if (mFs.exists(new Path(path))) {
           return true;
         }
-        return mFs.mkdirs(new Path(path), null);
+        return mFs.mkdirs(new Path(path));
       } catch (IOException e) {
         cnt ++;
         LOG.error(cnt + " : " + e.getMessage(), e);
