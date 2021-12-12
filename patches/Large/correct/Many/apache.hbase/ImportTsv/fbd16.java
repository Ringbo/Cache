diff --git a/src/main/java/org/apache/hadoop/hbase/mapreduce/ImportTsv.java b/src/main/java/org/apache/hadoop/hbase/mapreduce/ImportTsv.java
index beb0233..f9d6934 100644
--- a/src/main/java/org/apache/hadoop/hbase/mapreduce/ImportTsv.java
+++ b/src/main/java/org/apache/hadoop/hbase/mapreduce/ImportTsv.java
@@ -271,11 +271,11 @@
         if (skipBadLines) {
           System.err.println(
               "Bad line at offset: " + offset.get() + ":\n" +
-              badLine.getMessage());
+              e.getMessage());
           badLineCount.increment(1);
           return;
         } else {
-          throw new IOException(badLine);
+          throw new IOException(e);
         }
       } catch (InterruptedException e) {
         e.printStackTrace();
