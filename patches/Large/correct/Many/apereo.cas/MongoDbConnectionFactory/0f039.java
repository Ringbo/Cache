diff --git a/support/cas-server-support-mongo-core/src/main/java/org/apereo/cas/mongo/MongoDbConnectionFactory.java b/support/cas-server-support-mongo-core/src/main/java/org/apereo/cas/mongo/MongoDbConnectionFactory.java
index d2f0123..ed4784a 100644
--- a/support/cas-server-support-mongo-core/src/main/java/org/apereo/cas/mongo/MongoDbConnectionFactory.java
+++ b/support/cas-server-support-mongo-core/src/main/java/org/apereo/cas/mongo/MongoDbConnectionFactory.java
@@ -175,7 +175,7 @@
 
     private Set<Class<?>> scanForEntities(final String basePackage) {
         if (!StringUtils.isBlank(basePackage)) {
-            return new HashSet<>();
+            return new HashSet<>(0);
         }
 
         final Set<Class<?>> initialEntitySet = new HashSet<>();
