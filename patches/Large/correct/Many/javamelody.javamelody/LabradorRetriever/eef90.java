diff --git a/javamelody-core/src/main/java/net/bull/javamelody/LabradorRetriever.java b/javamelody-core/src/main/java/net/bull/javamelody/LabradorRetriever.java
index 1ed7fb2..2f1d387 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/LabradorRetriever.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/LabradorRetriever.java
@@ -338,7 +338,9 @@
 	}
 
 	private static class LabradorMock { // NOPMD
+		// CHECKSTYLE:OFF
 		static Object createMockResultOfPartCall(String request) throws IOException { // NOPMD
+			// CHECKSTYLE:ON
 			final Object result;
 			if (request.contains(HttpParameters.SESSIONS_PART)
 					&& request.contains(HttpParameters.SESSION_ID_PARAMETER)) {
@@ -346,7 +348,8 @@
 			} else if (request.contains(HttpParameters.SESSIONS_PART)
 					|| request.contains(HttpParameters.PROCESSES_PART)
 					|| request.contains(HttpParameters.JNDI_PART)
-					|| request.contains(HttpParameters.CONNECTIONS_PART)) {
+					|| request.contains(HttpParameters.CONNECTIONS_PART)
+					|| request.contains(HttpParameters.MBEANS_PART)) {
 				result = Collections.emptyList();
 			} else if (request.contains(HttpParameters.DATABASE_PART)) {
 				try {
