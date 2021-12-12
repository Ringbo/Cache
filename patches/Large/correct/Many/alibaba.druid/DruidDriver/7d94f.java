diff --git a/src/main/java/com/alibaba/druid/proxy/DruidDriver.java b/src/main/java/com/alibaba/druid/proxy/DruidDriver.java
index ca9d598..54263dd 100644
--- a/src/main/java/com/alibaba/druid/proxy/DruidDriver.java
+++ b/src/main/java/com/alibaba/druid/proxy/DruidDriver.java
@@ -102,7 +102,7 @@
                 if (LOG == null) {
                     LOG = LogFactory.getLog(DruidDriver.class);
                 }
-                LOG.error("register druid-driver mbean error", ex);
+                LOG.warn("register druid-driver mbean error", ex);
             }
 
             return true;
