diff --git a/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java b/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java
index e48bae1..ed45188 100644
--- a/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java
+++ b/webflux/src/test/java/org/springframework/security/web/server/context/AuthenticationReactorContextFilterTests.java
@@ -56,7 +56,7 @@
 				.then()
 			)
 		)
-		.contextStart( context -> context.put("foo", "bar")))
+		.subscriberContext( context -> context.put("foo", "bar")))
 		.verifyComplete();
 	}
 
