diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/StreamTransferConsumer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/StreamTransferConsumer.java
index bd5644c..6484cfe 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/StreamTransferConsumer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/StreamTransferConsumer.java
@@ -316,7 +316,7 @@
         boolean lastUnd = false;
         for (int i = 0; i < name.length(); i++) {
             char c = name.charAt(i);
-            if (Character.isJavaIdentifierPart(c)) {
+            if (Character.isLetterOrDigit(c)) {
                 result.append(c);
                 lastUnd = false;
             } else if (!lastUnd) {
