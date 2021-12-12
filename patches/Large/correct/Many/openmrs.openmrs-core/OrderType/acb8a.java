diff --git a/api/src/main/java/org/openmrs/OrderType.java b/api/src/main/java/org/openmrs/OrderType.java
index e304dc0..a63e5d0 100644
--- a/api/src/main/java/org/openmrs/OrderType.java
+++ b/api/src/main/java/org/openmrs/OrderType.java
@@ -151,7 +151,7 @@
 	 * @return The Java class as {@link java.lang.Class}
 	 * @throws APIException
 	 */
-	public Class getJavaClass() throws APIException {
+	public Class getJavaClass() {
 		try {
 			return Context.loadClass(javaClassName);
 		}
