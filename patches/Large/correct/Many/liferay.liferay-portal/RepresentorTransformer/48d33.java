diff --git a/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/annotation/representor/RepresentorTransformer.java b/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/annotation/representor/RepresentorTransformer.java
index 62f171f..b46884ae 100644
--- a/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/annotation/representor/RepresentorTransformer.java
+++ b/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/annotation/representor/RepresentorTransformer.java
@@ -87,7 +87,7 @@
 			Function<Class<? extends Identifier<?>>, String> nameFunction,
 			Map<String, List<RelatedCollection<T, ?>>> relatedCollections) {
 
-		Supplier<List<RelatedCollection<T, ?>>> relatedCollectionSupplier =
+		Supplier<List<RelatedCollection<T, ?>>> relatedCollectionsSupplier =
 			() -> relatedCollections.get(typeClass.getName());
 
 		BiConsumer<Class<?>, RelatedCollection<T, ?>> biConsumer =
@@ -100,7 +100,7 @@
 			};
 
 		return new RepresentorImpl.BuilderImpl<>(
-			typeClass, nameFunction, biConsumer, relatedCollectionSupplier);
+			typeClass, nameFunction, biConsumer, relatedCollectionsSupplier);
 	}
 
 	private static <T extends Identifier<S>, S> void _processMethod(
