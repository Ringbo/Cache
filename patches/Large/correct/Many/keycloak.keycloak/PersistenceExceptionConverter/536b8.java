diff --git a/model/jpa/src/main/java/org/keycloak/connections/jpa/PersistenceExceptionConverter.java b/model/jpa/src/main/java/org/keycloak/connections/jpa/PersistenceExceptionConverter.java
index b79b9e5..def86cf 100644
--- a/model/jpa/src/main/java/org/keycloak/connections/jpa/PersistenceExceptionConverter.java
+++ b/model/jpa/src/main/java/org/keycloak/connections/jpa/PersistenceExceptionConverter.java
@@ -55,7 +55,7 @@
     public static ModelException convert(Throwable t) {
         if (t.getCause() != null && t.getCause() instanceof ConstraintViolationException) {
             throw new ModelDuplicateException(t);
-        } if (t instanceof EntityExistsException) {
+        } if (t instanceof EntityExistsException || t instanceof ConstraintViolationException) {
             throw new ModelDuplicateException(t);
         } else {
             throw new ModelException(t);
