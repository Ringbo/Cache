diff --git a/sonar-db/src/test/java/org/sonar/db/user/UserTokenTesting.java b/sonar-db/src/test/java/org/sonar/db/user/UserTokenTesting.java
index 84536ed..b1a0ba5 100644
--- a/sonar-db/src/test/java/org/sonar/db/user/UserTokenTesting.java
+++ b/sonar-db/src/test/java/org/sonar/db/user/UserTokenTesting.java
@@ -27,7 +27,7 @@
   public static UserTokenDto newUserToken() {
     return new UserTokenDto()
       .setLogin(randomAlphanumeric(255))
-      .setName(randomAlphanumeric(255))
+      .setName(randomAlphanumeric(100))
       .setTokenHash(randomAlphanumeric(40))
       .setCreatedAt(nextLong());
   }
