diff --git a/driver-core/src/main/java/com/datastax/driver/core/policies/WhiteListPolicy.java b/driver-core/src/main/java/com/datastax/driver/core/policies/WhiteListPolicy.java
index ddf39ba..4c20848 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/policies/WhiteListPolicy.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/policies/WhiteListPolicy.java
@@ -127,7 +127,7 @@
 
     @Override
     public void onSuspected(Host host) {
-        if (whiteList.contains(host.getAddress()))
+        if (whiteList.contains(host.getSocketAddress()))
             childPolicy.onSuspected(host);
     }
 
