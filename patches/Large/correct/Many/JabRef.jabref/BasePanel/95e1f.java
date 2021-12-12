diff --git a/src/main/java/net/sf/jabref/BasePanel.java b/src/main/java/net/sf/jabref/BasePanel.java
index cdbcd86..046eb3d 100644
--- a/src/main/java/net/sf/jabref/BasePanel.java
+++ b/src/main/java/net/sf/jabref/BasePanel.java
@@ -294,7 +294,7 @@
                 fileMonitorHandle = Globals.fileUpdateMonitor.addUpdateListener(this,
                         file);
             } catch (IOException ex) {
-                LOGGER.debug("Could not register FileUpdateMonitor", ex);
+                LOGGER.warn("Could not register FileUpdateMonitor", ex);
             }
         }
 
@@ -1340,7 +1340,7 @@
                             try {
                                 Util.openFolderAndSelectFile(f.getAbsolutePath());
                             } catch (IOException e) {
-                                LOGGER.debug("Could not open folder", e);
+                                LOGGER.info("Could not open folder", e);
                             }
                         }
                     }
