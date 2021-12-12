diff --git a/k9mail/src/main/java/com/fsck/k9/mailstore/LocalMessage.java b/k9mail/src/main/java/com/fsck/k9/mailstore/LocalMessage.java
index ca28ce8..d4fe73d 100644
--- a/k9mail/src/main/java/com/fsck/k9/mailstore/LocalMessage.java
+++ b/k9mail/src/main/java/com/fsck/k9/mailstore/LocalMessage.java
@@ -130,7 +130,7 @@
             }
         } else {
             // We successfully found an HTML part; do the necessary character set decoding.
-            text = MessageExtractor.getTextFromPart(this);
+            text = MessageExtractor.getTextFromPart(part);
         }
         return text;
     }
