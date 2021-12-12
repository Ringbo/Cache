diff --git a/config/src/main/java/org/springframework/security/config/http/LogoutBeanDefinitionParser.java b/config/src/main/java/org/springframework/security/config/http/LogoutBeanDefinitionParser.java
index e4d5de5..6f3d6af 100644
--- a/config/src/main/java/org/springframework/security/config/http/LogoutBeanDefinitionParser.java
+++ b/config/src/main/java/org/springframework/security/config/http/LogoutBeanDefinitionParser.java
@@ -63,7 +63,7 @@
 
         if (StringUtils.hasText(successHandlerRef)) {
             if (StringUtils.hasText(logoutSuccessUrl)) {
-                pc.getReaderContext().error("Use " + ATT_LOGOUT_URL + " or " + ATT_LOGOUT_HANDLER + ", but not both",
+                pc.getReaderContext().error("Use " + ATT_LOGOUT_SUCCESS_URL + " or " + ATT_LOGOUT_HANDLER + ", but not both",
                         pc.extractSource(element));
             }
             builder.addConstructorArgReference(successHandlerRef);
