diff --git a/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java b/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java
index 4066c28..e7926fd 100644
--- a/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java
+++ b/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java
@@ -303,7 +303,7 @@
 				this.propertyDescriptorCache.put(pd.getName(), pd);
 			}
 
-			this.typeDescriptorCache = new ConcurrentHashMap<PropertyDescriptor, TypeDescriptor>();
+			this.typeDescriptorCache = new ConcurrentReferenceHashMap<PropertyDescriptor, TypeDescriptor>();
 		}
 		catch (IntrospectionException ex) {
 			throw new FatalBeanException("Failed to obtain BeanInfo for class [" + beanClass.getName() + "]", ex);
