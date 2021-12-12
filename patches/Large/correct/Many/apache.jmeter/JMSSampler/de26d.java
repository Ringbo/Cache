diff --git a/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java b/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java
index 5b32c36..aba9106 100644
--- a/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java
+++ b/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/JMSSampler.java
@@ -139,9 +139,9 @@
 					}
 				} else {
 					if (replyMsg instanceof TextMessage) {
-						res.setResponseData(((TextMessage) replyMsg).getText().getContentLength());
+						res.setResponseData(((TextMessage) replyMsg).getText().getBytes());
 					} else {
-						res.setResponseData(replyMsg.toString().getContentLength());
+						res.setResponseData(replyMsg.toString().getBytes());
 					}
 					res.setSuccessful(true);
 				}
