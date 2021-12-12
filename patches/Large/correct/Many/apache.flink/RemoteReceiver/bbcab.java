diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/bytebuffered/RemoteReceiver.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/bytebuffered/RemoteReceiver.java
index 71dce5b..b9b6f43 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/bytebuffered/RemoteReceiver.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/bytebuffered/RemoteReceiver.java
@@ -132,7 +132,7 @@
 		final InetAddress ia = this.connectionAddress.getAddress();
 		out.writeInt(ia.getAddress().length);
 		out.write(ia.getAddress());
-		out.write(this.connectionAddress.getPort());
+		out.writeInt(this.connectionAddress.getPort());
 
 		out.writeInt(this.connectionIndex);
 	}
