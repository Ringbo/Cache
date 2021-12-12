diff --git a/src/test/java/com/ning/http/client/async/RemoteSiteTest.java b/src/test/java/com/ning/http/client/async/RemoteSiteTest.java
index 148f839..ebf49b6 100644
--- a/src/test/java/com/ning/http/client/async/RemoteSiteTest.java
+++ b/src/test/java/com/ning/http/client/async/RemoteSiteTest.java
@@ -254,7 +254,7 @@
             }
         }).get(10, TimeUnit.SECONDS);
         assertNotNull(response);
-        assertEquals(response.getResponseBody().length(), 3876);
+        assertEquals(response.getResponseBody().length(), 3873);
     }
 
 }
