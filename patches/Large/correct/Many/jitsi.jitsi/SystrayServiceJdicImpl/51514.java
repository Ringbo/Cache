diff --git a/src/net/java/sip/communicator/impl/osdependent/jdic/SystrayServiceJdicImpl.java b/src/net/java/sip/communicator/impl/osdependent/jdic/SystrayServiceJdicImpl.java
index abfe81d..c900d12 100644
--- a/src/net/java/sip/communicator/impl/osdependent/jdic/SystrayServiceJdicImpl.java
+++ b/src/net/java/sip/communicator/impl/osdependent/jdic/SystrayServiceJdicImpl.java
@@ -338,7 +338,7 @@
         // auto switch to the configured one when it will be available.
         // we will be aware of it since we listen for new registered
         // service in the bundle context.
-        if (activePopupHandler == null)
+        if (activePopupHandler == null && pph != null)
         {
             setActivePopupMessageHandler(pph);
         }
@@ -682,8 +682,10 @@
                     String configuredHandler = (String) configService.
                         getProperty("systray.POPUP_HANDLER");
                     
-                    if (configuredHandler == null && 
-                        (handler.getPreferenceIndex() > activePopupHandler.getPreferenceIndex()))
+                    if (configuredHandler == null
+                        && (activePopupHandler == null
+                            || (handler.getPreferenceIndex()
+                                > activePopupHandler.getPreferenceIndex())))
                     {
                         // The user doesn't have a preferred handler set and new 
                         // handler with better preference index has arrived, 
