diff --git a/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java b/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java
index e991b0c..fa74497 100644
--- a/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java
+++ b/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java
@@ -489,7 +489,7 @@
       QueryUtils.check(random(), cq, newSearcher(reader2));
       reader2.close();
     } finally {
-      IOUtils.close(wrapper, w, dir, analyzer);
+      IOUtils.close(reader, w, dir, analyzer);
     }
     
   }
