diff --git a/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/ReactorNettyTcpClient.java b/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/ReactorNettyTcpClient.java
index c378374..99dccd3 100644
--- a/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/ReactorNettyTcpClient.java
+++ b/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/ReactorNettyTcpClient.java
@@ -139,7 +139,7 @@
 			builder.loopResources(this.loopResources);
 
 			if (!builder.isPoolDisabled()) {
-				this.poolResources = PoolResources.fixed("tcp-client-pool");
+				this.poolResources = PoolResources.elastic("tcp-client-pool");
 				builder.poolResources(this.poolResources);
 			}
 		};
