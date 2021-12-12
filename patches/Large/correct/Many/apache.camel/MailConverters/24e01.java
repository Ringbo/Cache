diff --git a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java
index 661973f..8262c14 100644
--- a/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java
+++ b/components/camel-mail/src/main/java/org/apache/camel/component/mail/MailConverters.java
@@ -142,7 +142,7 @@
             }
         }
         if (simple.getToSentDate() != null) {
-            String s = simple.getFromSentDate();
+            String s = simple.getToSentDate();
             if (s.startsWith("now")) {
                 long offset = extractOffset(s, typeConverter);
                 builder = builder.and(new NowSearchTerm(SearchTermBuilder.Comparison.LE.asNum(), true, offset));
@@ -153,7 +153,7 @@
             }
         }
         if (simple.getFromReceivedDate() != null) {
-            String s = simple.getFromSentDate();
+            String s = simple.getFromReceivedDate();
             if (s.startsWith("now")) {
                 long offset = extractOffset(s, typeConverter);
                 builder = builder.and(new NowSearchTerm(SearchTermBuilder.Comparison.GE.asNum(), false, offset));
@@ -164,7 +164,7 @@
             }
         }
         if (simple.getToReceivedDate() != null) {
-            String s = simple.getFromSentDate();
+            String s = simple.getToReceivedDate();
             if (s.startsWith("now")) {
                 long offset = extractOffset(s, typeConverter);
                 builder = builder.and(new NowSearchTerm(SearchTermBuilder.Comparison.LE.asNum(), false, offset));
