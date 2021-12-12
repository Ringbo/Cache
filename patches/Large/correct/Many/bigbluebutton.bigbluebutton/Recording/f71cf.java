diff --git a/bigbluebutton-web/src/java/org/bigbluebutton/api/domain/Recording.java b/bigbluebutton-web/src/java/org/bigbluebutton/api/domain/Recording.java
index fd55e1e..5f2c82c 100755
--- a/bigbluebutton-web/src/java/org/bigbluebutton/api/domain/Recording.java
+++ b/bigbluebutton-web/src/java/org/bigbluebutton/api/domain/Recording.java
@@ -64,7 +64,7 @@
 	
 	public String getState() {
 	    String state = this.state;
-	    if ( state.equals("available") ) {
+	    if ( state == null || state.equals("") || state.equals("available") ) {
 	        state = isPublished()? STATE_PUBLISHED: STATE_UNPUBLISHED;
 	    }
 		return state;
