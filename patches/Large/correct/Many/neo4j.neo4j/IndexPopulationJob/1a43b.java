diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/api/index/IndexPopulationJob.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/api/index/IndexPopulationJob.java
index f380e54..162057f 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/api/index/IndexPopulationJob.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/api/index/IndexPopulationJob.java
@@ -254,7 +254,7 @@
     @Override
     public String toString()
     {
-        return getClass().getSimpleName() + "[populator:" + populator + ", descriptor:" + descriptor + "]";
+        return getClass().getSimpleName() + "[populator:" + populator + ", descriptor:" + indexUserDescription + "]";
     }
 
     public void awaitCompletion() throws InterruptedException
