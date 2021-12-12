diff --git a/modules/reindex/src/test/java/org/elasticsearch/index/reindex/AsyncBulkByScrollActionTests.java b/modules/reindex/src/test/java/org/elasticsearch/index/reindex/AsyncBulkByScrollActionTests.java
index ae05f32..6a09332 100644
--- a/modules/reindex/src/test/java/org/elasticsearch/index/reindex/AsyncBulkByScrollActionTests.java
+++ b/modules/reindex/src/test/java/org/elasticsearch/index/reindex/AsyncBulkByScrollActionTests.java
@@ -202,7 +202,7 @@
                 default:
                     throw new RuntimeException("Bad scenario");
                 }
-                responses[i] = new BulkItemResponse(i, opType, new IndexResponse(shardId, "type", "id" + i, randomInt(), createdResponse));
+                responses[i] = new BulkItemResponse(i, opType, new IndexResponse(shardId, "type", "id" + i, randomInt(20), randomInt(), createdResponse));
             }
             new DummyAbstractAsyncBulkByScrollAction().onBulkResponse(new BulkResponse(responses, 0));
             assertEquals(versionConflicts, task.getStatus().getVersionConflicts());
@@ -480,7 +480,7 @@
                     if (item instanceof IndexRequest) {
                         IndexRequest index = (IndexRequest) item;
                         opType = index.opType().lowercase();
-                        response = new IndexResponse(shardId, index.type(), index.id(), randomIntBetween(0, Integer.MAX_VALUE),
+                        response = new IndexResponse(shardId, index.type(), index.id(), randomInt(20), randomIntBetween(0, Integer.MAX_VALUE),
                                 true);
                     } else if (item instanceof UpdateRequest) {
                         UpdateRequest update = (UpdateRequest) item;
@@ -490,7 +490,7 @@
                     } else if (item instanceof DeleteRequest) {
                         DeleteRequest delete = (DeleteRequest) item;
                         opType = "delete";
-                        response = new DeleteResponse(shardId, delete.type(), delete.id(), randomIntBetween(0, Integer.MAX_VALUE),
+                        response = new DeleteResponse(shardId, delete.type(), delete.id(), randomInt(20), randomIntBetween(0, Integer.MAX_VALUE),
                                 true);
                     } else {
                         throw new RuntimeException("Unknown request:  " + item);
