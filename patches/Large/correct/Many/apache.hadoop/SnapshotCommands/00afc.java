diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/SnapshotCommands.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/SnapshotCommands.java
index ed687c1..570e442 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/SnapshotCommands.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/shell/SnapshotCommands.java
@@ -79,7 +79,7 @@
     protected void processArguments(LinkedList<PathData> items)
     throws IOException {
       super.processArguments(items);
-      if (exitCode != 0) { // check for error collecting paths
+      if (numErrors != 0) { // check for error collecting paths
         return;
       }
       assert(items.size() == 1);
@@ -119,7 +119,7 @@
     protected void processArguments(LinkedList<PathData> items)
         throws IOException {
       super.processArguments(items);
-      if (exitCode != 0) { // check for error collecting paths
+      if (numErrors != 0) { // check for error collecting paths
         return;
       }
       assert (items.size() == 1);
@@ -160,7 +160,7 @@
     protected void processArguments(LinkedList<PathData> items)
         throws IOException {
       super.processArguments(items);
-      if (exitCode != 0) { // check for error collecting paths
+      if (numErrors != 0) { // check for error collecting paths
         return;
       }
       Preconditions.checkArgument(items.size() == 1);
