diff --git a/beeline/src/java/org/apache/hive/beeline/Commands.java b/beeline/src/java/org/apache/hive/beeline/Commands.java
index 3a204c0..387861b 100644
--- a/beeline/src/java/org/apache/hive/beeline/Commands.java
+++ b/beeline/src/java/org/apache/hive/beeline/Commands.java
@@ -1316,7 +1316,7 @@
     Properties props = new Properties();
     if (url != null) {
       String saveUrl = getUrlToUse(url);
-      props.setProperty(JdbcConnectionParams.PROPERTY_URL, url);
+      props.setProperty(JdbcConnectionParams.PROPERTY_URL, saveUrl);
     }
 
     String value = null;
