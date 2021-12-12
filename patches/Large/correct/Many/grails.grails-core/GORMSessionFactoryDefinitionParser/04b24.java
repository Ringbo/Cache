diff --git a/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/cfg/GORMSessionFactoryDefinitionParser.java b/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/cfg/GORMSessionFactoryDefinitionParser.java
index ef86126..25f6169 100644
--- a/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/cfg/GORMSessionFactoryDefinitionParser.java
+++ b/grails-hibernate/src/main/groovy/org/codehaus/groovy/grails/orm/hibernate/cfg/GORMSessionFactoryDefinitionParser.java
@@ -210,7 +210,7 @@
 
         String transactionManagerRef = element.getAttribute(TRANSACTION_MANAGER_ATTRIBUTE);
         if (StringUtils.hasText(transactionManagerRef)) {
-            targetRegistry.registerAlias("transactionManager", transactionManagerRef);
+            targetRegistry.registerAlias(transactionManagerRef, "transactionManager");
         }
         else {
             GenericBeanDefinition transactionManagerBean = new GenericBeanDefinition();
