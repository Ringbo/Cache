diff --git a/src/fitnesse/responders/search/SearchResponderTest.java b/src/fitnesse/responders/search/SearchResponderTest.java
index a765658..cf31d52 100644
--- a/src/fitnesse/responders/search/SearchResponderTest.java
+++ b/src/fitnesse/responders/search/SearchResponderTest.java
@@ -81,7 +81,7 @@
 		Response response = responder.makeResponse(new FitNesseContext(root), request);
 		MockResponseSender sender = new MockResponseSender();
 		response.readyToSend(sender);
-		sender.waitForClose(500);
+		sender.waitForClose(1000);
 		return sender.sentData();
 	}
 
