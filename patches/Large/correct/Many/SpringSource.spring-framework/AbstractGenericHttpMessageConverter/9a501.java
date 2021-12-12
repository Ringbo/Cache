diff --git a/spring-web/src/main/java/org/springframework/http/converter/AbstractGenericHttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/AbstractGenericHttpMessageConverter.java
index ebe813e..a15d046 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/AbstractGenericHttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/AbstractGenericHttpMessageConverter.java
@@ -29,6 +29,7 @@
  * Abstract base class for most {@link GenericHttpMessageConverter} implementations.
  *
  * @author Sebastien Deleuze
+ * @author Juergen Hoeller
  * @since 4.2
  */
 public abstract class AbstractGenericHttpMessageConverter<T> extends AbstractHttpMessageConverter<T>
@@ -65,12 +66,12 @@
 
 	@Override
 	public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
-		return canRead(mediaType);
+		return (type instanceof Class ? canRead((Class<?>) type, mediaType) : canRead(mediaType));
 	}
 
 	@Override
 	public boolean canWrite(Type type, Class<?> clazz, MediaType mediaType) {
-		return canWrite(mediaType);
+		return canWrite(clazz, mediaType);
 	}
 
 	/**
