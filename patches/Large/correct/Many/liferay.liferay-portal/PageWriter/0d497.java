diff --git a/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/PageWriter.java b/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/PageWriter.java
index f1c7b35..da60170 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/PageWriter.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/PageWriter.java
@@ -42,6 +42,8 @@
  * Writes a page.
  *
  * @author Alejandro Hernández
+ * @param  <T> the model's type
+ * @review
  */
 public class PageWriter<T> {
 
@@ -113,6 +115,9 @@
 
 	/**
 	 * Creates {@code PageWriter} instances.
+	 *
+	 * @param  <T> the model's type
+	 * @review
 	 */
 	public static class Builder<T> {
 
@@ -346,11 +351,11 @@
 			singleModel.getModelClass(), _requestInfo.getHttpHeaders());
 	}
 
-	private <V> void _writeItemEmbeddedModelFields(
-		SingleModel<V> singleModel, FunctionalList<String> embeddedPathElements,
+	private <S> void _writeItemEmbeddedModelFields(
+		SingleModel<S> singleModel, FunctionalList<String> embeddedPathElements,
 		JSONObjectBuilder itemJsonObjectBuilder) {
 
-		Optional<FieldsWriter<V, ?>> optional = getFieldsWriter(
+		Optional<FieldsWriter<S, ?>> optional = getFieldsWriter(
 			singleModel, embeddedPathElements, _requestInfo, _pathFunction,
 			_representorFunction);
 
@@ -358,7 +363,7 @@
 			return;
 		}
 
-		FieldsWriter<V, ?> fieldsWriter = optional.get();
+		FieldsWriter<S, ?> fieldsWriter = optional.get();
 
 		fieldsWriter.writeBooleanFields(
 			(field, value) ->
