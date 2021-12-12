diff --git a/src/org/zaproxy/zap/view/ScanPanel.java b/src/org/zaproxy/zap/view/ScanPanel.java
index 85a89eb..69e8a8c 100644
--- a/src/org/zaproxy/zap/view/ScanPanel.java
+++ b/src/org/zaproxy/zap/view/ScanPanel.java
@@ -757,7 +757,7 @@
         	scanFinshedEventHandler(host);
 	    } else {
 	        try {
-	            EventQueue.invokeAndWait(new Runnable() {
+	            EventQueue.invokeLater(new Runnable() {
 	                @Override
 	                public void run() {
 	                	scanFinshedEventHandler(host);
