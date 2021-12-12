diff --git a/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java b/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java
index 5063d59..1705421 100644
--- a/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java
+++ b/plugins/discovery-ec2/src/test/java/org/elasticsearch/discovery/ec2/Ec2DiscoveryTests.java
@@ -191,7 +191,7 @@
             tagsList.add(tags);
         }
 
-        logger.info("started [{}] instances with [{}] stage=prod tag");
+        logger.info("started [{}] instances with [{}] stage=prod tag", nodes, prodInstances);
         List<DiscoveryNode> discoveryNodes = buildDynamicNodes(nodeSettings, nodes, tagsList);
         assertThat(discoveryNodes, hasSize(prodInstances));
     }
@@ -222,7 +222,7 @@
             tagsList.add(tags);
         }
 
-        logger.info("started [{}] instances with [{}] stage=prod tag");
+        logger.info("started [{}] instances with [{}] stage=prod tag", nodes, prodInstances);
         List<DiscoveryNode> discoveryNodes = buildDynamicNodes(nodeSettings, nodes, tagsList);
         assertThat(discoveryNodes, hasSize(prodInstances));
     }
