diff --git a/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java b/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java
index fa61193..26204de 100644
--- a/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java
@@ -71,7 +71,7 @@
 		ServletContext servletContext = new MockServletContext();
 
 		_jsonWebServiceServiceAction = new JSONWebServiceServiceAction(
-			servletContext, null);
+			servletContext);
 	}
 
 	@AfterClass
