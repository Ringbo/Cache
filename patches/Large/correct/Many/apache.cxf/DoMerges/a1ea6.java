diff --git a/bin/DoMerges.java b/bin/DoMerges.java
index 0a8018c..b226a9b 100644
--- a/bin/DoMerges.java
+++ b/bin/DoMerges.java
@@ -233,7 +233,7 @@
         }
         if (!records.isEmpty()) {
             StringBuilder ver = new StringBuilder();
-            for (String s : blocks) {
+            for (String s : records) {
                 if (ver.length() > 0) {
                     ver.append(',');
                 }
