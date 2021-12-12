diff --git a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/UdpChannel.java b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/UdpChannel.java
index 4bb11ee..e2464a1 100644
--- a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/UdpChannel.java
+++ b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/UdpChannel.java
@@ -161,7 +161,7 @@
             final String msg =
                 "URI must contain either a unicast configuration (%s) or a multicast configuration (%s) not both";
             throw new IllegalArgumentException(
-                format(msg, Arrays.toString(MULTICAST_KEYS), Arrays.toString(UNICAST_KEYS)));
+                format(msg, Arrays.toString(UNICAST_KEYS), Arrays.toString(MULTICAST_KEYS)));
         }
     }
 
