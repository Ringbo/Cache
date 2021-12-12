diff --git a/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java b/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
index e9225cd..35bce41 100644
--- a/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
+++ b/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
@@ -186,7 +186,7 @@
                     msgText).showDialog();
             }
 
-            logger.error(evt.getReason());
+            logger.trace(evt.getReason());
         }
         else if (evt.getNewState().equals(RegistrationState.CONNECTION_FAILED))
         {
@@ -208,7 +208,7 @@
                 this.login(protocolProvider);
             }
 
-            logger.error(evt.getReason());
+            logger.trace(evt.getReason());
         }
         else if (evt.getNewState().equals(RegistrationState.EXPIRED))
         {
@@ -268,7 +268,7 @@
                             .getI18NString("service.gui.ERROR"),
                         msgText).showDialog();
                 }
-                logger.error(evt.getReason());
+                logger.trace(evt.getReason());
             }
         }
     }
