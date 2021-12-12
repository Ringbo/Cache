diff --git a/test/org/apache/tomcat/websocket/pojo/TestPojoMethodMapping.java b/test/org/apache/tomcat/websocket/pojo/TestPojoMethodMapping.java
index cb4373d..59571a9 100644
--- a/test/org/apache/tomcat/websocket/pojo/TestPojoMethodMapping.java
+++ b/test/org/apache/tomcat/websocket/pojo/TestPojoMethodMapping.java
@@ -75,9 +75,9 @@
         session.getBasicRemote().sendText("NO-OP");
         session.close();
 
-        // Give server 5s to close
+        // Give server 20s to close. 5s should be plenty but the Gump VM is slow
         int count = 0;
-        while (count < 50) {
+        while (count < 200) {
             if (server.isClosed()) {
                 break;
             }
