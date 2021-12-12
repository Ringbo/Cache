diff --git a/jodd-madvoc/src/testInt/java/jodd/madvoc/MoveTestBase.java b/jodd-madvoc/src/testInt/java/jodd/madvoc/MoveTestBase.java
index fbe8a4b..b7c9e52 100644
--- a/jodd-madvoc/src/testInt/java/jodd/madvoc/MoveTestBase.java
+++ b/jodd-madvoc/src/testInt/java/jodd/madvoc/MoveTestBase.java
@@ -59,7 +59,7 @@
 
 		assertEquals(302, response.statusCode());
 
-		String location = response.header("location");
+		String location = response.location();
 
 		response = HttpRequest.get(location).send();
 
