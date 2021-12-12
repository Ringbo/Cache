diff --git a/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/mapr/db/json/MaprDBJsonRecordReader.java b/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/mapr/db/json/MaprDBJsonRecordReader.java
index 9bb7daa..ee6b15d 100644
--- a/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/mapr/db/json/MaprDBJsonRecordReader.java
+++ b/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/mapr/db/json/MaprDBJsonRecordReader.java
@@ -322,7 +322,7 @@
 
   private void writeTime(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, reader.getTime().toTimeStr(), fieldName);
+      writeString(writer, fieldName, reader.getTime().toTimeStr());
     } else {
       ((writer.map != null) ? writer.map.time(fieldName) : writer.list.time()).writeTime(reader.getTimeInt());
     }
@@ -330,7 +330,7 @@
 
   private void writeDate(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, reader.getDate().toDateStr(), fieldName);
+      writeString(writer, fieldName, reader.getDate().toDateStr());
     } else {
       long milliSecondsSinceEpoch = reader.getDateInt() * MILLISECONDS_IN_A_DAY;
       ((writer.map != null) ? writer.map.date(fieldName) : writer.list.date()).writeDate(milliSecondsSinceEpoch);
@@ -339,7 +339,7 @@
 
   private void writeDouble(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getDouble()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getDouble()));
     } else {
       writer.float8(fieldName).writeFloat8(reader.getDouble());
     }
@@ -347,7 +347,7 @@
 
   private void writeFloat(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getFloat()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getFloat()));
     } else if (readNumbersAsDouble) {
       writer.float8(fieldName).writeFloat8(reader.getFloat());
     } else {
@@ -357,7 +357,7 @@
 
   private void writeLong(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getLong()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getLong()));
     } else if (readNumbersAsDouble) {
       writer.float8(fieldName).writeFloat8(reader.getLong());
     } else {
@@ -367,7 +367,7 @@
 
   private void writeInt(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getInt()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getInt()));
     } else if (readNumbersAsDouble) {
       writer.float8(fieldName).writeFloat8(reader.getInt());
     } else {
@@ -377,7 +377,7 @@
 
   private void writeShort(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getShort()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getShort()));
     } else if (readNumbersAsDouble) {
       writer.float8(fieldName).writeFloat8(reader.getShort());
     } else {
@@ -387,7 +387,7 @@
 
   private void writeByte(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getByte()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getByte()));
     } else if (readNumbersAsDouble) {
       writer.float8(fieldName).writeFloat8(reader.getByte());
     } else {
@@ -397,7 +397,7 @@
 
   private void writeBoolean(MapOrListWriterImpl writer, String fieldName, DBDocumentReaderBase reader) {
     if (allTextMode) {
-      writeString(writer, String.valueOf(reader.getBoolean()), fieldName);
+      writeString(writer, fieldName, String.valueOf(reader.getBoolean()));
     } else {
       writer.bit(fieldName).writeBit(reader.getBoolean() ? 1 : 0);
     }
