diff --git a/src/net/java/sip/communicator/impl/neomedia/MediaServiceImpl.java b/src/net/java/sip/communicator/impl/neomedia/MediaServiceImpl.java
index 4713cd8..e63ed06 100644
--- a/src/net/java/sip/communicator/impl/neomedia/MediaServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/neomedia/MediaServiceImpl.java
@@ -614,7 +614,7 @@
 
                 PortAudio.addDeviceChangedCallback(this);
             }
-            catch(Exception e)
+            catch(Throwable e)
             {
                 logger.info("Cannot create audio configuration panel", e);
             }
