diff --git a/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/FieldsWriter.java b/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/FieldsWriter.java
index 1ced838..6c0c75d 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/FieldsWriter.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/FieldsWriter.java
@@ -43,8 +43,11 @@
  * Writes the different fields declared on a {@link Representor}.
  *
  * @author Alejandro Hernández
+ * @param  <T> the model's type
+ * @param  <S> the model identifier's type ({@link Long}, {@link String}, etc.)
+ * @review
  */
-public class FieldsWriter<T, U> {
+public class FieldsWriter<T, S> {
 
 	/**
 	 * Returns the {@link SingleModel} version of a {@link RelatedModel}.
@@ -53,22 +56,22 @@
 	 * @param  parentSingleModel the related model's parent single model
 	 * @return the single model version of the related model
 	 */
-	public static <T, V> Optional<SingleModel<V>> getSingleModel(
-		RelatedModel<T, V> relatedModel, SingleModel<T> parentSingleModel) {
+	public static <T, S> Optional<SingleModel<S>> getSingleModel(
+		RelatedModel<T, S> relatedModel, SingleModel<T> parentSingleModel) {
 
-		Optional<V> optional = relatedModel.getModelFunction(
+		Optional<S> optional = relatedModel.getModelFunction(
 		).apply(
 			parentSingleModel.getModel()
 		);
 
-		Class<V> modelClass = relatedModel.getModelClass();
+		Class<S> modelClass = relatedModel.getModelClass();
 
 		return optional.map(model -> new SingleModel<>(model, modelClass));
 	}
 
 	public FieldsWriter(
 		SingleModel<T> singleModel, RequestInfo requestInfo,
-		Representor<T, U> representor, Path path,
+		Representor<T, S> representor, Path path,
 		FunctionalList<String> embeddedPathElements) {
 
 		_singleModel = singleModel;
@@ -121,24 +124,24 @@
 	}
 
 	/**
-	 * Returns a consumer for entries of a {@code Map<String, Function<T, V>}.
+	 * Returns a consumer for entries of a {@code Map<String, Function<T, S>}.
 	 * The consumer uses a value function to get the final value, then uses the
 	 * bi-consumer provided as the second parameter to process the key and the
 	 * final value. This consumer is called only when the final data isn't empty
 	 * or {@code null}.
 	 *
 	 * @param  biConsumer the consumer used to process the key-value pair
-	 * @return the consumer for entries of a {@code Map<String, Function<T, V>}
+	 * @return the consumer for entries of a {@code Map<String, Function<T, S>}
 	 */
-	public <V> Consumer<Entry<String, Function<T, V>>> writeField(
-		BiConsumer<String, V> biConsumer) {
+	public <U> Consumer<Entry<String, Function<T, U>>> writeField(
+		BiConsumer<String, U> biConsumer) {
 
 		return writeField(
 			function -> function.apply(_singleModel.getModel()), biConsumer);
 	}
 
 	/**
-	 * Returns a consumer for entries of a {@code Map<String, V>}. The consumer
+	 * Returns a consumer for entries of a {@code Map<String, S>}. The consumer
 	 * uses the function provided as the first parameter to get the final value,
 	 * then uses the bi-consumer provided as the second parameter to process the
 	 * key and the final value. This consumer is called only when the final data
@@ -146,13 +149,13 @@
 	 *
 	 * @param  function the function used to get the final value
 	 * @param  biConsumer the consumer used to process the key-value pair
-	 * @return the consumer for entries of a {@code Map<String, V>}
+	 * @return the consumer for entries of a {@code Map<String, S>}
 	 */
-	public <V, W> Consumer<Entry<String, V>> writeField(
-		Function<V, W> function, BiConsumer<String, W> biConsumer) {
+	public <U, V> Consumer<Entry<String, U>> writeField(
+		Function<U, V> function, BiConsumer<String, V> biConsumer) {
 
 		return entry -> {
-			W data = function.apply(entry.getValue());
+			V data = function.apply(entry.getValue());
 
 			if (data instanceof String) {
 				if ((data != null) && !((String)data).isEmpty()) {
@@ -166,7 +169,7 @@
 	}
 
 	/**
-	 * Writes a {@code Map<String, V>} returned by a {@link Representor}
+	 * Writes a {@code Map<String, S>} returned by a {@link Representor}
 	 * function. This method uses a consumer so each caller can decide what to
 	 * do with each entry. Each member of the map is filtered using the {@link
 	 * Fields} predicate provided by {@link #getFieldsPredicate()}.
@@ -175,15 +178,15 @@
 	 *        the map being written
 	 * @param consumer the consumer used to process each filtered entry
 	 */
-	public <V> void writeFields(
-		Function<Representor<T, U>, Map<String, V>> representorFunction,
-		Consumer<Entry<String, V>> consumer) {
+	public <U> void writeFields(
+		Function<Representor<T, S>, Map<String, U>> representorFunction,
+		Consumer<Entry<String, U>> consumer) {
 
-		Map<String, V> map = representorFunction.apply(_representor);
+		Map<String, U> map = representorFunction.apply(_representor);
 
-		Set<Entry<String, V>> entries = map.entrySet();
+		Set<Entry<String, U>> entries = map.entrySet();
 
-		Stream<Entry<String, V>> stream = entries.stream();
+		Stream<Entry<String, U>> stream = entries.stream();
 
 		stream.filter(
 			entry -> {
@@ -245,8 +248,8 @@
 	 * @param biConsumer the {@code BiConsumer} that writes the related
 	 *        collection URL
 	 */
-	public <V> void writeRelatedCollection(
-		RelatedCollection<T, V> relatedCollection, String resourceName,
+	public <U> void writeRelatedCollection(
+		RelatedCollection<T, U> relatedCollection, String resourceName,
 		FunctionalList<String> parentEmbeddedPathElements,
 		BiConsumer<String, FunctionalList<String>> biConsumer) {
 
@@ -314,8 +317,8 @@
 	 * @param embeddedURLBiConsumer the consumer that writes an embedded related
 	 *        model's url
 	 */
-	public <V> void writeRelatedModel(
-		RelatedModel<T, V> relatedModel,
+	public <U> void writeRelatedModel(
+		RelatedModel<T, U> relatedModel,
 		Function<SingleModel<?>, Optional<Path>> pathFunction,
 		BiConsumer<SingleModel<?>, FunctionalList<String>> modelBiConsumer,
 		BiConsumer<String, FunctionalList<String>> linkedURLBiConsumer,
@@ -324,7 +327,7 @@
 		writeRelatedModel(
 			relatedModel, pathFunction,
 			(url, embeddedPathElements) -> {
-				Optional<SingleModel<V>> singleModelOptional = getSingleModel(
+				Optional<SingleModel<U>> singleModelOptional = getSingleModel(
 					relatedModel, _singleModel);
 
 				if (!singleModelOptional.isPresent()) {
@@ -333,7 +336,7 @@
 
 				Predicate<String> embedded = _requestInfo.getEmbedded();
 
-				SingleModel<V> singleModel = singleModelOptional.get();
+				SingleModel<U> singleModel = singleModelOptional.get();
 
 				Stream<String> stream = Stream.concat(
 					Stream.of(embeddedPathElements.head()),
@@ -363,8 +366,8 @@
 	 * @param biConsumer the consumer that writes a related model's URL and
 	 *        embedded path elements
 	 */
-	public <V> void writeRelatedModel(
-		RelatedModel<T, V> relatedModel,
+	public <U> void writeRelatedModel(
+		RelatedModel<T, U> relatedModel,
 		Function<SingleModel<?>, Optional<Path>> pathFunction,
 		BiConsumer<String, FunctionalList<String>> biConsumer) {
 
@@ -376,7 +379,7 @@
 			return;
 		}
 
-		Optional<SingleModel<V>> optional = getSingleModel(
+		Optional<SingleModel<U>> optional = getSingleModel(
 			relatedModel, _singleModel);
 
 		FunctionalList<String> embeddedPathElements = new FunctionalList<>(
@@ -458,7 +461,7 @@
 
 	private final FunctionalList<String> _embeddedPathElements;
 	private final Path _path;
-	private final Representor<T, U> _representor;
+	private final Representor<T, S> _representor;
 	private final RequestInfo _requestInfo;
 	private final SingleModel<T> _singleModel;
 
