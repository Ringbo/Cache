diff --git a/src/main/java/com/metaweb/gridworks/history/History.java b/src/main/java/com/metaweb/gridworks/history/History.java
index 2272765..bc600bd 100644
--- a/src/main/java/com/metaweb/gridworks/history/History.java
+++ b/src/main/java/com/metaweb/gridworks/history/History.java
@@ -89,7 +89,7 @@
         _futureEntries = new ArrayList<HistoryEntry>();
     }
     
-    public void addEntry(HistoryEntry entry) {
+    synchronized public void addEntry(HistoryEntry entry) {
         entry.apply(ProjectManager.singleton.getProject(_projectID));
         _pastEntries.add(entry);
         
@@ -113,7 +113,7 @@
         ProjectManager.singleton.getProjectMetadata(_projectID).updateModified();
     }
     
-    public List<HistoryEntry> getLastPastEntries(int count) {
+    synchronized public List<HistoryEntry> getLastPastEntries(int count) {
         if (count <= 0) {
             return new LinkedList<HistoryEntry>(_pastEntries);
         } else {
@@ -121,7 +121,7 @@
         }
     }
     
-    public void undoRedo(long lastDoneEntryID) {
+    synchronized public void undoRedo(long lastDoneEntryID) {
         if (lastDoneEntryID == 0) {
             // undo all the way back to the start of the project
             undo(_pastEntries.size());
@@ -142,7 +142,7 @@
         }
     }
     
-    public long getPrecedingEntryID(long entryID) {
+    synchronized public long getPrecedingEntryID(long entryID) {
         if (entryID == 0) {
             return -1;
         } else {
@@ -214,7 +214,7 @@
         }
     }
     
-    public void write(JSONWriter writer, Properties options)
+    synchronized public void write(JSONWriter writer, Properties options)
             throws JSONException {
         
         writer.object();
@@ -234,7 +234,7 @@
         writer.endObject();
     }
     
-    public void save(Writer writer, Properties options) throws IOException {
+    synchronized public void save(Writer writer, Properties options) throws IOException {
         writer.write("pastEntryCount="); writer.write(Integer.toString(_pastEntries.size())); writer.write('\n');
         for (HistoryEntry entry : _pastEntries) {
             entry.save(writer, options); writer.write('\n');
@@ -248,7 +248,7 @@
         writer.write("/e/\n");
     }
     
-    public void load(Project project, LineNumberReader reader) throws Exception {
+    synchronized public void load(Project project, LineNumberReader reader) throws Exception {
         String line;
         while ((line = reader.readLine()) != null && !"/e/".equals(line)) {
             int equal = line.indexOf('=');
