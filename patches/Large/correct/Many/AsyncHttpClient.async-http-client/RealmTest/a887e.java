diff --git a/client/src/test/java/org/asynchttpclient/RealmTest.java b/client/src/test/java/org/asynchttpclient/RealmTest.java
index 168410a..c72b661 100644
--- a/client/src/test/java/org/asynchttpclient/RealmTest.java
+++ b/client/src/test/java/org/asynchttpclient/RealmTest.java
@@ -71,7 +71,7 @@
         String ha2 = getMd5(method + ":" + uri.getPath());
         String expectedResponse = getMd5(ha1 + ":" + nonce + ":" + ha2);
 
-        assertEquals(expectedResponse, orig.getResponse());
+        assertEquals(orig.getResponse(), expectedResponse);
     }
 
     @Test(groups = "standalone")
@@ -96,7 +96,7 @@
         String ha2 = getMd5(method + ":" + uri.getPath());
         String expectedResponse = getMd5(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);
 
-        assertEquals(expectedResponse, orig.getResponse());
+        assertEquals(orig.getResponse(), expectedResponse);
     }
 
     private String getMd5(String what) {
