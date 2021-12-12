diff --git a/AndroidAsync/src/com/koushikdutta/async/dns/Dns.java b/AndroidAsync/src/com/koushikdutta/async/dns/Dns.java
index bc276d6..76f366b 100644
--- a/AndroidAsync/src/com/koushikdutta/async/dns/Dns.java
+++ b/AndroidAsync/src/com/koushikdutta/async/dns/Dns.java
@@ -103,11 +103,11 @@
             }
             else {
 //                System.out.println("multicast dns...");
-                dgram = AsyncServer.getDefault().openDatagram(new InetSocketAddress(5353), true);
+                dgram = AsyncServer.getDefault().openDatagram(new InetSocketAddress(0), true);
                 Field field = DatagramSocket.class.getDeclaredField("impl");
                 field.setAccessible(true);
                 Object impl = field.get(dgram.getSocket());
-                Method method = impl.getClass().getMethod("join", InetAddress.class);
+                Method method = impl.getClass().getDeclaredMethod("join", InetAddress.class);
                 method.setAccessible(true);
                 method.invoke(impl, InetAddress.getByName("224.0.0.251"));
                 ((DatagramSocket)dgram.getSocket()).setBroadcast(true);
