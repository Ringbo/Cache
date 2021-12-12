diff --git a/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java b/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java
index 38bc83c..a74017d 100644
--- a/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java
+++ b/spring-beans/src/main/java/org/springframework/beans/CachedIntrospectionResults.java
@@ -188,13 +188,13 @@
 		results = new CachedIntrospectionResults(beanClass);
 		if (ClassUtils.isCacheSafe(beanClass, CachedIntrospectionResults.class.getClassLoader()) ||
 				isClassLoaderAccepted(beanClass.getClassLoader())) {
-			strongClassCache.put(beanClass, results);
+			strongClassCache.putIfAbsent(beanClass, results);
 		}
 		else {
 			if (logger.isDebugEnabled()) {
 				logger.debug("Not strongly caching class [" + beanClass.getName() + "] because it is not cache-safe");
 			}
-			softClassCache.put(beanClass, results);
+			softClassCache.putIfAbsent(beanClass, results);
 		}
 		return results;
 	}
@@ -295,7 +295,7 @@
 									"; editor [" + pd.getPropertyEditorClass().getName() + "]" : ""));
 				}
 				pd = buildGenericTypeAwarePropertyDescriptor(beanClass, pd);
-				this.propertyDescriptorCache.put(pd.getName(), pd);
+				this.propertyDescriptorCache.putIfAbsent(pd.getName(), pd);
 			}
 
 			this.typeDescriptorCache = new ConcurrentHashMap<PropertyDescriptor, TypeDescriptor>();
@@ -348,7 +348,7 @@
 	}
 
 	void addTypeDescriptor(PropertyDescriptor pd, TypeDescriptor td) {
-		this.typeDescriptorCache.put(pd, td);
+		this.typeDescriptorCache.putIfAbsent(pd, td);
 	}
 
 	TypeDescriptor getTypeDescriptor(PropertyDescriptor pd) {
