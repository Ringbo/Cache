diff --git a/modules/reindex/src/main/java/org/elasticsearch/index/reindex/AbstractBulkByScrollRequest.java b/modules/reindex/src/main/java/org/elasticsearch/index/reindex/AbstractBulkByScrollRequest.java
index fba0cb2..d3463cd 100644
--- a/modules/reindex/src/main/java/org/elasticsearch/index/reindex/AbstractBulkByScrollRequest.java
+++ b/modules/reindex/src/main/java/org/elasticsearch/index/reindex/AbstractBulkByScrollRequest.java
@@ -424,7 +424,7 @@
             out.writeVInt(slices);
         } else {
             if (slices > 1) {
-                throw new UnsupportedOperationException("Attempting to send sliced reindex-style request to a node that doesn't support "
+                throw new IllegalArgumentException("Attempting to send sliced reindex-style request to a node that doesn't support "
                         + "it. Version is [" + out.getVersion() + "] but must be [" + BulkByScrollTask.V_5_1_0_UNRELEASED + "]");
             }
         }
