diff --git a/core/src/main/java/com/google/net/stubby/newtransport/MessageFramer.java b/core/src/main/java/com/google/net/stubby/newtransport/MessageFramer.java
index f74b837..7a0502d 100644
--- a/core/src/main/java/com/google/net/stubby/newtransport/MessageFramer.java
+++ b/core/src/main/java/com/google/net/stubby/newtransport/MessageFramer.java
@@ -132,7 +132,7 @@
 
   @Override
   public void writeStatus(Status status) {
-    short code = (short) status.getCode().ordinal();
+    short code = (short) status.getCode().getNumber();
     scratch.clear();
     scratch.put(GrpcFramingUtil.STATUS_FRAME);
     int length = 2;
