diff --git a/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java b/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java
index a36568f..b3760d0 100644
--- a/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java
+++ b/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java
@@ -336,7 +336,7 @@
 
       if (target != node.getStarNode())
       {
-        findAll(node.getOtherNode(), query, collector);
+        findAll(node.getStarNode(), query, collector);
       }
     }
   }
