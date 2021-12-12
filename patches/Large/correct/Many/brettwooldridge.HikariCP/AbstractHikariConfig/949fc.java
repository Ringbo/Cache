diff --git a/hikaricp-common/src/main/java/com/zaxxer/hikari/AbstractHikariConfig.java b/hikaricp-common/src/main/java/com/zaxxer/hikari/AbstractHikariConfig.java
index a7819ba..44fe4b5 100644
--- a/hikaricp-common/src/main/java/com/zaxxer/hikari/AbstractHikariConfig.java
+++ b/hikaricp-common/src/main/java/com/zaxxer/hikari/AbstractHikariConfig.java
@@ -759,7 +759,7 @@
 
    abstract protected void loadProperties(String propertyFileName);
 
-   void copyState(AbstractHikariConfig other)
+   public void copyState(AbstractHikariConfig other)
    {
       for (Field field : AbstractHikariConfig.class.getDeclaredFields()) {
          if (!Modifier.isFinal(field.getModifiers())) {
