diff --git a/src/net/java/sip/communicator/impl/protocol/icq/ContactGroupIcqImpl.java b/src/net/java/sip/communicator/impl/protocol/icq/ContactGroupIcqImpl.java
index cb2c94a..f54ae92 100644
--- a/src/net/java/sip/communicator/impl/protocol/icq/ContactGroupIcqImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/icq/ContactGroupIcqImpl.java
@@ -157,7 +157,7 @@
                 = buddies.entrySet().iterator();
              buddyIter.hasNext();)
         {
-            if (buddyIter.next().getKey().equals(contact))
+            if (buddyIter.next().getValue().equals(contact))
             {
                 buddyIter.remove();
                 break;
