diff --git a/src/main/java/com/alibaba/druid/mock/MockDriver.java b/src/main/java/com/alibaba/druid/mock/MockDriver.java
index 1f0d902..ae9f4dd 100644
--- a/src/main/java/com/alibaba/druid/mock/MockDriver.java
+++ b/src/main/java/com/alibaba/druid/mock/MockDriver.java
@@ -144,7 +144,7 @@
                     mbeanServer.registerMBean(instance, objectName);
                 }
             } catch (Exception ex) {
-                getLog().error("register druid-driver mbean error", ex);
+                getLog().warn("register druid-driver mbean error", ex);
             }
 
             return true;
