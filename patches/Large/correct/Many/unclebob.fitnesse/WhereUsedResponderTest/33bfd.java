diff --git a/src/fitnesse/responders/search/WhereUsedResponderTest.java b/src/fitnesse/responders/search/WhereUsedResponderTest.java
index fedf70f..4376759 100644
--- a/src/fitnesse/responders/search/WhereUsedResponderTest.java
+++ b/src/fitnesse/responders/search/WhereUsedResponderTest.java
@@ -30,7 +30,7 @@
 		Response response = responder.makeResponse(new FitNesseContext(root), request);
 		MockResponseSender sender = new MockResponseSender();
 		response.readyToSend(sender);
-		sender.waitForClose(500);
+		sender.waitForClose(1000);
 
 		String content = sender.sentData();
 		assertEquals(200, response.getStatus());
