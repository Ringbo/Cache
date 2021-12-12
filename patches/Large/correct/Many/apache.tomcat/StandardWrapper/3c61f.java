diff --git a/java/org/apache/catalina/core/StandardWrapper.java b/java/org/apache/catalina/core/StandardWrapper.java
index 8c61204..6ed3485 100644
--- a/java/org/apache/catalina/core/StandardWrapper.java
+++ b/java/org/apache/catalina/core/StandardWrapper.java
@@ -1787,7 +1787,7 @@
                 broadcaster.sendNotification(notification);
             }
         } catch( Exception ex ) {
-            log.info("Error registering servlet with jmx " + this);
+            log.info("Error registering servlet with jmx " + this, ex);
         }
 
         if (isJspServlet) {
@@ -1802,7 +1802,7 @@
                     .registerComponent(instance, jspMonitorON, null);
             } catch( Exception ex ) {
                 log.info("Error registering JSP monitoring with jmx " +
-                         instance);
+                         instance, ex);
             }
         }
     }
