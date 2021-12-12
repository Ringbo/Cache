diff --git a/job/src/main/java/com/kylinolap/job/hadoop/hbase/CreateHTableJob.java b/job/src/main/java/com/kylinolap/job/hadoop/hbase/CreateHTableJob.java
index b09d905..7e795bf 100644
--- a/job/src/main/java/com/kylinolap/job/hadoop/hbase/CreateHTableJob.java
+++ b/job/src/main/java/com/kylinolap/job/hadoop/hbase/CreateHTableJob.java
@@ -102,7 +102,7 @@
                 }
 
                 cf.setDataBlockEncoding(DataBlockEncoding.FAST_DIFF);
-                cf.setInMemory(true);
+                cf.setInMemory(false);
                 cf.setBlocksize(4 * 1024 * 1024); // set to 4MB
                 tableDesc.addFamily(cf);
             }
