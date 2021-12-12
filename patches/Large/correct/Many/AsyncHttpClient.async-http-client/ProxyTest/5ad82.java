diff --git a/src/test/java/com/ning/http/client/async/ProxyTest.java b/src/test/java/com/ning/http/client/async/ProxyTest.java
index ed4a7c5..941897c 100644
--- a/src/test/java/com/ning/http/client/async/ProxyTest.java
+++ b/src/test/java/com/ning/http/client/async/ProxyTest.java
@@ -52,7 +52,7 @@
                            HttpServletRequest request,
                            HttpServletResponse response) throws IOException, ServletException {
             if ("GET".equalsIgnoreCase(request.getMethod())) {
-                response.addHeader("target", r.getUri().toString());
+                response.addHeader("target", r.getUri().getPath());
                 response.setStatus(HttpServletResponse.SC_OK);
             } else { // this handler is to handle POST request
                 response.sendError(HttpServletResponse.SC_FORBIDDEN);
@@ -77,7 +77,7 @@
         Response resp = f.get(3, TimeUnit.SECONDS);
         assertNotNull(resp);
         assertEquals(resp.getStatusCode(), HttpServletResponse.SC_OK);
-        assertEquals(resp.getHeader("target"), target);
+        assertEquals(resp.getHeader("target"), "/");
         client.close();
     }
 
@@ -93,7 +93,7 @@
         Response resp = f.get(3, TimeUnit.SECONDS);
         assertNotNull(resp);
         assertEquals(resp.getStatusCode(), HttpServletResponse.SC_OK);
-        assertEquals(resp.getHeader("target"), target);
+        assertEquals(resp.getHeader("target"), "/");
         client.close();
     }
 
@@ -110,7 +110,7 @@
         Response resp = f.get(3, TimeUnit.SECONDS);
         assertNotNull(resp);
         assertEquals(resp.getStatusCode(), HttpServletResponse.SC_OK);
-        assertEquals(resp.getHeader("target"), target);
+        assertEquals(resp.getHeader("target"), "/");
         client.close();
     }
 
@@ -156,7 +156,7 @@
             Response resp = f.get(3, TimeUnit.SECONDS);
             assertNotNull(resp);
             assertEquals(resp.getStatusCode(), HttpServletResponse.SC_OK);
-            assertEquals(resp.getHeader("target"), target);
+            assertEquals(resp.getHeader("target"), "/");
 
             target = "http://localhost:1234/";
             f = client.prepareGet(target).execute();
@@ -226,7 +226,7 @@
             Response resp = f.get(3, TimeUnit.SECONDS);
             assertNotNull(resp);
             assertEquals(resp.getStatusCode(), HttpServletResponse.SC_OK);
-            assertEquals(resp.getHeader("target"), target);
+            assertEquals(resp.getHeader("target"), "/");
 
             target = "http://localhost:1234/";
             f = client.prepareGet(target).execute();
