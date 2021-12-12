diff --git a/modules/apps/headless-apio/portal/portal-apio-api/src/main/java/com/liferay/portal/apio/permission/HasPermission.java b/modules/apps/headless-apio/portal/portal-apio-api/src/main/java/com/liferay/portal/apio/permission/HasPermission.java
index 7583e28..d115604 100644
--- a/modules/apps/headless-apio/portal/portal-apio-api/src/main/java/com/liferay/portal/apio/permission/HasPermission.java
+++ b/modules/apps/headless-apio/portal/portal-apio-api/src/main/java/com/liferay/portal/apio/permission/HasPermission.java
@@ -29,9 +29,13 @@
  *
  * @author Alejandro Hernández
  * @author Javier Gamarra
+ * @param  <T> the type of the model's identifier (e.g., {@code Long}, {@code
+ *          String}, etc.)
+ * @param  <S> the type of the parent model's identifier (e.g., {@code Long}, {@code
+ *         String}, etc.)
  * @review
  */
-public interface HasPermission {
+public interface HasPermission<T, S> {
 
 	/**
 	 * Returns {@code true} if the current {@code User} has permission to
@@ -70,7 +74,7 @@
 	 *         false} otherwise
 	 * @review
 	 */
-	public default Boolean forAdding(Credentials credentials, Long id) {
+	public default Boolean forAdding(Credentials credentials, S id) {
 		return false;
 	}
 
@@ -90,7 +94,7 @@
 	 *         false} otherwise
 	 * @review
 	 */
-	public default Boolean forDeleting(Credentials credentials, Long id) {
+	public default Boolean forDeleting(Credentials credentials, T id) {
 		return false;
 	}
 
@@ -110,7 +114,7 @@
 	 *         false} otherwise
 	 * @review
 	 */
-	public default Boolean forUpdating(Credentials credentials, Long id) {
+	public default Boolean forUpdating(Credentials credentials, T id) {
 		return false;
 	}
 
