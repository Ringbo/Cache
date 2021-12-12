diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeComparator.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeComparator.java
index a454210..d10e584 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeComparator.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypeComparator.java
@@ -43,7 +43,7 @@
  * 
  * @param T The data type that the comparator works on.
  */
-public interface TypeComparator<T>
+public abstract class TypeComparator<T>
 {	
 	/**
 	 * Computes a hash value for the given record. The hash value should include all fields in the record
@@ -61,7 +61,7 @@
 	 * 
 	 * @see java.lang.Object#hashCode()
 	 */
-	public int hash(T record);
+	public abstract int hash(T record);
 	
 	/**
 	 * Sets the given element as the comparison reference for future calls to
@@ -88,7 +88,7 @@
 	 * 
 	 * @param toCompare The element to set as the comparison reference.
 	 */
-	public void setReference(T toCompare);
+	public abstract void setReference(T toCompare);
 	
 	/**
 	 * Checks, whether the given element is equal to the element that has been set as the comparison
@@ -99,7 +99,7 @@
 	 * 
 	 * @see #setReference(Object)
 	 */
-	public boolean equalToReference(T candidate);
+	public abstract boolean equalToReference(T candidate);
 	
 	/**
 	 * This method compares the element that has been set as reference in this type accessor, to the
@@ -136,7 +136,7 @@
 	 * 
 	 * @see #setReference(Object)
 	 */
-	public int compareToReference(TypeComparator<T> referencedComparator);
+	public abstract int compareToReference(TypeComparator<T> referencedComparator);
 	
 	/**
 	 * Compares two records in serialized from. The return value indicates the order of the two in the same way
@@ -151,7 +151,7 @@
 	 * 
 	 *  @see java.util.Comparator#compare(Object, Object)
 	 */
-	public int compare(DataInputView firstSource, DataInputView secondSource) throws IOException;
+	public abstract int compare(DataInputView firstSource, DataInputView secondSource) throws IOException;
 	
 	// --------------------------------------------------------------------------------------------
 	
@@ -160,7 +160,7 @@
 	 * 
 	 * @return True, if the data type supports the creation of a normalized key for comparison, false otherwise.
 	 */
-	public boolean supportsNormalizedKey();
+	public abstract boolean supportsNormalizedKey();
 	
 	/**
 	 * Check whether this comparator supports to serialize the record in a format that replaces its keys by a normalized
@@ -168,7 +168,7 @@
 	 * 
 	 * @return True, if the comparator supports that specific form of serialization, false if not.
 	 */
-	public boolean supportsSerializationWithKeyNormalization();
+	public abstract boolean supportsSerializationWithKeyNormalization();
 
 	/**
 	 * Gets the number of bytes that the normalized key would maximally take. A value of
@@ -176,7 +176,7 @@
 	 * 
 	 * @return The number of bytes that the normalized key would maximally take.
 	 */
-	public int getNormalizeKeyLen();
+	public abstract int getNormalizeKeyLen();
 	
 	/**
 	 * Checks, whether the given number of bytes for a normalized suffice to determine the order of elements
@@ -187,7 +187,7 @@
 	 * @return True, if the given number of bytes for a normalized suffice to determine the order of elements,
 	 *         false otherwise.
 	 */
-	public boolean isNormalizedKeyPrefixOnly(int keyBytes);
+	public abstract boolean isNormalizedKeyPrefixOnly(int keyBytes);
 	
 	/**
 	 * Writes a normalized key for the given record into the target byte array, starting at the specified position
@@ -210,7 +210,7 @@
 	 * 
 	 * @see NormalizableKey#copyNormalizedKey(byte[], int, int)
 	 */
-	public void putNormalizedKey(T record, byte[] target, int offset, int numBytes);
+	public abstract void putNormalizedKey(T record, byte[] target, int offset, int numBytes);
 
 	/**
 	 * Writes the record in such a fashion that all keys are normalizing and at the beginning of the serialized data.
@@ -224,7 +224,7 @@
 	 * @see #readWithKeyDenormalization(Object, DataInputView)
 	 * @see NormalizableKey#copyNormalizedKey(byte[], int, int)
 	 */
-	public void writeWithKeyNormalization(T record, DataOutputView target) throws IOException;
+	public abstract void writeWithKeyNormalization(T record, DataOutputView target) throws IOException;
 	
 	/**
 	 * Reads the record back while de-normalizing the key fields. This must only be used when
@@ -238,7 +238,7 @@
 	 * @see #writeWithKeyNormalization(Object, DataOutputView)
 	 * @see NormalizableKey#copyNormalizedKey(byte[], int, int)
 	 */
-	public void readWithKeyDenormalization(T record, DataInputView source) throws IOException;
+	public abstract void readWithKeyDenormalization(T record, DataInputView source) throws IOException;
 
 	/**
 	 * Flag whether normalized key comparisons should be inverted key should be interpreted
@@ -247,7 +247,7 @@
 	 * @return True, if all normalized key comparisons should invert the sign of the comparison result,
 	 *         false if the normalized key should be used as is.
 	 */
-	public boolean invertNormalizedKey();
+	public abstract boolean invertNormalizedKey();
 	
 	// --------------------------------------------------------------------------------------------
 	
@@ -257,5 +257,5 @@
 	 * 
 	 * @return A deep copy of this comparator instance.
 	 */
-	public TypeComparator<T> duplicate();
+	public abstract TypeComparator<T> duplicate();
 }
