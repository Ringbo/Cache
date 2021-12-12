diff --git a/sonar-core/src/main/java/org/sonar/core/persistence/BatchSession.java b/sonar-core/src/main/java/org/sonar/core/persistence/BatchSession.java
index da48c5f..0e7a28a 100644
--- a/sonar-core/src/main/java/org/sonar/core/persistence/BatchSession.java
+++ b/sonar-core/src/main/java/org/sonar/core/persistence/BatchSession.java
@@ -31,7 +31,7 @@
 
 public final class BatchSession implements SqlSession {
 
-  public static final int MAX_BATCH_SIZE = 250;
+  public static final int MAX_BATCH_SIZE = 1000;
 
   private final SqlSession session;
   private final int batchSize;
@@ -170,7 +170,7 @@
   }
 
   public <T> T getMapper(Class<T> type) {
-    return session.getMapper(type);
+    return getConfiguration().getMapper(type, this);
   }
 
   public Connection getConnection() {
