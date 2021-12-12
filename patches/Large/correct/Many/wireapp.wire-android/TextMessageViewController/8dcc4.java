diff --git a/app/src/main/java/com/waz/zclient/pages/main/conversation/views/row/message/views/TextMessageViewController.java b/app/src/main/java/com/waz/zclient/pages/main/conversation/views/row/message/views/TextMessageViewController.java
index 043f213..c97365d 100644
--- a/app/src/main/java/com/waz/zclient/pages/main/conversation/views/row/message/views/TextMessageViewController.java
+++ b/app/src/main/java/com/waz/zclient/pages/main/conversation/views/row/message/views/TextMessageViewController.java
@@ -146,7 +146,7 @@
                                                                            color));
         if (message != null &&
             message.isEphemeral() &&
-            message.isEphemeral()) {
+            message.isExpired()) {
             textView.setTextColor(color);
         }
     }
