diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypePairComparator.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypePairComparator.java
index 38b6581..a271c6a 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypePairComparator.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/generic/types/TypePairComparator.java
@@ -28,14 +28,14 @@
  * @param <T1> The class of the first data type.
  * @param <T2> The class of the second data type. 
  */
-public interface TypePairComparator<T1, T2>
+public abstract class TypePairComparator<T1, T2>
 {
 	/**
 	 * Sets the reference for comparisons.
 	 * 
 	 * @param reference The reference instance.
 	 */
-	public void setReference(T1 reference);
+	public abstract void setReference(T1 reference);
 	
 	/**
 	 * Checks, whether the given candidate instance is equal to the reference instance, with respect
@@ -44,7 +44,7 @@
 	 * @param candidate The candidate to check.
 	 * @return True, if the candidate is equal to the reference, false otherwise.
 	 */
-	public boolean equalToReference(T2 candidate);
+	public abstract boolean equalToReference(T2 candidate);
 	
-	public int compareToReference(T2 candidate);
+	public abstract int compareToReference(T2 candidate);
 }
