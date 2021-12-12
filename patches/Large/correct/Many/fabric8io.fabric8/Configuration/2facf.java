diff --git a/components/arquillian-fabric8/src/main/java/io/fabric8/arquillian/kubernetes/Configuration.java b/components/arquillian-fabric8/src/main/java/io/fabric8/arquillian/kubernetes/Configuration.java
index 07be04f..961cbf2 100644
--- a/components/arquillian-fabric8/src/main/java/io/fabric8/arquillian/kubernetes/Configuration.java
+++ b/components/arquillian-fabric8/src/main/java/io/fabric8/arquillian/kubernetes/Configuration.java
@@ -34,7 +34,7 @@
 
     private String masterUrl;
     private URL configUrl;
-    private long timeout = 5 * 60 * 10000;
+    private long timeout = 5 * 60 * 1000;
     private long pollInterval = 5 * 1000;
 
     public String getMasterUrl() {
@@ -78,7 +78,7 @@
             }
 
             if (map.containsKey(POLL_INTERVAL)) {
-                configuration.timeout = Long.parseLong(map.get(POLL_INTERVAL));
+                configuration.pollInterval = Long.parseLong(map.get(POLL_INTERVAL));
             }
 
         } catch (Throwable t) {
