diff --git a/src/net/java/sip/communicator/impl/configuration/ChangeEventDispatcher.java b/src/net/java/sip/communicator/impl/configuration/ChangeEventDispatcher.java
index c38b2b6..4e24475 100644
--- a/src/net/java/sip/communicator/impl/configuration/ChangeEventDispatcher.java
+++ b/src/net/java/sip/communicator/impl/configuration/ChangeEventDispatcher.java
@@ -306,7 +306,7 @@
                 try {
                     target.vetoableChange(evt);
                 } catch (PropertyVetoException e) {
-                    throw new ConfigPropertyVetoExceoption(e.getLocalizedMessage(), evt);
+                    throw new ConfigPropertyVetoException(e.getLocalizedMessage(), evt);
                 }
             }
         }
