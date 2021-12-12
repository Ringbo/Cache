diff --git a/core/src/test/java/io/undertow/server/handlers/DateHandlerTestCase.java b/core/src/test/java/io/undertow/server/handlers/DateHandlerTestCase.java
index 783c435..4cce724 100644
--- a/core/src/test/java/io/undertow/server/handlers/DateHandlerTestCase.java
+++ b/core/src/test/java/io/undertow/server/handlers/DateHandlerTestCase.java
@@ -35,7 +35,7 @@
             Header date = result.getHeaders("Date")[0];
             final long firstDate = DateUtils.parseDate(date.getValue()).getTime();
             Assert.assertTrue((firstDate + 3000) > System.currentTimeMillis());
-            Assert.assertTrue(System.currentTimeMillis() > firstDate);
+            Assert.assertTrue(System.currentTimeMillis() >= firstDate);
             HttpClientUtils.readResponse(result);
             Thread.sleep(1500);
             result = client.execute(get);
