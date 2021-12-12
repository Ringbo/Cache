diff --git a/portal-impl/src/com/liferay/portal/plugin/RepositoryReport.java b/portal-impl/src/com/liferay/portal/plugin/RepositoryReport.java
index 2dbdf1f..8496eb4 100644
--- a/portal-impl/src/com/liferay/portal/plugin/RepositoryReport.java
+++ b/portal-impl/src/com/liferay/portal/plugin/RepositoryReport.java
@@ -32,14 +32,14 @@
 	public static final String SUCCESS = "success";
 
 	public void addError(String repositoryURL, PluginPackageException ppe) {
-		StringBundler sb = new StringBundler(3);
+		StringBundler sb = new StringBundler(2);
 
 		if (Validator.isNotNull(ppe.getMessage())) {
 			sb.append(ppe.getMessage());
 		}
 
 		if ((ppe.getCause() != null) &&
-			Validator.isNull(ppe.getCause().getMessage())) {
+			Validator.isNotNull(ppe.getCause().getMessage())) {
 
 			sb.append(ppe.getCause().getMessage());
 		}
