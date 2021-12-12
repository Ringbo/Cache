diff --git a/hadoop-tools/hadoop-ozone/src/main/java/org/apache/hadoop/fs/ozone/OzoneFileSystem.java b/hadoop-tools/hadoop-ozone/src/main/java/org/apache/hadoop/fs/ozone/OzoneFileSystem.java
index 485f2c0..34d6d3a 100644
--- a/hadoop-tools/hadoop-ozone/src/main/java/org/apache/hadoop/fs/ozone/OzoneFileSystem.java
+++ b/hadoop-tools/hadoop-ozone/src/main/java/org/apache/hadoop/fs/ozone/OzoneFileSystem.java
@@ -410,7 +410,7 @@
       DeleteIterator iterator = new DeleteIterator(f, recursive);
       return iterator.iterate();
     } catch (FileNotFoundException e) {
-      LOG.error("Couldn't delete {} - does not exist", f);
+      LOG.debug("Couldn't delete {} - does not exist", f);
       return false;
     }
   }
