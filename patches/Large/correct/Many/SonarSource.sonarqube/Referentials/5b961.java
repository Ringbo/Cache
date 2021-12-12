diff --git a/sonar-server/src/main/java/org/sonar/server/db/migrations/v36/Referentials.java b/sonar-server/src/main/java/org/sonar/server/db/migrations/v36/Referentials.java
index b106deb..f3bf398 100644
--- a/sonar-server/src/main/java/org/sonar/server/db/migrations/v36/Referentials.java
+++ b/sonar-server/src/main/java/org/sonar/server/db/migrations/v36/Referentials.java
@@ -107,7 +107,7 @@
       stmt = connection.createStatement();
       stmt.setFetchSize(10000);
       rs = stmt.executeQuery("select id from rule_failures");
-      ConcurrentLinkedQueue<long[]> queue = new ConcurrentLinkedQueue<long[]>();
+      Queue<long[]> queue = new ConcurrentLinkedQueue<long[]>();
 
       totalViolations = 0;
       long[] block = new long[VIOLATION_GROUP_SIZE];
