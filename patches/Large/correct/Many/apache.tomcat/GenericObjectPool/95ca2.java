diff --git a/java/org/apache/tomcat/dbcp/pool2/impl/GenericObjectPool.java b/java/org/apache/tomcat/dbcp/pool2/impl/GenericObjectPool.java
index 938e28c..d3bed4f 100644
--- a/java/org/apache/tomcat/dbcp/pool2/impl/GenericObjectPool.java
+++ b/java/org/apache/tomcat/dbcp/pool2/impl/GenericObjectPool.java
@@ -324,7 +324,7 @@
      *
      * @see AbandonedConfig
      */
-    public void setAbandonedConfig(AbandonedConfig abandonedConfig) throws IllegalArgumentException {
+    public void setAbandonedConfig(AbandonedConfig abandonedConfig) {
         if (abandonedConfig == null) {
             this.abandonedConfig = null;
         } else {
