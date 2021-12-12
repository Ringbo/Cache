diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/viewfs/ViewFileSystem.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/viewfs/ViewFileSystem.java
index c1e290c..0778e7f 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/viewfs/ViewFileSystem.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/viewfs/ViewFileSystem.java
@@ -514,7 +514,7 @@
     for (int i = 0; i < mountPoints.size(); ++i) {
       String serviceName =
           mountPoints.get(i).target.targetFileSystem.getCanonicalServiceName();
-      if (seenServiceNames.contains(serviceName)) {
+      if (serviceName == null || seenServiceNames.contains(serviceName)) {
         continue;
       }
       seenServiceNames.add(serviceName);
