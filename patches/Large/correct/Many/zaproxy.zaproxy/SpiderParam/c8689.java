diff --git a/src/org/zaproxy/zap/spider/SpiderParam.java b/src/org/zaproxy/zap/spider/SpiderParam.java
index 7049fb3..224acda 100644
--- a/src/org/zaproxy/zap/spider/SpiderParam.java
+++ b/src/org/zaproxy/zap/spider/SpiderParam.java
@@ -166,7 +166,7 @@
 	 * Whether the forms are submitted, if their method is HTTP POST. This option should not be used if the
 	 * forms are not processed at all (processForm).
 	 */
-	private boolean postForm = false;
+	private boolean postForm = true;
 	/** The waiting time between new requests to server - safe from DDOS. */
 	private int requestWait = 200;
 	/** Which urls are skipped. */
@@ -253,10 +253,10 @@
 
 		this.showAdvancedDialog = getBoolean(SHOW_ADV_DIALOG, false);
 
-		this.processForm = getBoolean(SPIDER_PROCESS_FORM, false);
+		this.processForm = getBoolean(SPIDER_PROCESS_FORM, true);
 
 		try {
-			this.postForm = getConfig().getBoolean(SPIDER_POST_FORM, false);
+			this.postForm = getConfig().getBoolean(SPIDER_POST_FORM, true);
 		} catch (ConversionException e) {
 			// conversion issue from 1.4.1: convert the field from int to boolean
 			log.info("Warning while parsing config file: " + SPIDER_POST_FORM
