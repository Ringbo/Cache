diff --git a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java
index cc86592..77046bf 100644
--- a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java
+++ b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/WebBundleDeployerHelper.java
@@ -254,7 +254,7 @@
                         }
                         fragUrl = DefaultFileLocatorHelper.getLocalURL(fragUrl);
                         String key = patchFragFolder.startsWith("/") ? patchFragFolder.substring(1) : patchFragFolder;
-                        patchResourcesPath.put(key + ";" + frag.getSymbolicName(), Resource.newResource(fragUrl));
+                        appendedResourcesPath.put(key + ";" + frag.getSymbolicName(), Resource.newResource(fragUrl));
                     }
                     if (patchFragFolder != null)
                     {
@@ -266,7 +266,7 @@
                         }
                         patchFragUrl = DefaultFileLocatorHelper.getLocalURL(patchFragUrl);
                         String key = patchFragFolder.startsWith("/") ? patchFragFolder.substring(1) : patchFragFolder;
-                        appendedResourcesPath.put(key + ";" + frag.getSymbolicName(), Resource.newResource(patchFragUrl));
+                        patchResourcesPath.put(key + ";" + frag.getSymbolicName(), Resource.newResource(patchFragUrl));
                     }
                 }
                 
