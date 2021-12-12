diff --git a/jodd-madvoc/src/testInt/java/jodd/madvoc/OneTwoActionTestBase.java b/jodd-madvoc/src/testInt/java/jodd/madvoc/OneTwoActionTestBase.java
index 7f7f606..6ab0c68 100644
--- a/jodd-madvoc/src/testInt/java/jodd/madvoc/OneTwoActionTestBase.java
+++ b/jodd-madvoc/src/testInt/java/jodd/madvoc/OneTwoActionTestBase.java
@@ -39,7 +39,7 @@
 		assertEquals("", response.bodyText());
 		assertEquals(302, response.statusCode());
 
-		String redirectLocation = response.header("location");
+		String redirectLocation = response.location();
 
 		response = HttpRequest.get(redirectLocation).send();
 		assertEquals("value = [333]", response.bodyText());
@@ -51,7 +51,7 @@
 		assertEquals("", response.bodyText());
 		assertEquals(302, response.statusCode());
 
-		String redirectLocation = response.header("location");
+		String redirectLocation = response.location();
 
 		response = HttpRequest.get(redirectLocation).send();
 		assertEquals("value = [777]", response.bodyText());
@@ -63,7 +63,7 @@
 		assertEquals("", response.bodyText());
 		assertEquals(302, response.statusCode());
 
-		String redirectLocation = response.header("location");
+		String redirectLocation = response.location();
 
 		response = HttpRequest.get(redirectLocation).send();
 		assertEquals("value = [888]", response.bodyText());
