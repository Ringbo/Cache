diff --git a/liquibase-core/src/main/java/liquibase/lockservice/LockServiceFactory.java b/liquibase-core/src/main/java/liquibase/lockservice/LockServiceFactory.java
index 4b19647..4cd0f92 100644
--- a/liquibase-core/src/main/java/liquibase/lockservice/LockServiceFactory.java
+++ b/liquibase-core/src/main/java/liquibase/lockservice/LockServiceFactory.java
@@ -38,7 +38,7 @@
     }
 
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = null;
     }
 
@@ -91,7 +91,7 @@
 
 	}
 
-	public void resetAll() {
+	public synchronized void resetAll() {
 		for (LockService lockService : registry) {
 			lockService.reset();
 		}
