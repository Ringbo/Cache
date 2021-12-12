diff --git a/server/src/main/java/com/metamx/druid/master/rules/LoadRule.java b/server/src/main/java/com/metamx/druid/master/rules/LoadRule.java
index ab093f4..fea94f8 100644
--- a/server/src/main/java/com/metamx/druid/master/rules/LoadRule.java
+++ b/server/src/main/java/com/metamx/druid/master/rules/LoadRule.java
@@ -84,7 +84,7 @@
         break;
       }
       if (holder.containsSegment(segment)) {
-        serverQueue.add(holder);
+        assignedServers.add(holder);
         continue;
       }
 
