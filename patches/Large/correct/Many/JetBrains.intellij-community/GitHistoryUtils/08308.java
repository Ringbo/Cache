diff --git a/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java b/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java
index dbda3e7..3003e39 100644
--- a/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java
+++ b/plugins/git4idea/src/git4idea/history/GitHistoryUtils.java
@@ -763,7 +763,7 @@
                                            AUTHOR_EMAIL, COMMITTER_NAME, COMMITTER_EMAIL, PARENTS, SUBJECT, BODY, RAW_BODY);
     h.setStdoutSuppressed(true);
     h.addParameters(parameters);
-    h.addParameters("--name-status", parser.getPretty(), "--encoding=UTF-8");
+    h.addParameters("-M", "--name-status", parser.getPretty(), "--encoding=UTF-8");
     h.addParameters("--full-history", "--sparse");
     h.endOptions();
 
