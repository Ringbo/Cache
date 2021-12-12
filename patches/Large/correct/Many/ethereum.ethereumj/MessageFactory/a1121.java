diff --git a/ethereumj-core/src/main/java/org/ethereum/net/message/MessageFactory.java b/ethereumj-core/src/main/java/org/ethereum/net/message/MessageFactory.java
index 6317880..5d66b41 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/message/MessageFactory.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/message/MessageFactory.java
@@ -63,7 +63,7 @@
             switch (receivedCommand) {
                 case STATUS:
                     break;
-                case MESSAGES:
+                case MESSAGE:
                     break;
                 case ADD_FILTER:
                     break;
