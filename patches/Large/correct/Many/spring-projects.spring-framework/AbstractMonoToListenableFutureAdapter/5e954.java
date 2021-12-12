diff --git a/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/AbstractMonoToListenableFutureAdapter.java b/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/AbstractMonoToListenableFutureAdapter.java
index cfd259b..2a09105 100644
--- a/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/AbstractMonoToListenableFutureAdapter.java
+++ b/spring-messaging/src/main/java/org/springframework/messaging/tcp/reactor/AbstractMonoToListenableFutureAdapter.java
@@ -62,7 +62,7 @@
 					registry.success(adapted);
 				})
 				.doOnError(this.registry::failure)
-				.subscribe();
+				.toProcessor();
 	}
 
 
