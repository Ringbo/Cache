diff --git a/src/test/java/org/elasticsearch/recovery/RelocationTests.java b/src/test/java/org/elasticsearch/recovery/RelocationTests.java
index 328e1e6..27ff491 100644
--- a/src/test/java/org/elasticsearch/recovery/RelocationTests.java
+++ b/src/test/java/org/elasticsearch/recovery/RelocationTests.java
@@ -516,7 +516,7 @@
                                 }
                             });
                         } catch (IOException e) {
-                            throw new ElasticsearchException("failed to walk tree", e);
+                            throw new AssertionError("failed to walk file tree starting at [" + shardLoc.toPath() + "]", e);
                         }
                     }
                 });
