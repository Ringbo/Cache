diff --git a/src/net/java/sip/communicator/util/FileUtils.java b/src/net/java/sip/communicator/util/FileUtils.java
index dec27bc..96d3c1a 100644
--- a/src/net/java/sip/communicator/util/FileUtils.java
+++ b/src/net/java/sip/communicator/util/FileUtils.java
@@ -75,7 +75,7 @@
             }
             catch (Exception e1)
             {
-                logger.debug("Failed to obtain file icon from JFileChooser.", e);
+                logger.debug("Failed to obtain file icon from JFileChooser.", e1);
             }
         }
 
