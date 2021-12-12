diff --git a/src/main/java/com/zaxxer/hikari/HikariConfig.java b/src/main/java/com/zaxxer/hikari/HikariConfig.java
index 9ade527..3c77a58 100644
--- a/src/main/java/com/zaxxer/hikari/HikariConfig.java
+++ b/src/main/java/com/zaxxer/hikari/HikariConfig.java
@@ -546,7 +546,7 @@
    @Override
    public void setMinimumIdle(int minIdle)
    {
-      if (minIdle < 0 || minIdle > maxPoolSize) {
+      if (minIdle < 0) {
          throw new IllegalArgumentException("maxPoolSize cannot be negative or greater than maximumPoolSize");
       }
       this.minIdle = minIdle;
@@ -696,7 +696,7 @@
          connectionTimeout = CONNECTION_TIMEOUT;
       }
 
-      if (minIdle < 0) {
+      if (minIdle < 0 || minIdle > maxPoolSize) {
          minIdle = maxPoolSize;
       }
 
