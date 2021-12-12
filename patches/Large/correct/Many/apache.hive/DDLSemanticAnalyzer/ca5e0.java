diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/DDLSemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/DDLSemanticAnalyzer.java
index 6660a91..c80403d 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/DDLSemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/DDLSemanticAnalyzer.java
@@ -1166,12 +1166,12 @@
           bucketCols = part.getBucketCols();
           inputFormatClass = part.getInputFormatClass();
           isArchived = ArchiveUtils.isArchived(part);
-          tblPartLoc = part.getDataLocation().toString();
+          tblPartLoc = part.getPartitionPath().toString();
         }
       } else {
         inputFormatClass = tblObj.getInputFormatClass();
         bucketCols = tblObj.getBucketCols();
-        tblPartLoc = tblObj.getDataLocation().toString();
+        tblPartLoc = tblObj.getPath().toString();
       }
 
       // throw a HiveException for non-rcfile.
