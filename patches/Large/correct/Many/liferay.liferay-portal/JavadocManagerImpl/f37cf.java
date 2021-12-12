diff --git a/portal-impl/src/com/liferay/portal/javadoc/JavadocManagerImpl.java b/portal-impl/src/com/liferay/portal/javadoc/JavadocManagerImpl.java
index 130e782..db82179 100644
--- a/portal-impl/src/com/liferay/portal/javadoc/JavadocManagerImpl.java
+++ b/portal-impl/src/com/liferay/portal/javadoc/JavadocManagerImpl.java
@@ -116,14 +116,14 @@
 
 	public void unload(String servletContextName) {
 		if (_log.isInfoEnabled()) {
-			_log.info("Unoading Javadocs for " + servletContextName);
+			_log.info("Unoading Javadocs for '" + servletContextName + '\'');
 		}
 
 		unload(servletContextName, _javadocClasses.values());
 		unload(servletContextName, _javadocMethods.values());
 
 		if (_log.isInfoEnabled()) {
-			_log.info("Unloaded Javadocs for " + servletContextName);
+			_log.info("Unloaded Javadocs for '" + servletContextName + '\'');
 		}
 	}
 
@@ -266,7 +266,7 @@
 
 		Element returnElement = methodElement.element("return");
 
-		if (javadocMethod != null) {
+		if (returnElement != null) {
 			String returnComment = returnElement.elementText("comment");
 
 			javadocMethod.setReturnComment(returnComment);
