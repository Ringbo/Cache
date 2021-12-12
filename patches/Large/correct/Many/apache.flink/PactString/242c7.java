diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/base/PactString.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/base/PactString.java
index c550a33..f4793ae 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/base/PactString.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/base/PactString.java
@@ -457,7 +457,7 @@
 	public Appendable append(CharSequence csq, int start, int end) {
 		final int otherLen = end - start;
 		grow(this.len + otherLen);
-		for (int pos = start; pos < len; pos++)
+		for (int pos = start; pos < end; pos++)
 			this.value[this.len + pos] = csq.charAt(pos);
 		this.len += otherLen;
 		return this;
