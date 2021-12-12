diff --git a/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/MyqData.java b/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/MyqData.java
index 89010de..010aef6 100644
--- a/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/MyqData.java
+++ b/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/MyqData.java
@@ -98,7 +98,7 @@
 	 */
 	public GarageDoorData getGarageData() throws InvalidLoginException,
 			IOException {
-		logger.debug("Retreiveing door data");
+		logger.trace("Retreiveing door data");
 		String url = String.format(
 				"%s/api/v4/userdevicedetails/get?appId=%s&SecurityToken=%s",
 				WEBSITE, enc(appId), enc(getSecurityToken()));
@@ -112,7 +112,7 @@
 	 * Validates Username and Password then saved sercurityToken to a variable
 	 */
 	private void login() throws InvalidLoginException, IOException {
-		logger.debug("attempting to login");
+		logger.trace("attempting to login");
 		String url = String
 				.format("%s/api/user/validate?appId=%s&SecurityToken=null&username=%s&password=%s",
 						WEBSITE, enc(appId), enc(userName), enc(password));
@@ -183,13 +183,13 @@
 			String payload, String payloadType, boolean retry)
 			throws IOException, InvalidLoginException {
 
-		logger.debug("Requsting URL {}", url);
+		logger.trace("Requsting URL {}", url);
 
 		String dataString = executeUrl(method, url, header,
 				payload == null ? null : IOUtils.toInputStream(payload),
 				payloadType, timeout);
 
-		logger.debug("Received MyQ  JSON: {}", dataString);
+		logger.trace("Received MyQ  JSON: {}", dataString);
 
 		if (dataString == null) {
 			throw new IOException("Null response from MyQ server");
@@ -199,7 +199,7 @@
 			ObjectMapper mapper = new ObjectMapper();
 			JsonNode rootNode = mapper.readTree(dataString);
 			int returnCode = rootNode.get("ReturnCode").asInt();
-			logger.debug("myq ReturnCode: {}", returnCode);
+			logger.trace("myq ReturnCode: {}", returnCode);
 
 			MyQResponseCode rc = MyQResponseCode.fromCode(returnCode);
 
