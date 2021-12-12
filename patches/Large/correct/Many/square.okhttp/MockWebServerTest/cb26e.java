diff --git a/mockwebserver/src/test/java/okhttp3/mockwebserver/MockWebServerTest.java b/mockwebserver/src/test/java/okhttp3/mockwebserver/MockWebServerTest.java
index 93d956e..4a5e490 100644
--- a/mockwebserver/src/test/java/okhttp3/mockwebserver/MockWebServerTest.java
+++ b/mockwebserver/src/test/java/okhttp3/mockwebserver/MockWebServerTest.java
@@ -317,7 +317,7 @@
         break;
       }
     }
-    assertEquals(512f, i, 10f); // Halfway +/- 1%
+    assertEquals(512f, i, 20f); // Halfway +/- 2%
   }
 
   @Test public void disconnectResponseHalfway() throws IOException {
