diff --git a/jodd-madvoc/src/testInt/java/jodd/madvoc/RestActionTestBase.java b/jodd-madvoc/src/testInt/java/jodd/madvoc/RestActionTestBase.java
index ed0776d..8d4b7ed 100644
--- a/jodd-madvoc/src/testInt/java/jodd/madvoc/RestActionTestBase.java
+++ b/jodd-madvoc/src/testInt/java/jodd/madvoc/RestActionTestBase.java
@@ -44,7 +44,7 @@
 		HttpResponse response = HttpRequest.get("localhost:8173/re/view2/g-321.html").send();
 		assertEquals(302, response.statusCode());
 
-		response = HttpRequest.get(response.header("location")).send();
+		response = HttpRequest.get(response.location()).send();
 		assertEquals("321", response.bodyText().trim());
 	}
 
