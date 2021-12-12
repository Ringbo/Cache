diff --git a/src/java/test/org/apache/zookeeper/ZooKeeperTest.java b/src/java/test/org/apache/zookeeper/ZooKeeperTest.java
index 0ce0eaa..b0ac07f 100644
--- a/src/java/test/org/apache/zookeeper/ZooKeeperTest.java
+++ b/src/java/test/org/apache/zookeeper/ZooKeeperTest.java
@@ -293,7 +293,7 @@
                     .processZKCmd(zkMain.cl));
             Assert.fail("Created the node with wrong option should "
                     + "throw Exception.");
-        } catch (IllegalArgumentException e) {
+        } catch (MalformedPathException e) {
             Assert.assertEquals("Path must start with / character", e
                     .getMessage());
         }
