diff --git a/src/net/java/sip/communicator/impl/media/CallSessionImpl.java b/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
index 97e49f4..ff28481 100644
--- a/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
+++ b/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
@@ -1481,13 +1481,13 @@
     {
         String attribute;
 
-        if (ON_HOLD_LOCALLY == (onHold | ON_HOLD_LOCALLY))
+        if (ON_HOLD_LOCALLY == (onHold & ON_HOLD_LOCALLY))
             attribute =
-                (ON_HOLD_REMOTELY == (onHold | ON_HOLD_REMOTELY)) ? "inactive"
+                (ON_HOLD_REMOTELY == (onHold & ON_HOLD_REMOTELY)) ? "inactive"
                         : "sendonly";
         else
             attribute =
-                (ON_HOLD_REMOTELY == (onHold | ON_HOLD_REMOTELY)) ? "recvonly"
+                (ON_HOLD_REMOTELY == (onHold & ON_HOLD_REMOTELY)) ? "recvonly"
                         : null;
 
         if (attribute != null)
