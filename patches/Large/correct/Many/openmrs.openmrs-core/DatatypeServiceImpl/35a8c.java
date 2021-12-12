diff --git a/api/src/main/java/org/openmrs/api/impl/DatatypeServiceImpl.java b/api/src/main/java/org/openmrs/api/impl/DatatypeServiceImpl.java
index 5d7da18..c054267 100644
--- a/api/src/main/java/org/openmrs/api/impl/DatatypeServiceImpl.java
+++ b/api/src/main/java/org/openmrs/api/impl/DatatypeServiceImpl.java
@@ -60,7 +60,7 @@
 	 */
 	@Override
 	@Transactional(readOnly = true)
-	public Set<Class<? extends CustomDatatype<?>>> getAllDatatypeClasses() {
+	public synchronized Set<Class<? extends CustomDatatype<?>>> getAllDatatypeClasses() {
 		if (datatypeClasses == null) {
 			populateBeanListsFromContext();
 		}
@@ -72,7 +72,7 @@
 	 */
 	@Override
 	@Transactional(readOnly = true)
-	public Set<Class<? extends CustomDatatypeHandler<?, ?>>> getAllHandlerClasses() {
+	public synchronized Set<Class<? extends CustomDatatypeHandler<?, ?>>> getAllHandlerClasses() {
 		if (handlerClasses == null) {
 			populateBeanListsFromContext();
 		}
@@ -159,7 +159,7 @@
 	 */
 	@Override
 	@Transactional(readOnly = true)
-	public CustomDatatypeHandler<?, ?> getHandler(CustomDatatype<?> datatype, String handlerConfig) {
+	public synchronized CustomDatatypeHandler<?, ?> getHandler(CustomDatatype<?> datatype, String handlerConfig) {
 		if (prioritizedHandlerClasses == null) {
 			prioritizeHandlers();
 		}
