diff --git a/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java b/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
index eee2e28..5ceeacc 100644
--- a/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
+++ b/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
@@ -680,7 +680,7 @@
     /**
      * Initialize the components and layout of this component.
      */
-    protected void init() {
+    protected final void init() {
         JPanel p = this;
 
         if (standalone) {
