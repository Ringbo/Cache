diff --git a/api/src/test/java/com/ning/http/client/async/AsyncStreamHandlerTest.java b/api/src/test/java/com/ning/http/client/async/AsyncStreamHandlerTest.java
index 297d1c3..512153b 100644
--- a/api/src/test/java/com/ning/http/client/async/AsyncStreamHandlerTest.java
+++ b/api/src/test/java/com/ning/http/client/async/AsyncStreamHandlerTest.java
@@ -489,7 +489,7 @@
                 Assert.assertNotNull(values);
                 Assert.assertEquals(values.length, expected.length);
                 Arrays.sort(values);
-                Assert.assertEquals(expected, values);
+                Assert.assertEquals(values, expected);
                 return STATE.ABORT;
             }
 
