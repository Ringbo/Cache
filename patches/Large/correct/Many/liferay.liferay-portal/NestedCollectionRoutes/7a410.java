diff --git a/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/routes/NestedCollectionRoutes.java b/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/routes/NestedCollectionRoutes.java
index f805490..25cb262 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/routes/NestedCollectionRoutes.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/routes/NestedCollectionRoutes.java
@@ -154,8 +154,8 @@
 		 * @return the updated builder
 		 */
 		@SuppressWarnings("unchecked")
-		public <R, V> Builder<T, S> addCreator(
-			BiFunction<V, R, T> biFunction,
+		public <R> Builder<T, S> addCreator(
+			BiFunction<S, R, T> biFunction,
 			FormBuilderFunction<R> formBuilderFunction) {
 
 			_form = formBuilderFunction.apply(
@@ -185,8 +185,8 @@
 		 * @return the updated builder
 		 */
 		@SuppressWarnings("unchecked")
-		public <A, B, C, D, R, V> Builder<T, S> addCreator(
-			HexaFunction<V, R, A, B, C, D, T> hexaFunction, Class<A> aClass,
+		public <A, B, C, D, R> Builder<T, S> addCreator(
+			HexaFunction<S, R, A, B, C, D, T> hexaFunction, Class<A> aClass,
 			Class<B> bClass, Class<C> cClass, Class<D> dClass,
 			FormBuilderFunction<R> formBuilderFunction) {
 
@@ -220,8 +220,8 @@
 		 * @return the updated builder
 		 */
 		@SuppressWarnings("unchecked")
-		public <A, B, C, R, V> Builder<T, S> addCreator(
-			PentaFunction<V, R, A, B, C, T> pentaFunction, Class<A> aClass,
+		public <A, B, C, R> Builder<T, S> addCreator(
+			PentaFunction<S, R, A, B, C, T> pentaFunction, Class<A> aClass,
 			Class<B> bClass, Class<C> cClass,
 			FormBuilderFunction<R> formBuilderFunction) {
 
@@ -253,8 +253,8 @@
 		 * @return the updated builder
 		 */
 		@SuppressWarnings("unchecked")
-		public <A, B, R, V> Builder<T, S> addCreator(
-			TetraFunction<V, R, A, B, T> tetraFunction, Class<A> aClass,
+		public <A, B, R> Builder<T, S> addCreator(
+			TetraFunction<S, R, A, B, T> tetraFunction, Class<A> aClass,
 			Class<B> bClass, FormBuilderFunction<R> formBuilderFunction) {
 
 			_form = formBuilderFunction.apply(
@@ -283,8 +283,8 @@
 		 * @return the updated builder
 		 */
 		@SuppressWarnings("unchecked")
-		public <A, R, V> Builder<T, S> addCreator(
-			TriFunction<V, R, A, T> triFunction, Class<A> aClass,
+		public <A, R> Builder<T, S> addCreator(
+			TriFunction<S, R, A, T> triFunction, Class<A> aClass,
 			FormBuilderFunction<R> formBuilderFunction) {
 
 			_form = formBuilderFunction.apply(
@@ -309,8 +309,8 @@
 		 * @param  biFunction the function that calculates the page
 		 * @return the updated builder
 		 */
-		public <V> Builder<T, S> addGetter(
-			BiFunction<Pagination, V, PageItems<T>> biFunction) {
+		public Builder<T, S> addGetter(
+			BiFunction<Pagination, S, PageItems<T>> biFunction) {
 
 			_nestedGetPageFunction =
 				httpServletRequest -> path -> identifier -> provide(
@@ -336,8 +336,8 @@
 		 * @param  dClass the class of the page function's fifth parameter
 		 * @return the updated builder
 		 */
-		public <V, A, B, C, D> Builder<T, S> addGetter(
-			HexaFunction<Pagination, V, A, B, C, D, PageItems<T>> hexaFunction,
+		public <A, B, C, D> Builder<T, S> addGetter(
+			HexaFunction<Pagination, S, A, B, C, D, PageItems<T>> hexaFunction,
 			Class<A> aClass, Class<B> bClass, Class<C> cClass,
 			Class<D> dClass) {
 
@@ -365,8 +365,8 @@
 		 * @param  cClass the class of the page function's fourth parameter
 		 * @return the updated builder
 		 */
-		public <V, A, B, C> Builder<T, S> addGetter(
-			PentaFunction<Pagination, V, A, B, C, PageItems<T>> pentaFunction,
+		public <A, B, C> Builder<T, S> addGetter(
+			PentaFunction<Pagination, S, A, B, C, PageItems<T>> pentaFunction,
 			Class<A> aClass, Class<B> bClass, Class<C> cClass) {
 
 			_nestedGetPageFunction =
@@ -391,8 +391,8 @@
 		 * @param  bClass the class of the page function's third parameter
 		 * @return the updated builder
 		 */
-		public <V, A, B> Builder<T, S> addGetter(
-			TetraFunction<Pagination, V, A, B, PageItems<T>> tetraFunction,
+		public <A, B> Builder<T, S> addGetter(
+			TetraFunction<Pagination, S, A, B, PageItems<T>> tetraFunction,
 			Class<A> aClass, Class<B> bClass) {
 
 			_nestedGetPageFunction =
@@ -416,8 +416,8 @@
 		 * @param  aClass the class of the page function's second parameter
 		 * @return the updated builder
 		 */
-		public <V, A> Builder<T, S> addGetter(
-			TriFunction<Pagination, V, A, PageItems<T>> triFunction,
+		public <A> Builder<T, S> addGetter(
+			TriFunction<Pagination, S, A, PageItems<T>> triFunction,
 			Class<A> aClass) {
 
 			_nestedGetPageFunction =
@@ -445,14 +445,14 @@
 		}
 
 		@SuppressWarnings("unchecked")
-		private <V> V _getIdentifier(Object identifier) {
+		private <U> U _getIdentifier(Object identifier) {
 			Class<?> clazz = identifier.getClass();
 
 			if (!_identifierClass.isAssignableFrom(clazz)) {
 				throw new MustUseSameIdentifier(clazz, _identifierClass);
 			}
 
-			return (V)identifier;
+			return (U)identifier;
 		}
 
 		private Form _form;
