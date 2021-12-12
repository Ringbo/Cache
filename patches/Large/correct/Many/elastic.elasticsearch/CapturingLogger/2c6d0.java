diff --git a/elasticsearch/x-pack/security/src/test/java/org/elasticsearch/xpack/security/audit/logfile/CapturingLogger.java b/elasticsearch/x-pack/security/src/test/java/org/elasticsearch/xpack/security/audit/logfile/CapturingLogger.java
index 8cdf520..112f405 100644
--- a/elasticsearch/x-pack/security/src/test/java/org/elasticsearch/xpack/security/audit/logfile/CapturingLogger.java
+++ b/elasticsearch/x-pack/security/src/test/java/org/elasticsearch/xpack/security/audit/logfile/CapturingLogger.java
@@ -57,7 +57,7 @@
         public final List<String> trace = new ArrayList<>();
 
         private MockAppender(final String name) throws IllegalAccessException {
-            super(name, RegexFilter.createFilter(".*(\n.*)*", new String[0], true, null, null), null);
+            super(name, RegexFilter.createFilter(".*(\n.*)*", new String[0], false, null, null), null);
         }
 
         @Override
