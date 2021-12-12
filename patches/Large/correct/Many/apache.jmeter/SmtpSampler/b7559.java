diff --git a/src/protocol/mail/org/apache/jmeter/protocol/smtp/sampler/SmtpSampler.java b/src/protocol/mail/org/apache/jmeter/protocol/smtp/sampler/SmtpSampler.java
index 6559e09..c242944 100644
--- a/src/protocol/mail/org/apache/jmeter/protocol/smtp/sampler/SmtpSampler.java
+++ b/src/protocol/mail/org/apache/jmeter/protocol/smtp/sampler/SmtpSampler.java
@@ -204,7 +204,7 @@
                 message.writeTo(cs);
                 res.setBytes(cs.getCount());
             } else {
-                res.setBytes(-1);
+                res.setBytes(-1L);
             }
 
         } catch (Exception ex) {
