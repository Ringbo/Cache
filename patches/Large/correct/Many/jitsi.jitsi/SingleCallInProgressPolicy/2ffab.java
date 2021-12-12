diff --git a/src/net/java/sip/communicator/service/protocol/SingleCallInProgressPolicy.java b/src/net/java/sip/communicator/service/protocol/SingleCallInProgressPolicy.java
index 7e984e6..9512fce 100644
--- a/src/net/java/sip/communicator/service/protocol/SingleCallInProgressPolicy.java
+++ b/src/net/java/sip/communicator/service/protocol/SingleCallInProgressPolicy.java
@@ -261,7 +261,9 @@
                             && CallState.CALL_IN_PROGRESS
                                     .equals(otherCall.getCallState()))
                     {
-                        if((call.getCallGroup() != null ||
+                        if((call.getCallGroup() == null &&
+                            otherCall.getCallGroup() == null) ||
+                            (call.getCallGroup() != null ||
                             otherCall.getCallGroup() != null) &&
                             call.getCallGroup() != otherCall.getCallGroup())
                             putOnHold(otherCall);
