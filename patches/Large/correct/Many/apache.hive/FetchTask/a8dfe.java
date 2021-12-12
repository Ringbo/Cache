diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/FetchTask.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/FetchTask.java
index c4f04cb..c735be1 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/FetchTask.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/FetchTask.java
@@ -129,7 +129,7 @@
       rowsRet = work.getLimit() >= 0 ? Math.min(work.getLimit() - totalRows, maxRows) : maxRows;
     }
     try {
-      if (rowsRet <= 0) {
+      if (rowsRet <= 0 || work.getLimit() == totalRows) {
         fetch.clearFetchContext();
         return false;
       }
