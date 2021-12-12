diff --git a/java/org/apache/catalina/mapper/Mapper.java b/java/org/apache/catalina/mapper/Mapper.java
index 7859144..90e0d6b 100644
--- a/java/org/apache/catalina/mapper/Mapper.java
+++ b/java/org/apache/catalina/mapper/Mapper.java
@@ -331,7 +331,7 @@
     private ContextVersion findContextVersion(String hostName,
             String contextPath, String version, boolean silent) {
         MappedHost host = exactFind(hosts, hostName);
-        if (host == null) {
+        if (host == null || host.isAlias()) {
             if (!silent) {
                 log.error("No host found: " + hostName);
             }
