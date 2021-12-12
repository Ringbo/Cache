diff --git a/src/org/zaproxy/zap/view/ScanPanel2.java b/src/org/zaproxy/zap/view/ScanPanel2.java
index 4b9e2d3..d775a23 100644
--- a/src/org/zaproxy/zap/view/ScanPanel2.java
+++ b/src/org/zaproxy/zap/view/ScanPanel2.java
@@ -458,7 +458,7 @@
         	scanFinshedEventHandler(id, host);
 	    } else {
 	        try {
-	            EventQueue.invokeAndWait(new Runnable() {
+	            EventQueue.invokeLater(new Runnable() {
 	                @Override
 	                public void run() {
 	                	scanFinshedEventHandler(id, host);
