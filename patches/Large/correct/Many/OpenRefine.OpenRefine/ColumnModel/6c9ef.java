diff --git a/src/main/java/com/metaweb/gridworks/model/ColumnModel.java b/src/main/java/com/metaweb/gridworks/model/ColumnModel.java
index aae16af..e3b9b95 100644
--- a/src/main/java/com/metaweb/gridworks/model/ColumnModel.java
+++ b/src/main/java/com/metaweb/gridworks/model/ColumnModel.java
@@ -34,7 +34,7 @@
         internalInitialize();
     }
     
-    public void setMaxCellIndex(int maxCellIndex) {
+    synchronized public void setMaxCellIndex(int maxCellIndex) {
         this._maxCellIndex = Math.max(this._maxCellIndex, maxCellIndex);
     }
 
@@ -42,7 +42,7 @@
         return _maxCellIndex;
     }
 
-    public int allocateNewCellIndex() {
+    synchronized public int allocateNewCellIndex() {
         return ++_maxCellIndex;
     }
     
@@ -55,7 +55,7 @@
         return _keyColumnIndex;
     }
     
-    public void addColumnGroup(int startColumnIndex, int span, int keyColumnIndex) {
+    synchronized public void addColumnGroup(int startColumnIndex, int span, int keyColumnIndex) {
         for (ColumnGroup g : columnGroups) {
             if (g.startColumnIndex == startColumnIndex && g.columnSpan == span) {
                 if (g.keyColumnIndex == keyColumnIndex) {
@@ -102,11 +102,11 @@
 		_nameToColumn.put(name, column); // so the next call can check
     }
     
-    public Column getColumnByName(String name) {
+    synchronized public Column getColumnByName(String name) {
         return _nameToColumn.get(name);
     }
     
-    public int getColumnIndexByName(String name) {
+    synchronized public int getColumnIndexByName(String name) {
         for (int i = 0; i < _columnNames.size(); i++) {
             String s = _columnNames.get(i);
             if (name.equals(s)) {
@@ -116,15 +116,15 @@
         return -1;
     }
     
-    public Column getColumnByCellIndex(int cellIndex) {
+    synchronized public Column getColumnByCellIndex(int cellIndex) {
         return _cellIndexToColumn.get(cellIndex);
     }
     
-    public List<String> getColumnNames() {
+    synchronized public List<String> getColumnNames() {
         return _columnNames;
     }
 
-    public void write(JSONWriter writer, Properties options)
+    synchronized public void write(JSONWriter writer, Properties options)
             throws JSONException {
         
         writer.object();
@@ -153,7 +153,7 @@
         writer.endObject();
     }
     
-    public void save(Writer writer, Properties options) throws IOException {
+    synchronized public void save(Writer writer, Properties options) throws IOException {
         writer.write("maxCellIndex="); writer.write(Integer.toString(_maxCellIndex)); writer.write('\n');
         writer.write("keyColumnIndex="); writer.write(Integer.toString(_keyColumnIndex)); writer.write('\n');
 
@@ -170,7 +170,7 @@
         writer.write("/e/\n");
     }
 
-    public void load(LineNumberReader reader) throws Exception {
+    synchronized public void load(LineNumberReader reader) throws Exception {
         String line;
         while ((line = reader.readLine()) != null && !"/e/".equals(line)) {
             int equal = line.indexOf('=');
@@ -199,7 +199,7 @@
         internalInitialize();
     }
     
-    protected void internalInitialize() {
+    synchronized protected void internalInitialize() {
         generateMaps();
         
         // Turn the flat list of column groups into a tree
