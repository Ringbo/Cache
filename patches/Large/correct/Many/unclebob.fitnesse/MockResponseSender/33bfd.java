diff --git a/src/fitnesse/http/MockResponseSender.java b/src/fitnesse/http/MockResponseSender.java
index 49a2c8e..1ce8719 100644
--- a/src/fitnesse/http/MockResponseSender.java
+++ b/src/fitnesse/http/MockResponseSender.java
@@ -46,7 +46,7 @@
 	public void doSending(Response response) throws Exception
 	{
 		response.readyToSend(this);
-		waitForClose(50000);
+		waitForClose(5000);
 	}
 
 	// Utility method that returns when this.closed is true. Throws an exception
