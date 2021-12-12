diff --git a/org.springframework.beans/src/main/java/org/springframework/beans/BeanWrapper.java b/org.springframework.beans/src/main/java/org/springframework/beans/BeanWrapper.java
index 2e52ec3..dc931ab 100644
--- a/org.springframework.beans/src/main/java/org/springframework/beans/BeanWrapper.java
+++ b/org.springframework.beans/src/main/java/org/springframework/beans/BeanWrapper.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2008 the original author or authors.
+ * Copyright 2002-2009 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -39,7 +39,6 @@
  * @author Rod Johnson
  * @author Juergen Hoeller
  * @since 13 April 2001
- * @see #setExtractOldValueForEditor
  * @see PropertyAccessor
  * @see PropertyEditorRegistry
  * @see PropertyAccessorFactory#forBeanPropertyAccess
@@ -77,6 +76,6 @@
 	 * @return the property descriptor for the specified property
 	 * @throws InvalidPropertyException if there is no such property
 	 */
-	PropertyDescriptor getPropertyDescriptor(String propertyName) throws BeansException;
+	PropertyDescriptor getPropertyDescriptor(String propertyName) throws InvalidPropertyException;
 
 }
