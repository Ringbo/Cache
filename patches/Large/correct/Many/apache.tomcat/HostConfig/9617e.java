diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index 7fc7fde..32a40b8 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -842,7 +842,7 @@
                     } catch (Exception e) {
                         log.error(sm.getString(
                                 "hostConfig.deployDescriptor.error",
-                                war.getAbsolutePath()));
+                                war.getAbsolutePath()), e);
                     } finally {
                         if (context == null) {
                             context = new FailedContext();
@@ -862,7 +862,7 @@
                     } catch (Exception e) {
                         log.error(sm.getString(
                                 "hostConfig.deployDescriptor.error",
-                                war.getAbsolutePath()));
+                                war.getAbsolutePath()), e);
                     } finally {
                         if (context == null) {
                             context = new FailedContext();
@@ -1007,7 +1007,7 @@
                     } catch (Exception e) {
                         log.error(sm.getString(
                                 "hostConfig.deployDescriptor.error",
-                                xml));
+                                xml), e);
                     } finally {
                         if (context == null) {
                             context = new FailedContext();
