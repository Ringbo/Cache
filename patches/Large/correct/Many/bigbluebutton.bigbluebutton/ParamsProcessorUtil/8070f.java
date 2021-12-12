diff --git a/bigbluebutton-web/src/java/org/bigbluebutton/api/ParamsProcessorUtil.java b/bigbluebutton-web/src/java/org/bigbluebutton/api/ParamsProcessorUtil.java
index fbb87dd..a6fe79f 100755
--- a/bigbluebutton-web/src/java/org/bigbluebutton/api/ParamsProcessorUtil.java
+++ b/bigbluebutton-web/src/java/org/bigbluebutton/api/ParamsProcessorUtil.java
@@ -44,7 +44,7 @@
 	          welcomeMessage = welcomeMessage.replaceAll(DIAL_NUM, dialNumber);
 	    	} else if (keyword.equals(CONF_NUM)) { 
 	          welcomeMessage = welcomeMessage.replaceAll(CONF_NUM, telVoice);
-	    	} else if (keyword.equals(CONF_NUM)) {
+	    	} else if (keyword.equals(CONF_NAME)) {
 	          welcomeMessage = welcomeMessage.replaceAll(CONF_NAME, meetingName);
 	    	}     
 	    }	    
