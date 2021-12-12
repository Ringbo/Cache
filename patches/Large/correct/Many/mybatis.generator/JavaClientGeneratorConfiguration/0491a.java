diff --git a/core/mybatis-generator-core/src/main/java/org/mybatis/generator/config/JavaClientGeneratorConfiguration.java b/core/mybatis-generator-core/src/main/java/org/mybatis/generator/config/JavaClientGeneratorConfiguration.java
index 4f7d7dd..20201a6 100644
--- a/core/mybatis-generator-core/src/main/java/org/mybatis/generator/config/JavaClientGeneratorConfiguration.java
+++ b/core/mybatis-generator-core/src/main/java/org/mybatis/generator/config/JavaClientGeneratorConfiguration.java
@@ -70,7 +70,7 @@
 
         if (implementationPackage != null) {
             answer.addAttribute(new Attribute(
-                    "implementationPackage", targetProject)); //$NON-NLS-1$
+                    "implementationPackage", implementationPackage)); //$NON-NLS-1$
         }
 
         addPropertyXmlElements(answer);
