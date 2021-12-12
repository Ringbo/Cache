diff --git a/stratosphere-java/src/main/java/eu/stratosphere/api/java/typeutils/TupleTypeInfo.java b/stratosphere-java/src/main/java/eu/stratosphere/api/java/typeutils/TupleTypeInfo.java
index 6630386..ea26376 100644
--- a/stratosphere-java/src/main/java/eu/stratosphere/api/java/typeutils/TupleTypeInfo.java
+++ b/stratosphere-java/src/main/java/eu/stratosphere/api/java/typeutils/TupleTypeInfo.java
@@ -32,7 +32,7 @@
 	private final Class<T> tupleType;
 	
 	public TupleTypeInfo(Class<T> tupleType, TypeInformation<?>... types) {
-		if (types == null || types.length == 0 || types.length >= Tuple.MAX_ARITY) {
+		if (types == null || types.length == 0 || types.length > Tuple.MAX_ARITY) {
 			throw new IllegalArgumentException();
 		}
 		
