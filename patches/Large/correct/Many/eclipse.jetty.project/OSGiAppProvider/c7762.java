diff --git a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/OSGiAppProvider.java b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/OSGiAppProvider.java
index 0d671ea..df97bed 100644
--- a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/OSGiAppProvider.java
+++ b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/OSGiAppProvider.java
@@ -474,14 +474,14 @@
 	                if (!scandir.exists() || !scandir.isDirectory())
 	                {
 	                	setAutoInstallOSGiBundles(false);
-	            		Log.info("Disable autoInstallOSGiBundles as the contexts folder '" + scandir.getAbsolutePath() + " does not exist.");
+	            		Log.warn("Disable autoInstallOSGiBundles as the contexts folder '" + scandir.getAbsolutePath() + " does not exist.");
 	            		scandir = null;
 	                }
 	    		}
 	    		catch (IOException ioe)
 	    		{
                 	setAutoInstallOSGiBundles(false);
-            		Log.info("Disable autoInstallOSGiBundles as the contexts folder '" + getMonitoredDirResource().getURI() + " does not exist.");
+            		Log.warn("Disable autoInstallOSGiBundles as the contexts folder '" + getMonitoredDirResource().getURI() + " does not exist.");
             		scandir = null;
 	    		}
 	    		if (scandir != null)
