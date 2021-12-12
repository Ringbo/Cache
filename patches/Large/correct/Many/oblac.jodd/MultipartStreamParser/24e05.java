diff --git a/mod/jodd/src/jodd/servlet/upload/MultipartStreamParser.java b/mod/jodd/src/jodd/servlet/upload/MultipartStreamParser.java
index 8d8f652..6ab0444 100644
--- a/mod/jodd/src/jodd/servlet/upload/MultipartStreamParser.java
+++ b/mod/jodd/src/jodd/servlet/upload/MultipartStreamParser.java
@@ -215,7 +215,7 @@
 	 * Returns parameter names of all uploaded files.
 	 */
 	public Set<String> getFileParameterNames() {
-		if (requestParameters == null) {
+		if (requestFiles == null) {
 			return Collections.emptySet();
 		}
 		return requestFiles.keySet();
