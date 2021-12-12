diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java b/src/protocol/http/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java
index 972b7be..fda7e42 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/control/HttpMirrorServer.java
@@ -116,7 +116,7 @@
     }
 
     public static void main(String args[]){
-        int port = 8080;
+        int port = 8081;
         if (args.length > 0){
             port = Integer.parseInt(args[0]);
         }
