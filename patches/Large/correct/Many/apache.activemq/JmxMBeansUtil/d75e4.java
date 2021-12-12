diff --git a/activemq-console/src/main/java/org/apache/activemq/console/util/JmxMBeansUtil.java b/activemq-console/src/main/java/org/apache/activemq/console/util/JmxMBeansUtil.java
index e6ab33f..21ceb9b 100644
--- a/activemq-console/src/main/java/org/apache/activemq/console/util/JmxMBeansUtil.java
+++ b/activemq-console/src/main/java/org/apache/activemq/console/util/JmxMBeansUtil.java
@@ -57,7 +57,7 @@
         return (new MBeansAttributeQueryFilter(jmxConnection, attributes, new MBeansObjectNameQueryFilter(jmxConnection))).query("type=Broker,brokerName=" + brokerName);
     }
 
-    public static List queryMBeans(MBeanServerConnection jmxConnection, List queryList) throws Exception {
+    public static List x_queryMBeans(MBeanServerConnection jmxConnection, List queryList) throws Exception {
         // If there is no query defined get all mbeans
         if (queryList == null || queryList.size() == 0) {
             return createMBeansObjectNameQuery(jmxConnection).query("");
@@ -106,10 +106,7 @@
     }
 
     public static QueryFilter createMBeansObjectNameQuery(MBeanServerConnection jmxConnection) {
-        // Let us be able to accept wildcard queries
-        // Use regular expressions to filter the query results
-        // Let us retrieve the mbeans object name specified by the query
-        return new WildcardToRegExTransformFilter(new MBeansRegExQueryFilter(new MBeansObjectNameQueryFilter(jmxConnection)));
+        return new MBeansObjectNameQueryFilter(jmxConnection);
     }
 
     public static QueryFilter createMBeansAttributeQuery(MBeanServerConnection jmxConnection, Set attributes) {
