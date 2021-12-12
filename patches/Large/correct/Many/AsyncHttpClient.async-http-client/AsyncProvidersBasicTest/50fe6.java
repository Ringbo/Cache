diff --git a/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java b/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java
index 7826200..617b47e 100755
--- a/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java
+++ b/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java
@@ -1503,7 +1503,7 @@
             Assert.fail();
         } catch (Throwable ex) {
             System.out.println("EXPIRED: " + (System.currentTimeMillis() - t1));
-            Assert.assertNull(ex.getCause());
+            Assert.assertNotNull(ex.getCause());
             Assert.assertEquals(ex.getCause().getMessage(), "No response received after 10000");
         }
         c.close();
