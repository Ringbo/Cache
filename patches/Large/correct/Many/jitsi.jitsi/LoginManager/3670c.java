diff --git a/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java b/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
index 5c6de13..4c391f4 100644
--- a/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
+++ b/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
@@ -159,7 +159,7 @@
                     || status.equals(Constants.ONLINE_STATUS) 
                     || ((status instanceof PresenceStatus)
                         && (((PresenceStatus)status).getStatus() 
-                            > PresenceStatus.ONLINE_THRESHOLD)))
+                            >= PresenceStatus.ONLINE_THRESHOLD)))
                 {
                     this.login(protocolProvider);
                 }
@@ -406,7 +406,7 @@
             || status.equals(Constants.ONLINE_STATUS) 
             || ((status instanceof PresenceStatus)
                 && (((PresenceStatus)status).getStatus() 
-                    > PresenceStatus.ONLINE_THRESHOLD)))
+                    >= PresenceStatus.ONLINE_THRESHOLD)))
         {
             this.login(protocolProvider);
         }
