diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/QMUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/QMUtils.java
index 3503052..db56b79 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/QMUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/qm/QMUtils.java
@@ -82,7 +82,7 @@
             return false;
         } else {
             QMMSessionInfo sessionInfo = getCurrentSession(executionContext);
-            if (sessionInfo != null) {
+            if (sessionInfo != null && sessionInfo.isTransactional()) {
                 QMMTransactionInfo txnInfo = sessionInfo.getTransaction();
                 if (txnInfo != null) {
                     QMMTransactionSavepointInfo sp = txnInfo.getCurrentSavepoint();
