diff --git a/src/net/java/sip/communicator/impl/sysactivity/SystemActivityNotificationsServiceImpl.java b/src/net/java/sip/communicator/impl/sysactivity/SystemActivityNotificationsServiceImpl.java
index 4c6b708..b601972 100644
--- a/src/net/java/sip/communicator/impl/sysactivity/SystemActivityNotificationsServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/sysactivity/SystemActivityNotificationsServiceImpl.java
@@ -635,8 +635,7 @@
 
                 if(className != null)
                     currentRunningManager = (SystemActivityManager)
-                        Class.forName(SYSTEM_ACTIVITY_MANAGER_LINUX_CLASS)
-                            .newInstance();
+                        Class.forName(className).newInstance();
             }
             catch(Throwable t)
             {
