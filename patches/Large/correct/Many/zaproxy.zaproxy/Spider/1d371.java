diff --git a/src/org/zaproxy/zap/spider/Spider.java b/src/org/zaproxy/zap/spider/Spider.java
index 5e6586c..81120cc 100644
--- a/src/org/zaproxy/zap/spider/Spider.java
+++ b/src/org/zaproxy/zap/spider/Spider.java
@@ -296,7 +296,7 @@
 		this.threadPool = Executors.newFixedThreadPool(spiderParam.getThreadCount());
 
 		// Initialize the HTTP sender
-		httpSender = new HttpSender(connectionParam, true);
+		httpSender = new HttpSender(connectionParam, true, HttpSender.SPIDER_INITIATOR);
 		// Do not follow redirections because the request is not updated, the redirections will be
 		// handled manually.
 		httpSender.setFollowRedirect(false);
