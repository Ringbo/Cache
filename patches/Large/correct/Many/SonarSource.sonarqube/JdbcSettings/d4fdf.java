diff --git a/sonar-application/src/main/java/org/sonar/application/JdbcSettings.java b/sonar-application/src/main/java/org/sonar/application/JdbcSettings.java
index ff88ae0..20e32ca 100644
--- a/sonar-application/src/main/java/org/sonar/application/JdbcSettings.java
+++ b/sonar-application/src/main/java/org/sonar/application/JdbcSettings.java
@@ -50,7 +50,7 @@
   }
 
   public void checkAndComplete(File homeDir, Props props) {
-    String url = props.value(DefaultSettings.JDBC_URL);
+    String url = props.nonNullValue(DefaultSettings.JDBC_URL);
     Provider provider = driverProvider(url);
     checkUrlParameters(provider, url);
     String driverPath = driverPath(homeDir, provider);
