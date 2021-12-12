diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMessage.java b/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMessage.java
index e81347b..33a43c4 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMessage.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMessage.java
@@ -112,8 +112,7 @@
         try {
             parser.parse(new EOLConvertingInputStream(in));
         } catch (MimeException me) {
-            //TODO wouldn't a MessagingException be better?
-            throw new Error(me);
+            throw new MessagingException(me.getMessage(), me);
         }
     }
 
@@ -519,7 +518,7 @@
         }
 
         @Override
-        public void startMultipart(BodyDescriptor bd) {
+        public void startMultipart(BodyDescriptor bd) throws MimeException {
             expect(Part.class);
 
             Part e = (Part)stack.peek();
@@ -531,18 +530,18 @@
                 e.setBody(multiPart);
                 stack.addFirst(multiPart);
             } catch (MessagingException me) {
-                throw new Error(me);
+                throw new MimeException(me.getMessage(), me);
             }
         }
 
         @Override
-        public void body(BodyDescriptor bd, InputStream in) throws IOException {
+        public void body(BodyDescriptor bd, InputStream in) throws IOException, MimeException {
             expect(Part.class);
             try {
                 Body body = MimeUtility.createBody(in, bd.getTransferEncoding(), bd.getMimeType());
                 ((Part)stack.peek()).setBody(body);
             } catch (MessagingException me) {
-                throw new Error(me);
+                throw new MimeException(me.getMessage(), me);
             }
         }
 
@@ -566,7 +565,7 @@
         }
 
         @Override
-        public void startBodyPart() {
+        public void startBodyPart() throws MimeException {
             expect(MimeMultipart.class);
 
             try {
@@ -574,7 +573,7 @@
                 ((MimeMultipart)stack.peek()).addBodyPart(bodyPart);
                 stack.addFirst(bodyPart);
             } catch (MessagingException me) {
-                throw new Error(me);
+                throw new MimeException(me);
             }
         }
 
@@ -613,7 +612,7 @@
                 String raw = parsedField.getRaw().toString();
                 ((Part) stack.peek()).addRawHeader(name, raw);
             } catch (MessagingException me) {
-                throw new Error(me);
+                throw new MimeException(me);
             }
         }
     }
