diff --git a/community/jmx/src/main/java/org/neo4j/jmx/impl/JmxExtension.java b/community/jmx/src/main/java/org/neo4j/jmx/impl/JmxExtension.java
index dc33e68..b5361fb 100644
--- a/community/jmx/src/main/java/org/neo4j/jmx/impl/JmxExtension.java
+++ b/community/jmx/src/main/java/org/neo4j/jmx/impl/JmxExtension.java
@@ -54,7 +54,7 @@
         {
             Neo4jMBean bean = new KernelBean( kernel, support );
             mbs.registerMBean( bean, bean.objectName );
-            beans.add( 0, bean );
+            beans.add( bean );
         }
         catch ( Exception e )
         {
@@ -80,7 +80,7 @@
         {
             Neo4jMBean bean = new ConfigurationBean( kernel, support );
             mbs.registerMBean( bean, bean.objectName );
-            beans.add( 0, bean );
+            beans.add( bean );
         }
         catch ( Exception e )
         {
