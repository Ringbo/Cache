diff --git a/test/unit/voldemort/utils/RebalanceUtilsTest.java b/test/unit/voldemort/utils/RebalanceUtilsTest.java
index 2144e03..a1e347a 100644
--- a/test/unit/voldemort/utils/RebalanceUtilsTest.java
+++ b/test/unit/voldemort/utils/RebalanceUtilsTest.java
@@ -74,7 +74,15 @@
                          rebalanceNodeInfo.getRebalanceTaskList().size());
             RebalancePartitionsInfo expected = new RebalancePartitionsInfo(rebalanceNodeInfo.getStealerNode(),
                                                                            0,
-                                                                           Arrays.asList(2, 3),
+                                                                           Arrays.asList(0,
+                                                                                         1,
+                                                                                         2,
+                                                                                         3,
+                                                                                         4,
+                                                                                         5,
+                                                                                         6,
+                                                                                         7,
+                                                                                         8),
                                                                            Arrays.asList(2, 3),
                                                                            Arrays.asList(2, 3),
                                                                            RebalanceUtils.getStoreNames(storeDefList),
