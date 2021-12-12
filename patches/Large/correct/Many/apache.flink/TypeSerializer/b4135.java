diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeSerializer.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeSerializer.java
index 34b1f94..8e0981b 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeSerializer.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeSerializer.java
@@ -30,14 +30,14 @@
  * 
  * @param T The data type that the serializer serializes.
  */
-public interface TypeSerializer<T>
+public abstract class TypeSerializer<T>
 {
 	/**
 	 * Creates a new instance of the data type.
 	 * 
 	 * @return A new instance of the data type.
 	 */
-	public T createInstance();
+	public abstract T createInstance();
 	
 	/**
 	 * Creates a copy from the given element.
@@ -45,7 +45,7 @@
 	 * @param from The element to copy.
 	 * @return A copy of the given element.
 	 */
-	public T createCopy(T from);
+	public abstract T createCopy(T from);
 	
 	/**
 	 * Creates a copy from the given element, storing the copied result in the given target element.
@@ -53,7 +53,7 @@
 	 * @param from The element to be copied.
 	 * @param to The target element.
 	 */
-	public void copyTo(T from, T to);
+	public abstract void copyTo(T from, T to);
 	
 	// --------------------------------------------------------------------------------------------
 	
@@ -62,7 +62,7 @@
 	 * 
 	 * @return The length of the data type, or <code>-1</code> for variable length data types.
 	 */
-	public int getLength();
+	public abstract int getLength();
 	
 	// --------------------------------------------------------------------------------------------
 
@@ -76,7 +76,7 @@
 	 * @throws IOException Thrown, if the serialization encountered an I/O related error. Typically raised by the
 	 *                     output view, which may have an underlying I/O channel to which it delegates.
 	 */
-	public void serialize(T record, DataOutputView target) throws IOException;
+	public abstract void serialize(T record, DataOutputView target) throws IOException;
 
 	/**
 	 * De-serializes a record from the given source input view into the given target record instance.
@@ -87,7 +87,7 @@
 	 * @throws IOException Thrown, if the de-serialization encountered an I/O related error. Typically raised by the
 	 *                     input view, which may have an underlying I/O channel from which it reads.
 	 */
-	public void deserialize(T target, DataInputView source) throws IOException;
+	public abstract void deserialize(T target, DataInputView source) throws IOException;
 	
 	/**
 	 * Copies exactly one record from the source input view to the target output view. Whether this operation
@@ -101,5 +101,5 @@
 	 * 
 	 * @throws IOException Thrown if any of the two views raises an exception.
 	 */
-	public void copy(DataInputView source, DataOutputView target) throws IOException;
+	public abstract void copy(DataInputView source, DataOutputView target) throws IOException;
 }
