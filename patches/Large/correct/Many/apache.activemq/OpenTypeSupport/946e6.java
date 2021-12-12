diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/jmx/OpenTypeSupport.java b/activemq-broker/src/main/java/org/apache/activemq/broker/jmx/OpenTypeSupport.java
index d542d36..735d8ad 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/jmx/OpenTypeSupport.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/jmx/OpenTypeSupport.java
@@ -64,7 +64,7 @@
         private final List<String> itemDescriptionsList = new ArrayList<String>();
         private final List<OpenType> itemTypesList = new ArrayList<OpenType>();
 
-        public CompositeType getCompositeType() throws OpenDataException {
+        public synchronized CompositeType getCompositeType() throws OpenDataException {
             if (compositeType == null) {
                 init();
                 compositeType = createCompositeType();
