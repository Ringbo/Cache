diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/util/SystemClock.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/util/SystemClock.java
index c60368f..72e42d1 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/util/SystemClock.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/util/SystemClock.java
@@ -38,7 +38,8 @@
     return INSTANCE;
   }
 
-  private SystemClock() {
+  @Deprecated
+  public SystemClock() {
     // do nothing
   }
 
