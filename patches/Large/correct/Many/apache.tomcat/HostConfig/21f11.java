diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index ee1f113..7fc7fde 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -553,7 +553,7 @@
                 } catch (Exception e) {
                     log.error(sm.getString(
                             "hostConfig.deployDescriptor.error",
-                            contextXml.getAbsolutePath()));
+                            contextXml.getAbsolutePath()), e);
                 } finally {
                     if (context == null) {
                         context = new FailedContext();
