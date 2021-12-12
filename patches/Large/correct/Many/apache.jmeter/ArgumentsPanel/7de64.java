diff --git a/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java b/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
index 5ceeacc..eee2e28 100644
--- a/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
+++ b/src/core/org/apache/jmeter/config/gui/ArgumentsPanel.java
@@ -680,7 +680,7 @@
     /**
      * Initialize the components and layout of this component.
      */
-    protected final void init() {
+    protected void init() {
         JPanel p = this;
 
         if (standalone) {
