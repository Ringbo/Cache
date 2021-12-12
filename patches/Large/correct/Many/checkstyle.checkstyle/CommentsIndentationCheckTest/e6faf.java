diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/CommentsIndentationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/CommentsIndentationCheckTest.java
index 22421ff..cb2c118 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/CommentsIndentationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/indentation/CommentsIndentationCheckTest.java
@@ -90,7 +90,7 @@
         }
         catch (IllegalArgumentException e) {
             final String msg = e.getMessage();
-            Assert.assertEquals(msg, "Unexpected token type: methodStub");
+            Assert.assertEquals("Unexpected token type: methodStub", msg);
         }
     }
 }
