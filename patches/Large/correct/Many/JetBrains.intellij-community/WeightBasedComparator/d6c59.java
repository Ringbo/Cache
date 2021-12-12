diff --git a/platform-api/src/com/intellij/ui/treeStructure/WeightBasedComparator.java b/platform-api/src/com/intellij/ui/treeStructure/WeightBasedComparator.java
index ce3a802..a8e3073 100644
--- a/platform-api/src/com/intellij/ui/treeStructure/WeightBasedComparator.java
+++ b/platform-api/src/com/intellij/ui/treeStructure/WeightBasedComparator.java
@@ -44,6 +44,6 @@
       if (s2 == null) return +1;
       return s1.compareToIgnoreCase(s2);
     }
-    return second.getWeight() - first.getWeight();
+    return first.getWeight() - second.getWeight();
   }
 }
