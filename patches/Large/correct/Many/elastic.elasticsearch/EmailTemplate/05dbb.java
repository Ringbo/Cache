diff --git a/src/main/java/org/elasticsearch/watcher/actions/email/service/EmailTemplate.java b/src/main/java/org/elasticsearch/watcher/actions/email/service/EmailTemplate.java
index 3642557..756ef36 100644
--- a/src/main/java/org/elasticsearch/watcher/actions/email/service/EmailTemplate.java
+++ b/src/main/java/org/elasticsearch/watcher/actions/email/service/EmailTemplate.java
@@ -94,15 +94,15 @@
             builder.priority(Email.Priority.resolve(engine.render(priority, model)));
         }
         if (to != null) {
-            Email.AddressList addresses = templatesToAddressList(engine, replyTo, model);
+            Email.AddressList addresses = templatesToAddressList(engine, to, model);
             builder.to(addresses);
         }
         if (cc != null) {
-            Email.AddressList addresses = templatesToAddressList(engine, replyTo, model);
+            Email.AddressList addresses = templatesToAddressList(engine, cc, model);
             builder.cc(addresses);
         }
         if (bcc != null) {
-            Email.AddressList addresses = templatesToAddressList(engine, replyTo, model);
+            Email.AddressList addresses = templatesToAddressList(engine, bcc, model);
             builder.bcc(addresses);
         }
         if (subject != null) {
