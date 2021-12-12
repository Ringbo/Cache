diff --git a/test/org/apache/catalina/connector/TestSendFile.java b/test/org/apache/catalina/connector/TestSendFile.java
index 2a2e9e6..b1ab8d6 100644
--- a/test/org/apache/catalina/connector/TestSendFile.java
+++ b/test/org/apache/catalina/connector/TestSendFile.java
@@ -80,7 +80,7 @@
                 Assert.assertEquals(HttpServletResponse.SC_OK, rc);
                 System.out.println("Client received " + bc.getLength() + " bytes in "
                         + (System.currentTimeMillis() - start) + " ms.");
-                Assert.assertEquals(EXPECTED_CONTENT_LENGTH * (i + 1), bc.getLength());
+                Assert.assertEquals(EXPECTED_CONTENT_LENGTH * (i + 1L), bc.getLength());
 
                 bc.recycle();
             }
