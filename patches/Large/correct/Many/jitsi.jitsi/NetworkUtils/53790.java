diff --git a/src/net/java/sip/communicator/util/NetworkUtils.java b/src/net/java/sip/communicator/util/NetworkUtils.java
index 85fae4b..63b2385 100644
--- a/src/net/java/sip/communicator/util/NetworkUtils.java
+++ b/src/net/java/sip/communicator/util/NetworkUtils.java
@@ -1204,11 +1204,11 @@
      * @param port the port number that we'd like verified.
      *
      * @return <tt>true</tt> if port is a valid and bindable port number and
-     * <tt>alse</tt> otherwise.
+     * <tt>false</tt> otherwise.
      */
     public static boolean isValidPortNumber(int port)
     {
-        return MIN_PORT_NUMBER < port && port < MAX_PORT_NUMBER;
+        return MIN_PORT_NUMBER <= port && port <= MAX_PORT_NUMBER;
     }
 
     /**
