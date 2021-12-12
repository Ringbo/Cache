diff --git a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java
index 46f2077..361d7c8 100644
--- a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java
+++ b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java
@@ -610,7 +610,7 @@
         }
         catch (Throwable t)
         {
-            __logger.error("Unable to set 'this.bundle.install' " + " for the bundle " + bundle.getSymbolicName(), t);
+            __logger.warn("Unable to set 'this.bundle.install' " + " for the bundle " + bundle.getSymbolicName(), t);
         }
     }
 
