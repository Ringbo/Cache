diff --git a/model/infinispan/src/main/java/org/keycloak/cluster/infinispan/InfinispanNotificationsManager.java b/model/infinispan/src/main/java/org/keycloak/cluster/infinispan/InfinispanNotificationsManager.java
index 4cd8cf1..d08f3b9 100644
--- a/model/infinispan/src/main/java/org/keycloak/cluster/infinispan/InfinispanNotificationsManager.java
+++ b/model/infinispan/src/main/java/org/keycloak/cluster/infinispan/InfinispanNotificationsManager.java
@@ -215,7 +215,7 @@
             try {
                 listenersExecutor.submit(() -> {
 
-                    Object value = workCache.get(key);
+                    Object value = remoteCache.get(key);
                     eventReceived(key, (Serializable) value);
 
                 });
