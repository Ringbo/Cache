diff --git a/src/org/pentaho/di/trans/steps/mail/Mail.java b/src/org/pentaho/di/trans/steps/mail/Mail.java
index 1bdaef4..6cb29cd 100644
--- a/src/org/pentaho/di/trans/steps/mail/Mail.java
+++ b/src/org/pentaho/di/trans/steps/mail/Mail.java
@@ -385,7 +385,8 @@
 	      // create some properties and get the default Session
 
 	      String protocol = "smtp";
-	      if (meta.isUsingAuthentication()) {
+	      if (meta.isUsingSecureAuthentication()) { //PDI-2955
+	      //if (meta.isUsingAuthentication()) {
 	    	if (meta.getSecureConnectionType().equals("TLS")){
 	    		// Allow TLS authentication
 	    		data.props.put("mail.smtp.starttls.enable","true"); 
