diff --git a/portal-service/src/com/liferay/portal/kernel/util/Validator.java b/portal-service/src/com/liferay/portal/kernel/util/Validator.java
index 1c80121..720bd05 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/Validator.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/Validator.java
@@ -1235,7 +1235,7 @@
 	 *         <code>false</code> otherwise
 	 */
 	public static boolean isUrl(String url) {
-		if (isNotNull(url)) {
+		if (isUri(url)) {
 			if (url.indexOf(CharPool.COLON) == -1) {
 				return false;
 			}
