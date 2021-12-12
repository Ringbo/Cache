diff --git a/app/src/test/java/com/hippo/network/CookieRepositoryTest.java b/app/src/test/java/com/hippo/network/CookieRepositoryTest.java
index b0c7964..ffa1972 100644
--- a/app/src/test/java/com/hippo/network/CookieRepositoryTest.java
+++ b/app/src/test/java/com/hippo/network/CookieRepositoryTest.java
@@ -258,9 +258,9 @@
     repository.saveFromResponse(urlEh1, Arrays.asList(cookieEh1, cookieEh2));
     repository.saveFromResponse(urlEh1, Collections.singletonList(cookieEh3));
     repository.saveFromResponse(urlNMB, Collections.singletonList(cookieNMB));
-    equals(Arrays.asList(cookieEh1, cookieEh3), repository.loadForRequest(urlEh2, null));
+    equals(Arrays.asList(cookieEh1, cookieEh3), repository.loadForRequest(null));
     Thread.sleep(3000);
-    equals(Collections.singletonList(cookieEh3), repository.loadForRequest(urlEh2, null));
+    equals(Collections.singletonList(cookieEh3), repository.loadForRequest(null));
     repository.close();
   }
 
@@ -325,7 +325,7 @@
 
     CookieRepository repository = new CookieRepository(app, "cookie.db");
     repository.saveFromResponse(url, Arrays.asList(cookie1, cookie2, cookie3, cookie4));
-    List<Cookie> list = repository.loadForRequest(url, null);
+    List<Cookie> list = repository.loadForRequest(null);
     List<Cookie> expected = Arrays.asList(cookie3, cookie4, cookie2, cookie1);
     assertEquals(expected.size(), list.size());
     for (int i = 0; i < list.size(); i++) {
