diff --git a/modules/apps/foundation/vulcan/vulcan-api/src/main/java/com/liferay/vulcan/resource/builder/RoutesBuilder.java b/modules/apps/foundation/vulcan/vulcan-api/src/main/java/com/liferay/vulcan/resource/builder/RoutesBuilder.java
index eba0f94..fadaf72 100644
--- a/modules/apps/foundation/vulcan/vulcan-api/src/main/java/com/liferay/vulcan/resource/builder/RoutesBuilder.java
+++ b/modules/apps/foundation/vulcan/vulcan-api/src/main/java/com/liferay/vulcan/resource/builder/RoutesBuilder.java
@@ -37,7 +37,7 @@
  * @author Alejandro Hernández
  */
 @SuppressWarnings("unused")
-public interface RoutesBuilder<T> {
+public interface RoutesBuilder<T, U extends Identifier> {
 
 	/**
 	 * Constructs the <code>Routes</code> instance with the information provided
@@ -52,21 +52,18 @@
 	 *
 	 * @param  biFunction the function that will be used to calculate the single
 	 *         model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A> RoutesBuilder<T> collectionItem(
-		BiFunction<U, A, T> biFunction, Class<U> identifierClass,
-		Class<A> aClass);
+	public <A> RoutesBuilder<T, U> collectionItem(
+		BiFunction<U, A, T> biFunction, Class<A> aClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  decaFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -87,19 +84,17 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F, G, H, I> RoutesBuilder<T>
-		collectionItem(
+	public <A, B, C, D, E, F, G, H, I> RoutesBuilder<T, U> collectionItem(
 			DecaFunction<U, A, B, C, D, E, F, G, H, I, T> decaFunction,
-			Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
-			Class<C> cClass, Class<D> dClass, Class<E> eClass, Class<F> fClass,
-			Class<G> gClass, Class<H> hClass, Class<I> iClass);
+		Class<A> aClass, Class<B> bClass, Class<C> cClass, Class<D> dClass,
+		Class<E> eClass, Class<F> fClass, Class<G> gClass, Class<H> hClass,
+		Class<I> iClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  enneaFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -118,30 +113,25 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F, G, H> RoutesBuilder<T>
-		collectionItem(
+	public <A, B, C, D, E, F, G, H> RoutesBuilder<T, U> collectionItem(
 			EnneaFunction<U, A, B, C, D, E, F, G, H, T> enneaFunction,
-			Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
-			Class<C> cClass, Class<D> dClass, Class<E> eClass, Class<F> fClass,
-			Class<G> gClass, Class<H> hClass);
+		Class<A> aClass, Class<B> bClass, Class<C> cClass, Class<D> dClass,
+		Class<E> eClass, Class<F> fClass, Class<G> gClass, Class<H> hClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  function the function that will be used to calculate the single
 	 *         model.
-	 * @param  identifierClass the class of the identifier.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier> RoutesBuilder<T> collectionItem(
-		Function<U, T> function, Class<U> identifierClass);
+	public RoutesBuilder<T, U> collectionItem(Function<U, T> function);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  heptaFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -156,18 +146,16 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F> RoutesBuilder<T>
-		collectionItem(
-			HeptaFunction<U, A, B, C, D, E, F, T> heptaFunction,
-			Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
-			Class<C> cClass, Class<D> dClass, Class<E> eClass, Class<F> fClass);
+	public <A, B, C, D, E, F> RoutesBuilder<T, U> collectionItem(
+		HeptaFunction<U, A, B, C, D, E, F, T> heptaFunction, Class<A> aClass,
+		Class<B> bClass, Class<C> cClass, Class<D> dClass, Class<E> eClass,
+		Class<F> fClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  hexaFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -180,18 +168,15 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E> RoutesBuilder<T>
-		collectionItem(
-			HexaFunction<U, A, B, C, D, E, T> hexaFunction,
-			Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
-			Class<C> cClass, Class<D> dClass, Class<E> eClass);
+	public <A, B, C, D, E> RoutesBuilder<T, U> collectionItem(
+		HexaFunction<U, A, B, C, D, E, T> hexaFunction, Class<A> aClass,
+		Class<B> bClass, Class<C> cClass, Class<D> dClass, Class<E> eClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  octaFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -208,19 +193,16 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F, G> RoutesBuilder<T>
-		collectionItem(
-			OctaFunction<U, A, B, C, D, E, F, G, T> octaFunction,
-			Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
-			Class<C> cClass, Class<D> dClass, Class<E> eClass, Class<F> fClass,
-			Class<G> gClass);
+	public <A, B, C, D, E, F, G> RoutesBuilder<T, U> collectionItem(
+		OctaFunction<U, A, B, C, D, E, F, G, T> octaFunction, Class<A> aClass,
+		Class<B> bClass, Class<C> cClass, Class<D> dClass, Class<E> eClass,
+		Class<F> fClass, Class<G> gClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  pentaFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -231,16 +213,15 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D> RoutesBuilder<T> collectionItem(
-		PentaFunction<U, A, B, C, D, T> pentaFunction, Class<U> identifierClass,
-		Class<A> aClass, Class<B> bClass, Class<C> cClass, Class<D> dClass);
+	public <A, B, C, D> RoutesBuilder<T, U> collectionItem(
+		PentaFunction<U, A, B, C, D, T> pentaFunction, Class<A> aClass,
+		Class<B> bClass, Class<C> cClass, Class<D> dClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  tetraFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
@@ -249,25 +230,23 @@
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C> RoutesBuilder<T> collectionItem(
-		TetraFunction<U, A, B, C, T> tetraFunction, Class<U> identifierClass,
-		Class<A> aClass, Class<B> bClass, Class<C> cClass);
+	public <A, B, C> RoutesBuilder<T, U> collectionItem(
+		TetraFunction<U, A, B, C, T> tetraFunction, Class<A> aClass,
+		Class<B> bClass, Class<C> cClass);
 
 	/**
 	 * Adds a route to a single model function.
 	 *
 	 * @param  triFunction the function that will be used to calculate the
 	 *         single model.
-	 * @param  identifierClass the class of the identifier.
 	 * @param  aClass the class of the second parameter of the single model
 	 *         function.
 	 * @param  bClass the class of the third parameter of the single model
 	 *         function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B> RoutesBuilder<T> collectionItem(
-		TriFunction<U, A, B, T> triFunction, Class<U> identifierClass,
-		Class<A> aClass, Class<B> bClass);
+	public <A, B> RoutesBuilder<T, U> collectionItem(
+		TriFunction<U, A, B, T> triFunction, Class<A> aClass, Class<B> bClass);
 
 	/**
 	 * Adds a route to a collection page function.
@@ -276,9 +255,9 @@
 	 * @param  identifierClass the class of the identifier.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier> RoutesBuilder<T> collectionPage(
-		BiFunction<Pagination, U, PageItems<T>> biFunction,
-		Class<U> identifierClass);
+	public <V extends Identifier> RoutesBuilder<T, U> collectionPage(
+		BiFunction<Pagination, V, PageItems<T>> biFunction,
+		Class<V> identifierClass);
 
 	/**
 	 * Adds a route to a collection page function.
@@ -296,10 +275,10 @@
 	 * @param  hClass the class of the ninth parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F, G, H> RoutesBuilder<T>
+	public <V extends Identifier, A, B, C, D, E, F, G, H> RoutesBuilder<T, U>
 		collectionPage(
-			DecaFunction<Pagination, U, A, B, C, D, E, F, G, H,
-				PageItems<T>> decaFunction, Class<U> identifierClass,
+			DecaFunction<Pagination, V, A, B, C, D, E, F, G, H,
+				PageItems<T>> decaFunction, Class<V> identifierClass,
 			Class<A> aClass, Class<B> bClass, Class<C> cClass, Class<D> dClass,
 			Class<E> eClass, Class<F> fClass, Class<G> gClass, Class<H> hClass);
 
@@ -318,10 +297,10 @@
 	 * @param  gClass the class of the eighth parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F, G> RoutesBuilder<T>
+	public <V extends Identifier, A, B, C, D, E, F, G> RoutesBuilder<T, U>
 		collectionPage(
-			EnneaFunction<Pagination, U, A, B, C, D, E, F, G, PageItems<T>>
-				enneaFunction, Class<U> identifierClass, Class<A> aClass,
+			EnneaFunction<Pagination, V, A, B, C, D, E, F, G, PageItems<T>>
+				enneaFunction, Class<V> identifierClass, Class<A> aClass,
 			Class<B> bClass, Class<C> cClass, Class<D> dClass, Class<E> eClass,
 			Class<F> fClass, Class<G> gClass);
 
@@ -338,10 +317,10 @@
 	 * @param  eClass the class of the sixth parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E> RoutesBuilder<T>
+	public <V extends Identifier, A, B, C, D, E> RoutesBuilder<T, U>
 		collectionPage(
-			HeptaFunction<Pagination, U, A, B, C, D, E, PageItems<T>>
-				heptaFunction, Class<U> identifierClass, Class<A> aClass,
+			HeptaFunction<Pagination, V, A, B, C, D, E, PageItems<T>>
+				heptaFunction, Class<V> identifierClass, Class<A> aClass,
 			Class<B> bClass, Class<C> cClass, Class<D> dClass, Class<E> eClass);
 
 	/**
@@ -356,9 +335,10 @@
 	 * @param  dClass the class of the fifth parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D> RoutesBuilder<T> collectionPage(
-		HexaFunction<Pagination, U, A, B, C, D, PageItems<T>> hexaFunction,
-		Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
+	public <V extends Identifier, A, B, C, D> RoutesBuilder<T, U>
+		collectionPage(
+			HexaFunction<Pagination, V, A, B, C, D, PageItems<T>> hexaFunction,
+			Class<V> identifierClass, Class<A> aClass, Class<B> bClass,
 		Class<C> cClass, Class<D> dClass);
 
 	/**
@@ -375,10 +355,10 @@
 	 * @param  fClass the class of the seventh parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C, D, E, F> RoutesBuilder<T>
+	public <V extends Identifier, A, B, C, D, E, F> RoutesBuilder<T, U>
 		collectionPage(
-			OctaFunction<Pagination, U, A, B, C, D, E, F, PageItems<T>>
-				octaFunction, Class<U> identifierClass, Class<A> aClass,
+			OctaFunction<Pagination, V, A, B, C, D, E, F, PageItems<T>>
+				octaFunction, Class<V> identifierClass, Class<A> aClass,
 			Class<B> bClass, Class<C> cClass, Class<D> dClass, Class<E> eClass,
 			Class<F> fClass);
 
@@ -393,9 +373,9 @@
 	 * @param  cClass the class of the fourth parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B, C> RoutesBuilder<T> collectionPage(
-		PentaFunction<Pagination, U, A, B, C, PageItems<T>> pentaFunction,
-		Class<U> identifierClass, Class<A> aClass, Class<B> bClass,
+	public <V extends Identifier, A, B, C> RoutesBuilder<T, U> collectionPage(
+		PentaFunction<Pagination, V, A, B, C, PageItems<T>> pentaFunction,
+		Class<V> identifierClass, Class<A> aClass, Class<B> bClass,
 		Class<C> cClass);
 
 	/**
@@ -408,9 +388,9 @@
 	 * @param  bClass the class of the third parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A, B> RoutesBuilder<T> collectionPage(
-		TetraFunction<Pagination, U, A, B, PageItems<T>> tetraFunction,
-		Class<U> identifierClass, Class<A> aClass, Class<B> bClass);
+	public <V extends Identifier, A, B> RoutesBuilder<T, U> collectionPage(
+		TetraFunction<Pagination, V, A, B, PageItems<T>> tetraFunction,
+		Class<V> identifierClass, Class<A> aClass, Class<B> bClass);
 
 	/**
 	 * Adds a route to a collection page function.
@@ -421,8 +401,8 @@
 	 * @param  aClass the class of the second parameter of the page function.
 	 * @return the updated builder.
 	 */
-	public <U extends Identifier, A> RoutesBuilder<T> collectionPage(
-		TriFunction<Pagination, U, A, PageItems<T>> triFunction,
-		Class<U> identifierClass, Class<A> aClass);
+	public <V extends Identifier, A> RoutesBuilder<T, U> collectionPage(
+		TriFunction<Pagination, V, A, PageItems<T>> triFunction,
+		Class<V> identifierClass, Class<A> aClass);
 
 }
\ No newline at end of file
