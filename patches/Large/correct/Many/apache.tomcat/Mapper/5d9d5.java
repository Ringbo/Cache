diff --git a/java/org/apache/catalina/mapper/Mapper.java b/java/org/apache/catalina/mapper/Mapper.java
index 7c04cd4..334c648 100644
--- a/java/org/apache/catalina/mapper/Mapper.java
+++ b/java/org/apache/catalina/mapper/Mapper.java
@@ -56,7 +56,7 @@
     /**
      * Array containing the virtual hosts definitions.
      */
-    protected MappedHost[] hosts = new MappedHost[0];
+    protected volatile MappedHost[] hosts = new MappedHost[0];
 
 
     /**
@@ -168,7 +168,7 @@
         }
     }
 
-    private boolean addHostAliasImpl(MappedHost newAlias) {
+    private synchronized boolean addHostAliasImpl(MappedHost newAlias) {
         MappedHost[] newHosts = new MappedHost[hosts.length + 1];
         if (insertMap(hosts, newHosts, newAlias)) {
             hosts = newHosts;
