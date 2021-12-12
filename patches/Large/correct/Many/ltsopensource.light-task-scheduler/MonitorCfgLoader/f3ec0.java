diff --git a/lts-monitor/src/main/java/com/github/ltsopensource/monitor/MonitorCfgLoader.java b/lts-monitor/src/main/java/com/github/ltsopensource/monitor/MonitorCfgLoader.java
index 734d2ef..60156ca 100644
--- a/lts-monitor/src/main/java/com/github/ltsopensource/monitor/MonitorCfgLoader.java
+++ b/lts-monitor/src/main/java/com/github/ltsopensource/monitor/MonitorCfgLoader.java
@@ -51,7 +51,7 @@
 
             String identity = conf.getProperty("identity");
             if (StringUtils.isNotEmpty(identity)) {
-                cfg.setBindIp(identity);
+                cfg.setIdentity(identity);
             }
 
             Map<String, String> configs = new HashMap<String, String>();
