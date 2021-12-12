diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/Checker.java b/src/main/java/com/puppycrawl/tools/checkstyle/Checker.java
index 3d3b5f1..5e1bae9 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/Checker.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/Checker.java
@@ -294,7 +294,7 @@
     }
 
     /** Notify all listeners about the audit start */
-    protected void fireAuditStarted() {
+    void fireAuditStarted() {
         final AuditEvent evt = new AuditEvent(this);
         for (final AuditListener listener : listeners) {
             listener.auditStarted(evt);
@@ -302,7 +302,7 @@
     }
 
     /** Notify all listeners about the audit end */
-    protected void fireAuditFinished() {
+    void fireAuditFinished() {
         final AuditEvent evt = new AuditEvent(this);
         for (final AuditListener listener : listeners) {
             listener.auditFinished(evt);
