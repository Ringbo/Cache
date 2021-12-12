diff --git a/solr/solrj/src/test/org/apache/solr/client/solrj/request/TestCoreAdmin.java b/solr/solrj/src/test/org/apache/solr/client/solrj/request/TestCoreAdmin.java
index 8275ff1..143d2c3 100644
--- a/solr/solrj/src/test/org/apache/solr/client/solrj/request/TestCoreAdmin.java
+++ b/solr/solrj/src/test/org/apache/solr/client/solrj/request/TestCoreAdmin.java
@@ -171,7 +171,7 @@
       final String exceptionMessage = e.getMessage();
       assertTrue(exceptionMessage.contains("Invalid core"));
       assertTrue(exceptionMessage.contains("invalid$core@name"));
-      assertTrue(exceptionMessage.contains("must consist entirely of periods, underscores and alphanumerics"));
+      assertTrue(exceptionMessage.contains("must consist entirely of periods, underscores, and alphanumerics"));
     }
   }
   
@@ -182,9 +182,9 @@
       fail();
     } catch (IllegalArgumentException e) {
       final String exceptionMessage = e.getMessage();
-      assertTrue(exceptionMessage.contains("Invalid core"));
+      assertTrue(e.getMessage(), exceptionMessage.contains("Invalid core"));
       assertTrue(exceptionMessage.contains("invalid$core@name"));
-      assertTrue(exceptionMessage.contains("must consist entirely of periods, underscores and alphanumerics"));
+      assertTrue(exceptionMessage.contains("must consist entirely of periods, underscores, and alphanumerics"));
     }
   }
   
