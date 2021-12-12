diff --git a/lucene/test-framework/src/java/org/apache/lucene/index/BaseDocValuesFormatTestCase.java b/lucene/test-framework/src/java/org/apache/lucene/index/BaseDocValuesFormatTestCase.java
index ca0a0a2..5353ff2 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/index/BaseDocValuesFormatTestCase.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/index/BaseDocValuesFormatTestCase.java
@@ -2681,7 +2681,7 @@
                 }
               }
             } catch (Throwable e) {
-              throw new RuntimeException();
+              throw new RuntimeException(e);
             }
           }
         };
