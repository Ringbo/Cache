diff --git a/java/org/apache/coyote/AbstractProcessor.java b/java/org/apache/coyote/AbstractProcessor.java
index 57d44e8..aed2179 100644
--- a/java/org/apache/coyote/AbstractProcessor.java
+++ b/java/org/apache/coyote/AbstractProcessor.java
@@ -80,7 +80,10 @@
     protected void setErrorState(ErrorState errorState, Throwable t) {
         boolean blockIo = this.errorState.isIoAllowed() && !errorState.isIoAllowed();
         this.errorState = this.errorState.getMostSevere(errorState);
-        if (response.getStatus() < 400) {
+        // Don't change the status code for IOException since that is almost
+        // certainly a client disconnect in which case it is preferable to keep
+        // the original status code http://markmail.org/message/4cxpwmxhtgnrwh7n
+        if (response.getStatus() < 400 && !(t instanceof IOException)) {
             response.setStatus(500);
         }
         if (t != null) {
