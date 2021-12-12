diff --git a/src/org/apache/cassandra/db/SliceReadCommand.java b/src/org/apache/cassandra/db/SliceReadCommand.java
index cdc3b6c..04302a4 100644
--- a/src/org/apache/cassandra/db/SliceReadCommand.java
+++ b/src/org/apache/cassandra/db/SliceReadCommand.java
@@ -23,14 +23,16 @@
 
 public class SliceReadCommand extends ReadCommand
 {
-    public final String columnFamily;
+    /* for a slice of a standard column, cFC should only be the CF name.
+       for a supercolumn slice, it will be CF:supercolumn. */
+    public final String columnFamilyColumn;
     public final int start;
     public final int count;
 
-    public SliceReadCommand(String table, String key, String columnFamily, int start, int count)
+    public SliceReadCommand(String table, String key, String columnFamilyColumn, int start, int count)
     {
         super(table, key, CMD_TYPE_GET_SLICE);
-        this.columnFamily = columnFamily;
+        this.columnFamilyColumn = columnFamilyColumn;
         this.start = start;
         this.count = count;
     }
@@ -38,13 +40,13 @@
     @Override
     public String getColumnFamilyName()
     {
-        return columnFamily;
+        return RowMutation.getColumnAndColumnFamily(columnFamilyColumn)[0];
     }
 
     @Override
     public ReadCommand copy()
     {
-        ReadCommand readCommand= new SliceReadCommand(table, key, columnFamily, start, count);
+        ReadCommand readCommand = new SliceReadCommand(table, key, columnFamilyColumn, start, count);
         readCommand.setDigestQuery(isDigestQuery());
         return readCommand;
     }
@@ -52,7 +54,7 @@
     @Override
     public Row getRow(Table table) throws IOException
     {
-        return table.getRow(key, columnFamily, start, count);
+        return table.getRow(key, columnFamilyColumn, start, count);
     }
 
     @Override
@@ -61,7 +63,7 @@
         return "GetSliceReadMessage(" +
                "table='" + table + '\'' +
                ", key='" + key + '\'' +
-               ", columnFamily='" + columnFamily + '\'' +
+               ", columnFamily='" + columnFamilyColumn + '\'' +
                ", start='" + start + '\'' +
                ", count='" + count + '\'' +
                ')';
@@ -77,7 +79,7 @@
         dos.writeBoolean(realRM.isDigestQuery());
         dos.writeUTF(realRM.table);
         dos.writeUTF(realRM.key);
-        dos.writeUTF(realRM.columnFamily);
+        dos.writeUTF(realRM.columnFamilyColumn);
         dos.writeInt(realRM.start);
         dos.writeInt(realRM.count);
     }
