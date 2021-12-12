diff --git a/plugins/org.jkiss.dbeaver.ext.db2/src/org/jkiss/dbeaver/ext/db2/manager/DB2SequenceManager.java b/plugins/org.jkiss.dbeaver.ext.db2/src/org/jkiss/dbeaver/ext/db2/manager/DB2SequenceManager.java
index 2da96e8..e93c0bc 100644
--- a/plugins/org.jkiss.dbeaver.ext.db2/src/org/jkiss/dbeaver/ext/db2/manager/DB2SequenceManager.java
+++ b/plugins/org.jkiss.dbeaver.ext.db2/src/org/jkiss/dbeaver/ext/db2/manager/DB2SequenceManager.java
@@ -163,7 +163,7 @@
         } else {
             sb.append("NO CYCLE ").append(SPACE);
         }
-        if (sequence.getCache() != null) {
+        if (sequence.getCache() != null && sequence.getCache() > 0) {
             sb.append("CACHE ").append(sequence.getCache()).append(SPACE);
         } else {
             sb.append("NO CACHE ").append(SPACE);
