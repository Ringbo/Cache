diff --git a/spring-beans/src/main/java/org/springframework/beans/BeanUtils.java b/spring-beans/src/main/java/org/springframework/beans/BeanUtils.java
index 8760fa4..6d03c4e 100644
--- a/spring-beans/src/main/java/org/springframework/beans/BeanUtils.java
+++ b/spring-beans/src/main/java/org/springframework/beans/BeanUtils.java
@@ -734,12 +734,11 @@
 		 * Instantiate a Kotlin class using the provided constructor.
 		 * @param ctor the constructor of the Kotlin class to instantiate
 		 * @param args the constructor arguments to apply (use null for unspecified parameter if needed)
-		 * @throws BeanInstantiationException if no primary constructor can be found
 		 */
-		public static <T> T instantiateClass(Constructor<T> ctor, Object... args) {
+		public static <T> T instantiateClass(Constructor<T> ctor, Object... args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
 			KFunction<T> kotlinConstructor = ReflectJvmMapping.getKotlinFunction(ctor);
 			if (kotlinConstructor == null) {
-				throw new BeanInstantiationException(ctor.getDeclaringClass(), "No corresponding Kotlin constructor found");
+				return ctor.newInstance(args);
 			}
 			List<KParameter> parameters = kotlinConstructor.getParameters();
 			Map<KParameter, Object> argParameters = new HashMap<>(parameters.size());
