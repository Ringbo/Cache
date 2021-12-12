diff --git a/src/main/java/org/scribe/builder/api/FacebookApi.java b/src/main/java/org/scribe/builder/api/FacebookApi.java
index 60be476..d85ff3b 100644
--- a/src/main/java/org/scribe/builder/api/FacebookApi.java
+++ b/src/main/java/org/scribe/builder/api/FacebookApi.java
@@ -24,7 +24,7 @@
     // Append scope if present
     if(config.hasScope())
     {
-     return String.format(SCOPED_AUTHORIZE_URL, formURLEncode(config.getCallback()), formURLEncode(config.getScope())); 
+     return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(), formURLEncode(config.getCallback()), formURLEncode(config.getScope())); 
     }
     else
     {
