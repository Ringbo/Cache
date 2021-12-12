diff --git a/ribbon-core/src/main/java/com/netflix/client/config/DefaultClientConfigImpl.java b/ribbon-core/src/main/java/com/netflix/client/config/DefaultClientConfigImpl.java
index 6722b7a..32d39ee 100644
--- a/ribbon-core/src/main/java/com/netflix/client/config/DefaultClientConfigImpl.java
+++ b/ribbon-core/src/main/java/com/netflix/client/config/DefaultClientConfigImpl.java
@@ -140,7 +140,7 @@
     
     public static final int DEFAULT_CONNECTIONIDLE_TIME_IN_MSECS = 30000; // all connections idle for 30 secs
 
-    volatile Map<String, Object> properties = new ConcurrentHashMap<String, Object>();
+    protected volatile Map<String, Object> properties = new ConcurrentHashMap<String, Object>();
     
     private static final Logger LOG = LoggerFactory.getLogger(DefaultClientConfigImpl.class);
 
@@ -406,7 +406,7 @@
         return (clientName == null) ? getDefaultPropName(propName) : getInstancePropName(clientName, propName);
     }
     
-    private void setPropertyInternal(final String propName, Object value) {
+    protected void setPropertyInternal(final String propName, Object value) {
         String stringValue = (value == null) ? "" : String.valueOf(value);
         properties.put(propName, stringValue);
         if (!enableDynamicProperties) {
