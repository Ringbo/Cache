diff --git a/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/SingleModelWriter.java b/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/SingleModelWriter.java
index 98cc9e6..948dd6a 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/SingleModelWriter.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-writer-api/src/main/java/com/liferay/apio/architect/writer/SingleModelWriter.java
@@ -35,6 +35,8 @@
  * Writes a single model.
  *
  * @author Alejandro Hernández
+ * @param  <T> the model's type
+ * @review
  */
 public class SingleModelWriter<T> {
 
@@ -149,6 +151,9 @@
 
 	/**
 	 * Creates {@code SingleModelWriter} instances.
+	 *
+	 * @param  <T> the model's type
+	 * @review
 	 */
 	public static class Builder<T> {
 
@@ -288,11 +293,11 @@
 
 	}
 
-	private <V> void _writeEmbeddedModelFields(
-		SingleModel<V> singleModel,
+	private <S> void _writeEmbeddedModelFields(
+		SingleModel<S> singleModel,
 		FunctionalList<String> embeddedPathElements) {
 
-		Optional<FieldsWriter<V, ?>> optional = getFieldsWriter(
+		Optional<FieldsWriter<S, ?>> optional = getFieldsWriter(
 			singleModel, embeddedPathElements, _requestInfo, _pathFunction,
 			_representorFunction);
 
@@ -300,7 +305,7 @@
 			return;
 		}
 
-		FieldsWriter<V, ?> fieldsWriter = optional.get();
+		FieldsWriter<S, ?> fieldsWriter = optional.get();
 
 		fieldsWriter.writeBooleanFields(
 			(field, value) ->
