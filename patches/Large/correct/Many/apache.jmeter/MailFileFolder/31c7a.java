diff --git a/src/protocol/mail/org/apache/jmeter/protocol/mail/sampler/MailFileFolder.java b/src/protocol/mail/org/apache/jmeter/protocol/mail/sampler/MailFileFolder.java
index 6626630..429e049 100644
--- a/src/protocol/mail/org/apache/jmeter/protocol/mail/sampler/MailFileFolder.java
+++ b/src/protocol/mail/org/apache/jmeter/protocol/mail/sampler/MailFileFolder.java
@@ -123,7 +123,7 @@
                 IOUtils.closeQuietly(fis);
             }
         } catch (FileNotFoundException e) {
-            throw new MessagingException("Cannot open folder: "+e.getMessage());
+            throw new MessagingException("Cannot open folder: "+e.getMessage(), e);
         }
     }
 
