diff --git a/qa/rolling-upgrade/src/test/java/org/elasticsearch/upgrades/IndexAuditUpgradeIT.java b/qa/rolling-upgrade/src/test/java/org/elasticsearch/upgrades/IndexAuditUpgradeIT.java
index 45d69f8..ffdf0a3 100644
--- a/qa/rolling-upgrade/src/test/java/org/elasticsearch/upgrades/IndexAuditUpgradeIT.java
+++ b/qa/rolling-upgrade/src/test/java/org/elasticsearch/upgrades/IndexAuditUpgradeIT.java
@@ -21,7 +21,7 @@
         assumeTrue("only runs against old cluster", clusterType == CLUSTER_TYPE.OLD);
         assertBusy(() -> {
             assertAuditDocsExist();
-            assertNumUniqueNodeNameBuckets(0); // TODO update on backport. Will become 2
+            assertNumUniqueNodeNameBuckets(2);
         });
     }
 
@@ -29,8 +29,7 @@
         assumeTrue("only runs against mixed cluster", clusterType == CLUSTER_TYPE.MIXED);
         assertBusy(() -> {
             assertAuditDocsExist();
-            // TODO update on backport. Will become 2 as new node won't index docs until a new version node is master
-            assertNumUniqueNodeNameBuckets(0);
+            assertNumUniqueNodeNameBuckets(2);
         });
     }
 
@@ -38,8 +37,7 @@
         assumeTrue("only runs against upgraded cluster", clusterType == CLUSTER_TYPE.UPGRADED);
         assertBusy(() -> {
             assertAuditDocsExist();
-            // TODO update on backport. will become 4
-            assertNumUniqueNodeNameBuckets(2);
+            assertNumUniqueNodeNameBuckets(4);
         });
     }
 
