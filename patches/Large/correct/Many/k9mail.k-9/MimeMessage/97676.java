diff --git a/src/com/fsck/k9/mail/internet/MimeMessage.java b/src/com/fsck/k9/mail/internet/MimeMessage.java
index 57bbdc9..92f7b5b 100644
--- a/src/com/fsck/k9/mail/internet/MimeMessage.java
+++ b/src/com/fsck/k9/mail/internet/MimeMessage.java
@@ -422,13 +422,13 @@
     }
 
     class MimeMessageBuilder implements ContentHandler {
-        private final Deque<Object> stack = new ArrayDeque<Object>();
+        private final LinkedList<Object> stack = new LinkedList<Object>();
 
         public MimeMessageBuilder() {
         }
 
         private void expect(Class<?> c) {
-            if (!c.isInstance(stack.peekFirst())) {
+            if (!c.isInstance(stack.peek())) {
                 throw new IllegalStateException("Internal stack error: " + "Expected '"
                                                 + c.getName() + "' found '" + stack.peek().getClass().getName() + "'");
             }
@@ -441,7 +441,7 @@
                 expect(Part.class);
                 try {
                     MimeMessage m = new MimeMessage();
-                    ((Part)stack.peekFirst()).setBody(m);
+                    ((Part)stack.peek()).setBody(m);
                     stack.addFirst(m);
                 } catch (MessagingException me) {
                     throw new Error(me);
@@ -462,7 +462,7 @@
             expect(Part.class);
             try {
                 Field parsedField = DefaultFieldParser.parse(field.getRaw(), null);
-                ((Part)stack.peekFirst()).addHeader(parsedField.getName(), parsedField.getBody().trim());
+                ((Part)stack.peek()).addHeader(parsedField.getName(), parsedField.getBody().trim());
             } catch (MessagingException me) {
                 throw new Error(me);
             } catch (MimeException me) {
@@ -474,7 +474,7 @@
             expect(Part.class);
             try {
                 String[] tokens = fieldData.split(":", 2);
-                ((Part)stack.peekFirst()).addHeader(tokens[0], tokens[1].trim());
+                ((Part)stack.peek()).addHeader(tokens[0], tokens[1].trim());
             } catch (MessagingException me) {
                 throw new Error(me);
             }
@@ -487,7 +487,7 @@
         public void startMultipart(BodyDescriptor bd) {
             expect(Part.class);
 
-            Part e = (Part)stack.peekFirst();
+            Part e = (Part)stack.peek();
             try {
                 MimeMultipart multiPart = new MimeMultipart(e.getContentType());
                 e.setBody(multiPart);
@@ -501,7 +501,7 @@
             expect(Part.class);
             Body body = MimeUtility.decodeBody(in, bd.getTransferEncoding());
             try {
-                ((Part)stack.peekFirst()).setBody(body);
+                ((Part)stack.peek()).setBody(body);
             } catch (MessagingException me) {
                 throw new Error(me);
             }
@@ -516,7 +516,7 @@
 
             try {
                 MimeBodyPart bodyPart = new MimeBodyPart();
-                ((MimeMultipart)stack.peekFirst()).addBodyPart(bodyPart);
+                ((MimeMultipart)stack.peek()).addBodyPart(bodyPart);
                 stack.addFirst(bodyPart);
             } catch (MessagingException me) {
                 throw new Error(me);
@@ -535,7 +535,7 @@
             while ((b = is.read()) != -1) {
                 sb.append((char)b);
             }
-            // ((Multipart) stack.peekFirst()).setEpilogue(sb.toString());
+            // ((Multipart) stack.peek()).setEpilogue(sb.toString());
         }
 
         public void preamble(InputStream is) throws IOException {
@@ -545,7 +545,7 @@
             while ((b = is.read()) != -1) {
                 sb.append((char)b);
             }
-            ((MimeMultipart)stack.peekFirst()).setPreamble(sb.toString());
+            ((MimeMultipart)stack.peek()).setPreamble(sb.toString());
 
         }
 
