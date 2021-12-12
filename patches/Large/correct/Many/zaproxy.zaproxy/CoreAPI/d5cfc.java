diff --git a/src/org/zaproxy/zap/extension/api/CoreAPI.java b/src/org/zaproxy/zap/extension/api/CoreAPI.java
index dd97606..77df047 100644
--- a/src/org/zaproxy/zap/extension/api/CoreAPI.java
+++ b/src/org/zaproxy/zap/extension/api/CoreAPI.java
@@ -467,7 +467,7 @@
 
 					sender.sendAndReceive(tempReq);
 					persistMessage(tempReq);
-					processor.process(request);
+					processor.process(tempReq);
 				}
 			}
 		} finally {
