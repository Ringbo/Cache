diff --git a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java
index 7ab2500..837d065 100644
--- a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java
+++ b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java
@@ -86,7 +86,7 @@
         if (s == null) {
             return null;
         }
-        return IOConverter.toInputStream(s);
+        return IOConverter.toInputStream(s, null);
     }
 
     /**
@@ -99,7 +99,7 @@
         if (s == null) {
             return null;
         }
-        return IOConverter.toInputStream(s);
+        return IOConverter.toInputStream(s, null);
     }
 
 }
