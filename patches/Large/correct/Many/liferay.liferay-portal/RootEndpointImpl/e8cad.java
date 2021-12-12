diff --git a/modules/apps/foundation/vulcan/vulcan-application/src/main/java/com/liferay/vulcan/application/internal/endpoint/RootEndpointImpl.java b/modules/apps/foundation/vulcan/vulcan-application/src/main/java/com/liferay/vulcan/application/internal/endpoint/RootEndpointImpl.java
index 1441843..b7b923d8 100644
--- a/modules/apps/foundation/vulcan/vulcan-application/src/main/java/com/liferay/vulcan/application/internal/endpoint/RootEndpointImpl.java
+++ b/modules/apps/foundation/vulcan/vulcan-application/src/main/java/com/liferay/vulcan/application/internal/endpoint/RootEndpointImpl.java
@@ -101,22 +101,22 @@
 	}
 
 	@Override
-	public <T> Try<InputStream> getCollectionItemInputStreamTry(
+	public Try<InputStream> getCollectionItemInputStreamTry(
 		String path, String id, String binaryId) {
 
-		Class<T> modelClass = _resourceManager.getModelClass(path);
+		Class<Object> modelClass = _resourceManager.getModelClass(path);
 
-		Optional<Representor<T, Identifier>> representorOptional =
+		Optional<Representor<Object, Identifier>> representorOptional =
 			_resourceManager.getRepresentorOptional(modelClass);
 
-		Optional<BinaryFunction<T>> binaryFunctionOptional =
+		Optional<BinaryFunction<Object>> binaryFunctionOptional =
 			representorOptional.map(
 				Representor::getBinaryFunctions
 			).map(
 				binaryFunctions -> binaryFunctions.get(binaryId)
 			);
 
-		Try<BinaryFunction<T>> binaryFunctionTry = Try.fromFallible(
+		Try<BinaryFunction<Object>> binaryFunctionTry = Try.fromFallible(
 			binaryFunctionOptional::get);
 
 		return binaryFunctionTry.mapFailMatching(
