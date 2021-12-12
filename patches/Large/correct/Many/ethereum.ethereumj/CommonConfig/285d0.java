diff --git a/ethereumj-core/src/main/java/org/ethereum/config/CommonConfig.java b/ethereumj-core/src/main/java/org/ethereum/config/CommonConfig.java
index 08c4d11..dc116ce 100644
--- a/ethereumj-core/src/main/java/org/ethereum/config/CommonConfig.java
+++ b/ethereumj-core/src/main/java/org/ethereum/config/CommonConfig.java
@@ -55,7 +55,7 @@
 
     @Bean
     @Primary
-    Repository repository() {
+    RepositoryImpl repository() {
         return new RepositoryImpl(systemProperties(), keyValueDataSource(), keyValueDataSource(), this);
     }
 
