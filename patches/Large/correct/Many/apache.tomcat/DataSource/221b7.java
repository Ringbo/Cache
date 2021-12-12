diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/DataSource.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/DataSource.java
index 66fdeb9..b499d6e 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/DataSource.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/DataSource.java
@@ -118,7 +118,9 @@
         String origDomain = original.getDomain();
         properties.put("type", "ConnectionPool");
         properties.put("class", this.getClass().getName());
-        if (original.getKeyProperty("path")!=null) {
+        if (original.getKeyProperty("path")!=null || properties.get("context")!=null) {
+            //this ensures that if the registration came from tomcat, we're not losing
+            //the unique domain, but putting that into as an engine attribute
             properties.put("engine", origDomain);
         }
         ObjectName name = new ObjectName(domain,properties);
