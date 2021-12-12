diff --git a/spring-beans/src/main/java/org/springframework/beans/factory/config/PlaceholderConfigurerSupport.java b/spring-beans/src/main/java/org/springframework/beans/factory/config/PlaceholderConfigurerSupport.java
index 55be5e0..f3b35e8 100644
--- a/spring-beans/src/main/java/org/springframework/beans/factory/config/PlaceholderConfigurerSupport.java
+++ b/spring-beans/src/main/java/org/springframework/beans/factory/config/PlaceholderConfigurerSupport.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2012 the original author or authors.
+ * Copyright 2002-2013 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -208,7 +208,7 @@
 					visitor.visitBeanDefinition(bd);
 				}
 				catch (Exception ex) {
-					throw new BeanDefinitionStoreException(bd.getResourceDescription(), curName, ex.getMessage());
+					throw new BeanDefinitionStoreException(bd.getResourceDescription(), curName, ex.getMessage(), ex);
 				}
 			}
 		}
