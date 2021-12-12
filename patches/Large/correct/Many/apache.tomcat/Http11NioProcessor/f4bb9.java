diff --git a/java/org/apache/coyote/http11/Http11NioProcessor.java b/java/org/apache/coyote/http11/Http11NioProcessor.java
index aff7b31..a48ecf2 100644
--- a/java/org/apache/coyote/http11/Http11NioProcessor.java
+++ b/java/org/apache/coyote/http11/Http11NioProcessor.java
@@ -647,7 +647,7 @@
             //notify poller if not on a tomcat thread
             RequestInfo rp = request.getRequestProcessor();
             if ( rp.getStage() != org.apache.coyote.Constants.STAGE_SERVICE ) //async handling
-                socket.getPoller().cometInterest(socket);
+                socket.getPoller().add(socket);
         } else if (actionCode == ActionCode.COMET_SETTIMEOUT) {
             if (param==null) return;
             if (socket==null || socket.getAttachment(false)==null) return;
