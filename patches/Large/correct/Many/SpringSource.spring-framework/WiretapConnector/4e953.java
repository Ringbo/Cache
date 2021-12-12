diff --git a/spring-test/src/main/java/org/springframework/test/web/reactive/server/WiretapConnector.java b/spring-test/src/main/java/org/springframework/test/web/reactive/server/WiretapConnector.java
index 95dbb8f..216053e 100644
--- a/spring-test/src/main/java/org/springframework/test/web/reactive/server/WiretapConnector.java
+++ b/spring-test/src/main/java/org/springframework/test/web/reactive/server/WiretapConnector.java
@@ -81,7 +81,7 @@
 	 * Retrieve the {@code ExchangeResult} for the given "request-id" header value.
 	 */
 	public ExchangeResult claimRequest(String requestId) {
-		ExchangeResult result = this.exchanges.get(requestId);
+		ExchangeResult result = this.exchanges.remove(requestId);
 		Assert.notNull(result, "No match for " + WebTestClient.WEBTESTCLIENT_REQUEST_ID + "=" + requestId);
 		return result;
 	}
