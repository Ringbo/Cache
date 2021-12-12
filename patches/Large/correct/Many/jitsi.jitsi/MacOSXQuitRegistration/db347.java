diff --git a/src/net/java/sip/communicator/impl/gui/main/menus/MacOSXQuitRegistration.java b/src/net/java/sip/communicator/impl/gui/main/menus/MacOSXQuitRegistration.java
index d85fb10..a9cabab 100644
--- a/src/net/java/sip/communicator/impl/gui/main/menus/MacOSXQuitRegistration.java
+++ b/src/net/java/sip/communicator/impl/gui/main/menus/MacOSXQuitRegistration.java
@@ -30,8 +30,12 @@
                      * application. We've already initiated the quit and we'll
                      * eventually complete it i.e. we'll honor the request of
                      * Mac OS X to quit.
+                     *
+                     * (2011-06-10) Changed to true, we tell that quit is handled
+                     * as otherwise will stop OS from logout or shutdown and
+                     * a notification will be shown to user to inform about it.
                      */
-                    event.setHandled(false);
+                    event.setHandled(true);
                 }
             });
             return true;
