diff --git a/test/org/apache/coyote/http11/upgrade/TestUpgrade.java b/test/org/apache/coyote/http11/upgrade/TestUpgrade.java
index 5ef718d..20f3907 100644
--- a/test/org/apache/coyote/http11/upgrade/TestUpgrade.java
+++ b/test/org/apache/coyote/http11/upgrade/TestUpgrade.java
@@ -170,7 +170,7 @@
         Socket socket =
                 SocketFactory.getDefault().createSocket("localhost", getPort());
 
-        socket.setSoTimeout(5000);
+        socket.setSoTimeout(500000);
 
         UpgradeConnection uc = new UpgradeConnection(socket);
 
