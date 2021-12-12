diff --git a/api/src/main/java/org/openmrs/api/context/Context.java b/api/src/main/java/org/openmrs/api/context/Context.java
index f6c6147..086a6cd 100644
--- a/api/src/main/java/org/openmrs/api/context/Context.java
+++ b/api/src/main/java/org/openmrs/api/context/Context.java
@@ -807,7 +807,7 @@
 	 * @see InputRequiredException#getRequiredInput() InputRequiredException#getRequiredInput() for
 	 *      the required question/datatypes
 	 */
-	public static void startup(Properties props) throws DatabaseUpdateException, InputRequiredException,
+	public synchronized static void startup(Properties props) throws DatabaseUpdateException, InputRequiredException,
 	        ModuleMustStartException {
 		// do any context database specific startup
 		getContextDAO().startup(props);
@@ -851,7 +851,7 @@
 	 * @see InputRequiredException#getRequiredInput() InputRequiredException#getRequiredInput() for
 	 *      the required question/datatypes
 	 */
-	public static void startup(String url, String username, String password, Properties properties)
+	public synchronized static void startup(String url, String username, String password, Properties properties)
 	        throws DatabaseUpdateException, InputRequiredException, ModuleMustStartException {
 		if (properties == null) {
 			properties = new Properties();
