diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/gui/HTTPArgumentsPanel.java b/src/protocol/http/org/apache/jmeter/protocol/http/gui/HTTPArgumentsPanel.java
index 46c7071..c668c32 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/gui/HTTPArgumentsPanel.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/gui/HTTPArgumentsPanel.java
@@ -47,7 +47,7 @@
 
     @Override
     protected void initializeTableModel(ObjectTableModel model) {
-        if(tableModel == null) {
+        if(model == null) {
             tableModel = new ObjectTableModel(new String[] {
                     ArgumentsPanel.COLUMN_RESOURCE_NAMES_0, ArgumentsPanel.COLUMN_RESOURCE_NAMES_1, ENCODE_OR_NOT, INCLUDE_EQUALS },
                     HTTPArgument.class,
