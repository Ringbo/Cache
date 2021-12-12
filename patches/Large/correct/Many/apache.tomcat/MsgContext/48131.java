diff --git a/java/org/apache/jk/core/MsgContext.java b/java/org/apache/jk/core/MsgContext.java
index 00c08aa..7c25cb3 100644
--- a/java/org/apache/jk/core/MsgContext.java
+++ b/java/org/apache/jk/core/MsgContext.java
@@ -303,7 +303,7 @@
             try {            
                 jkIS.endMessage();
             } catch(IOException iex) {
-                log.warn("Error sending end packet",iex);
+                log.debug("Error sending end packet",iex);
                 setStatus(JK_STATUS_ERROR);
             }
             if(getStatus() != JK_STATUS_ERROR) {
