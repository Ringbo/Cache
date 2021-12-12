diff --git a/core-common/src/main/java/org/apache/kylin/common/debug/BackdoorToggles.java b/core-common/src/main/java/org/apache/kylin/common/debug/BackdoorToggles.java
index efc5030..405d361 100644
--- a/core-common/src/main/java/org/apache/kylin/common/debug/BackdoorToggles.java
+++ b/core-common/src/main/java/org/apache/kylin/common/debug/BackdoorToggles.java
@@ -114,7 +114,7 @@
         if (v == null)
             return -1;
         else
-            return Integer.valueOf(v);
+            return Integer.parseInt(v);
     }
 
     public static Pair<Short, Short> getShardAssignment() {
