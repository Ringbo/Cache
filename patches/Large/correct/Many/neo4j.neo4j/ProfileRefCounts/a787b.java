diff --git a/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/pagecache/ProfileRefCounts.java b/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/pagecache/ProfileRefCounts.java
index 279f12d..787785a 100644
--- a/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/pagecache/ProfileRefCounts.java
+++ b/enterprise/kernel/src/main/java/org/neo4j/kernel/impl/pagecache/ProfileRefCounts.java
@@ -28,7 +28,7 @@
 {
     private final Map<Profile,MutableInt> bag;
 
-    public ProfileRefCounts()
+    ProfileRefCounts()
     {
         bag = new HashMap<>();
     }
