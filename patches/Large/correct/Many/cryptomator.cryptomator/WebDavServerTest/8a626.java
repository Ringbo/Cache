diff --git a/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/WebDavServerTest.java b/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/WebDavServerTest.java
index 0255df9..70d2eef 100644
--- a/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/WebDavServerTest.java
+++ b/main/frontend-webdav/src/test/java/org/cryptomator/frontend/webdav/WebDavServerTest.java
@@ -376,7 +376,7 @@
 		final HttpMethod getMethod = new GetMethod(servletRoot + "/foo.txt");
 		getMethod.addRequestHeader("Range", "chunks=1-2");
 		final int statusCode = client.executeMethod(getMethod);
-		Assert.assertEquals(416, statusCode);
+		Assert.assertEquals(200, statusCode);
 		Assert.assertArrayEquals(testContent, getMethod.getResponseBody());
 		getMethod.releaseConnection();
 	}
