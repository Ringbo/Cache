diff --git a/src/main/java/com/netflix/simianarmy/conformity/Cluster.java b/src/main/java/com/netflix/simianarmy/conformity/Cluster.java
index 2974a11..ba709e5 100644
--- a/src/main/java/com/netflix/simianarmy/conformity/Cluster.java
+++ b/src/main/java/com/netflix/simianarmy/conformity/Cluster.java
@@ -86,7 +86,7 @@
     public Cluster(String name, String region, Set<String> soloInstances) {
         Validate.notNull(name);
         Validate.notNull(region);
-        Validate.notNull(autoScalingGroups);
+        Validate.notNull(soloInstances);
         this.name = name;
         this.region = region;
         for (String soleInstance : soloInstances) {
