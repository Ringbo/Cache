diff --git a/modules/bayeux/java/org/apache/tomcat/bayeux/TomcatBayeux.java b/modules/bayeux/java/org/apache/tomcat/bayeux/TomcatBayeux.java
index f8d6882..d6f17f7 100644
--- a/modules/bayeux/java/org/apache/tomcat/bayeux/TomcatBayeux.java
+++ b/modules/bayeux/java/org/apache/tomcat/bayeux/TomcatBayeux.java
@@ -105,7 +105,7 @@
     }
     
     public List<Client> getClients() {
-        return java.util.Arrays.asList(clients.entrySet().toArray(new Client[0]));
+        return java.util.Arrays.asList(clients.values().toArray(new Client[0]));
     }
 
     public SecurityPolicy getSecurityPolicy() {
