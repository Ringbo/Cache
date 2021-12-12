diff --git a/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java b/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java
index 45bfefd..83df24d 100644
--- a/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/jsonwebservice/JSONWebServiceServiceActionTest.java
@@ -93,7 +93,7 @@
 			new MockHttpServletResponse();
 
 		json = _jsonWebServiceServiceAction.getJSON(
-			null, null, mockHttpServletRequest, mockHttpServletResponse);
+			null, mockHttpServletRequest, mockHttpServletResponse);
 
 		Assert.assertEquals("{}", json);
 	}
@@ -120,7 +120,7 @@
 			new MockHttpServletResponse();
 
 		json = _jsonWebServiceServiceAction.getJSON(
-			null, null, mockHttpServletRequest, mockHttpServletResponse);
+			null, mockHttpServletRequest, mockHttpServletResponse);
 
 		Assert.assertEquals("\"Welcome 173 to Jupiter\"", json);
 	}
@@ -224,7 +224,7 @@
 			new MockHttpServletResponse();
 
 		json = _jsonWebServiceServiceAction.getJSON(
-			null, null, mockHttpServletRequest, mockHttpServletResponse);
+			null, mockHttpServletRequest, mockHttpServletResponse);
 
 		Assert.assertEquals("\"Welcome 173 to Jupiter\"", json);
 	}
@@ -251,7 +251,7 @@
 			new MockHttpServletResponse();
 
 		String json = _jsonWebServiceServiceAction.getJSON(
-			null, null, mockHttpServletRequest, mockHttpServletResponse);
+			null, mockHttpServletRequest, mockHttpServletResponse);
 
 		Assert.assertEquals("\"Welcome 173 to Jupiter\"", json);
 	}
@@ -275,7 +275,7 @@
 			new MockHttpServletResponse();
 
 		String json = _jsonWebServiceServiceAction.getJSON(
-			null, null, mockHttpServletRequest, mockHttpServletResponse);
+			null, mockHttpServletRequest, mockHttpServletResponse);
 
 		Assert.assertEquals("\"Welcome 173 to Jupiter\"", json);
 	}
