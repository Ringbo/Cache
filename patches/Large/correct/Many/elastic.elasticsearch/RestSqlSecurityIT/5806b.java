diff --git a/qa/sql/security/src/test/java/org/elasticsearch/xpack/qa/sql/security/RestSqlSecurityIT.java b/qa/sql/security/src/test/java/org/elasticsearch/xpack/qa/sql/security/RestSqlSecurityIT.java
index 80bada8..570671f 100644
--- a/qa/sql/security/src/test/java/org/elasticsearch/xpack/qa/sql/security/RestSqlSecurityIT.java
+++ b/qa/sql/security/src/test/java/org/elasticsearch/xpack/qa/sql/security/RestSqlSecurityIT.java
@@ -438,7 +438,7 @@
      */
     @SafeVarargs
     private final void assertAuditEvents(CheckedFunction<Map<?, ?>, Boolean, Exception>... eventCheckers) throws Exception {
-        assumeFalse("Previous test had an audit-related failure. All subsequent audit related assertions are bogus because we can't "
+        assertFalse("Previous test had an audit-related failure. All subsequent audit related assertions are bogus because we can't "
                 + "guarantee that we fully cleaned up after the last test.", auditFailure);
         try {
             assertBusy(() -> {
