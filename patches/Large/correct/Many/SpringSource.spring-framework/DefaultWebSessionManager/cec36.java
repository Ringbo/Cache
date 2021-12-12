diff --git a/spring-web/src/main/java/org/springframework/web/server/session/DefaultWebSessionManager.java b/spring-web/src/main/java/org/springframework/web/server/session/DefaultWebSessionManager.java
index 723bce3..88ac17d 100644
--- a/spring-web/src/main/java/org/springframework/web/server/session/DefaultWebSessionManager.java
+++ b/spring-web/src/main/java/org/springframework/web/server/session/DefaultWebSessionManager.java
@@ -105,7 +105,7 @@
 						.concatMap(this.sessionStore::retrieveSession)
 						.next()
 						.flatMap(session -> validateSession(exchange, session))
-						.otherwiseIfEmpty(createSession(exchange))
+						.switchIfEmpty(createSession(exchange))
 						.map(session -> extendSession(exchange, session)));
 	}
 
