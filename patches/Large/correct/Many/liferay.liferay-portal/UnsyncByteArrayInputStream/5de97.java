diff --git a/portal-kernel/src/com/liferay/portal/kernel/io/unsync/UnsyncByteArrayInputStream.java b/portal-kernel/src/com/liferay/portal/kernel/io/unsync/UnsyncByteArrayInputStream.java
index 294ba06..c131dba 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/io/unsync/UnsyncByteArrayInputStream.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/io/unsync/UnsyncByteArrayInputStream.java
@@ -44,7 +44,7 @@
 	public UnsyncByteArrayInputStream(byte[] buffer, int offset, int length) {
 		this.buffer = buffer;
 		this.index = offset;
-		this.capacity = Math.max(buffer.length, offset + length);
+		this.capacity = Math.min(buffer.length, offset + length);
 		this.markIndex = offset;
 	}
 
