diff --git a/oauth2/oauth2-core/src/main/java/org/springframework/security/oauth2/core/OAuth2Error.java b/oauth2/oauth2-core/src/main/java/org/springframework/security/oauth2/core/OAuth2Error.java
index 6ee9612..cafe330 100644
--- a/oauth2/oauth2-core/src/main/java/org/springframework/security/oauth2/core/OAuth2Error.java
+++ b/oauth2/oauth2-core/src/main/java/org/springframework/security/oauth2/core/OAuth2Error.java
@@ -34,7 +34,7 @@
  * @see OAuth2ErrorCodes
  * @see <a target="_blank" href="https://tools.ietf.org/html/rfc6749#section-11.4">Section 11.4 OAuth Extensions Error Registry</a>
  */
-public final class OAuth2Error implements Serializable {
+public class OAuth2Error implements Serializable {
 	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
 	private final String errorCode;
 	private final String description;
@@ -68,7 +68,7 @@
 	 *
 	 * @return the error code
 	 */
-	public String getErrorCode() {
+	public final String getErrorCode() {
 		return this.errorCode;
 	}
 
@@ -77,7 +77,7 @@
 	 *
 	 * @return the error description
 	 */
-	public String getDescription() {
+	public final String getDescription() {
 		return this.description;
 	}
 
@@ -86,7 +86,7 @@
 	 *
 	 * @return the error uri
 	 */
-	public String getUri() {
+	public final String getUri() {
 		return this.uri;
 	}
 
