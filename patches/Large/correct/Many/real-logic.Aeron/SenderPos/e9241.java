diff --git a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/stats/SenderPos.java b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/stats/SenderPos.java
index 15eaa8d..6c69228 100644
--- a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/stats/SenderPos.java
+++ b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/stats/SenderPos.java
@@ -23,7 +23,7 @@
     /**
      * Type id of a sender position counter.
      */
-    public static final int SENDER_POSITION_TYPE_ID = 4;
+    public static final int SENDER_POSITION_TYPE_ID = 2;
 
     public static Position allocate(
         final CountersManager countersManager,
@@ -33,6 +33,6 @@
         final String channel)
     {
         return StreamPositionCounter.allocate(
-            "sender hwm", SENDER_POSITION_TYPE_ID, countersManager, registrationId, sessionId, streamId, channel);
+            "sender pos", SENDER_POSITION_TYPE_ID, countersManager, registrationId, sessionId, streamId, channel);
     }
 }
