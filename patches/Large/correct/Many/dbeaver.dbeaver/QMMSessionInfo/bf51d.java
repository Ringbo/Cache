diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/meta/QMMSessionInfo.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/meta/QMMSessionInfo.java
index 430c886..d6f9cb7 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/meta/QMMSessionInfo.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/meta/QMMSessionInfo.java
@@ -75,7 +75,7 @@
 
     public void reopen()
     {
-        super.close();
+        super.reopen();
     }
 
     public QMMTransactionInfo changeTransactional(boolean transactional)
