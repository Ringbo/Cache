diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
index 19cb2d4..a1ad345 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
@@ -235,7 +235,7 @@
 		}
 		
 		// deserialize
-		deserialize(field, offset, limit);
+		deserialize(field, offset, limit, fieldNum);
 		return field;
 	}
 	
@@ -271,7 +271,7 @@
 		}
 		
 		final int limit = offset + this.lengths[fieldNum];
-		deserialize(target, offset, limit);
+		deserialize(target, offset, limit, fieldNum);
 		return target;
 	}
 	
@@ -303,7 +303,7 @@
 		}
 		
 		final int limit = offset + this.lengths[fieldNum];
-		deserialize(target, offset, limit);
+		deserialize(target, offset, limit, fieldNum);
 		return true;
 	}
 	
@@ -331,7 +331,7 @@
 	 * @param offset The offset in the binary string.
 	 * @param limit The limit in the binary string.
 	 */
-	private final <T extends Value> void deserialize(T target, int offset, int limit)
+	private final <T extends Value> void deserialize(T target, int offset, int limit, int fieldNumber)
 	{
 		if (this.serializer == null) {
 			this.serializer = new InternalDeSerializer();
@@ -344,7 +344,7 @@
 			target.read(serializer);
 		}
 		catch (Exception e) {
-			throw new DeserializationException(e);
+			throw new DeserializationException("Error reading field " + fieldNumber + " as " + target.getClass().getName(), e);
 		}
 	}
 	
