diff --git a/server/sonar-server/src/test/java/org/sonar/server/platform/web/CacheControlFilterTest.java b/server/sonar-server/src/test/java/org/sonar/server/platform/web/CacheControlFilterTest.java
index 5f967c6..b5bf174 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/platform/web/CacheControlFilterTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/platform/web/CacheControlFilterTest.java
@@ -62,7 +62,7 @@
 
     underTest.doFilter(request, response, chain);
 
-    verify(response).addHeader("Cache-Control", format("max-age=%s", 18_000));
+    verify(response).addHeader("Cache-Control", format("max-age=%s", 300));
   }
 
   @Test
@@ -71,7 +71,7 @@
 
     underTest.doFilter(request, response, chain);
 
-    verify(response).addHeader("Cache-Control", format("max-age=%s", 18_000));
+    verify(response).addHeader("Cache-Control", format("max-age=%s", 300));
   }
 
   @Test
@@ -80,7 +80,7 @@
 
     underTest.doFilter(request, response, chain);
 
-    verify(response).addHeader("Cache-Control", format("max-age=%s", 18_000));
+    verify(response).addHeader("Cache-Control", format("max-age=%s", 300));
   }
 
   @Test
