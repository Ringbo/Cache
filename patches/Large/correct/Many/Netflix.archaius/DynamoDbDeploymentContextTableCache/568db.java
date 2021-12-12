diff --git a/archaius-aws/src/main/java/com/netflix/config/sources/DynamoDbDeploymentContextTableCache.java b/archaius-aws/src/main/java/com/netflix/config/sources/DynamoDbDeploymentContextTableCache.java
index 56b1c65..634b4d2 100644
--- a/archaius-aws/src/main/java/com/netflix/config/sources/DynamoDbDeploymentContextTableCache.java
+++ b/archaius-aws/src/main/java/com/netflix/config/sources/DynamoDbDeploymentContextTableCache.java
@@ -30,7 +30,7 @@
  * having to load the table separately.
  */
 public class DynamoDbDeploymentContextTableCache extends AbstractDynamoDbConfigurationSource<PropertyWithDeploymentContext> {
-    private static Logger log = LoggerFactory.getLogger(AbstractPollingScheduler.class);
+    private static Logger log = LoggerFactory.getLogger(DynamoDbDeploymentContextTableCache.class);
 
     //Property names
     static final String contextKeyAttributePropertyName = "com.netflix.config.dynamo.contextKeyAttributeName";
@@ -194,7 +194,7 @@
         executor = Executors.newScheduledThreadPool(1, new ThreadFactory() {
             @Override
             public Thread newThread(Runnable r) {
-                Thread t = new Thread(r, "pollingConfigurationSource");
+                Thread t = new Thread(r, "pollingDynamoTableCache");
                 t.setDaemon(true);
                 return t;
             }
@@ -220,7 +220,7 @@
     private Runnable getPollingRunnable() {
         return new Runnable() {
             public void run() {
-                log.debug("Polling started");
+                log.debug("Dynamo cached polling started");
                 try {
                     Map<String, PropertyWithDeploymentContext> newMap = loadPropertiesFromTable(tableName.get());
                     cachedTable = newMap;
