diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/INodeDirectory.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/INodeDirectory.java
index 94d35c3..ad4869c 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/INodeDirectory.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/INodeDirectory.java
@@ -73,14 +73,16 @@
     super(name, permissions, null, mtime, 0L);
   }
   
-  /** copy constructor
-   * 
-   * @param other
+  /**
+   * Copy constructor
+   * @param other The INodeDirectory to be copied
+   * @param adopt Indicate whether or not need to set the parent field of child
+   *              INodes to the new node
    */
-  public INodeDirectory(INodeDirectory other) {
+  public INodeDirectory(INodeDirectory other, boolean adopt) {
     super(other);
     this.children = other.children;
-    if (this.children != null) {
+    if (adopt && this.children != null) {
       for (INode child : children) {
         child.parent = this;
       }
