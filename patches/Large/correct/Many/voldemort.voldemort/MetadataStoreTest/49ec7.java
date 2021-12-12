diff --git a/test/unit/voldemort/store/metadata/MetadataStoreTest.java b/test/unit/voldemort/store/metadata/MetadataStoreTest.java
index 4d6d1c2..10cecbc 100644
--- a/test/unit/voldemort/store/metadata/MetadataStoreTest.java
+++ b/test/unit/voldemort/store/metadata/MetadataStoreTest.java
@@ -77,7 +77,7 @@
                                                              (int) Math.random() * 5,
                                                              partition,
                                                              Arrays.asList("testStoreName"),
-                                                             (int) Math.random() * 3).toString(),
+                                                             (int) Math.random() * 3).toJsonString(),
                                       "UTF-8");
         }
 
