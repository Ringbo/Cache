diff --git a/disconf-client/src/main/java/com/baidu/disconf/client/support/registry/impl/SimpleRegistry.java b/disconf-client/src/main/java/com/baidu/disconf/client/support/registry/impl/SimpleRegistry.java
index 949fe3f..73effad 100644
--- a/disconf-client/src/main/java/com/baidu/disconf/client/support/registry/impl/SimpleRegistry.java
+++ b/disconf-client/src/main/java/com/baidu/disconf/client/support/registry/impl/SimpleRegistry.java
@@ -47,6 +47,6 @@
 
     @Override
     public <T> T getFirstByType(Class<T> type, boolean withProxy) {
-        return getFirstByType(type, withProxy);
+        return getFirstByType(type);
     }
 }
