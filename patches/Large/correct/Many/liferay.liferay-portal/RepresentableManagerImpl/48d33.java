diff --git a/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/wiring/osgi/manager/representable/RepresentableManagerImpl.java b/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/wiring/osgi/manager/representable/RepresentableManagerImpl.java
index 47a0e22..6343ca8 100644
--- a/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/wiring/osgi/manager/representable/RepresentableManagerImpl.java
+++ b/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/internal/wiring/osgi/manager/representable/RepresentableManagerImpl.java
@@ -191,7 +191,7 @@
 		Representable<T, S, U> representable, Class<U> clazz,
 		Map<String, List<RelatedCollection<T, ?>>> relatedCollections) {
 
-		Supplier<List<RelatedCollection<T, ?>>> relatedCollectionSupplier =
+		Supplier<List<RelatedCollection<T, ?>>> relatedCollectionsSupplier =
 			() -> relatedCollections.get(clazz.getName());
 
 		BiConsumer<Class<?>, RelatedCollection<T, ?>> biConsumer =
@@ -204,7 +204,7 @@
 			};
 
 		Builder<T, S> builder = new BuilderImpl<>(
-			clazz, this::_getNameOrFail, biConsumer, relatedCollectionSupplier);
+			clazz, this::_getNameOrFail, biConsumer, relatedCollectionsSupplier);
 
 		return representable.representor(builder);
 	}
