diff --git a/src/java/main/org/apache/zookeeper/ZooKeeper.java b/src/java/main/org/apache/zookeeper/ZooKeeper.java
index 291219b..f272119 100644
--- a/src/java/main/org/apache/zookeeper/ZooKeeper.java
+++ b/src/java/main/org/apache/zookeeper/ZooKeeper.java
@@ -1103,7 +1103,7 @@
         acl = new ArrayList<ACL>();
         for (String a : acls) {
             int firstColon = a.indexOf(':');
-            int lastColon = a.indexOf(':');
+            int lastColon = a.lastIndexOf(':');
             if (firstColon == -1 || lastColon == -1 || firstColon == lastColon) {
                 System.err
                         .println(a + " does not have the form scheme:id:perm");
